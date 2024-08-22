from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time # 대기시간 사용을 위함. 
import random # 랜덤 시간을 위함 
from bs4 import BeautifulSoup
# 옵션 설정
options = Options() # webdriver.ChromeOptions()
options.add_experimental_option('detach',False)  
userAgent="user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36"
options.add_argument(userAgent)
url = "https://www.yanolja.com/"
# 크롬드라이버 생성
browser = webdriver.Chrome(options) 
browser.implicitly_wait(3)  # 페이지 로딩이 완료될때 까지 기다리는 코드 
browser.maximize_window()  # 최대화면으로 만들기 
browser.get(url) # 사이트 접속하기
####################################################################################
# 야놀자에서 제주도를 검색해서 스크롤을 다 내려서 [호텔명, 평점, 링크] 를 n개 다 출력해보세요 
# 메인페이지에서 검색창 클릭 
elem = browser.find_element(By.XPATH, '//*[@id="__next"]/div/div[3]/header/section/a[2]/div/div')
elem.click()
time.sleep(random.uniform(1,3))
# 청송 검색어 입력 
elem = browser.find_element(By.XPATH, '//*[@id="__next"]/div/main/div/div[1]/form/div/div[1]/div/input')
elem.send_keys('청송')
elem.send_keys(Keys.ENTER)
time.sleep(random.uniform(2,5))

# 자동스크롤 다운 
time.sleep(5)
# 자동스크롤을 해주어야함. - 자바스크립트 사용
prev_height = browser.execute_script("return document.body.scrollHeight")
print("prev_height", prev_height)
# 무한반복 
while True:
    # 자바스크립트 - 스크롤을 아래방향으로 이동시켜줌. 
    browser.execute_script("window.scrollTo(0, document.body.scrollHeight)")
    # 페이지가 열리는 시간동안 대기
    time.sleep(2)
    # 변경후(스크롤 내린 후) 높이를 저장 
    curr_height = browser.execute_script("return document.body.scrollHeight")
    if prev_height == curr_height:
        break # 스크롤의 크기가 더이상 변경이 없을 시 종료 
    prev_height = curr_height
time.sleep(3)
page_url = browser.page_source
soup = BeautifulSoup(page_url,'lxml')
time.sleep(3)
# print(soup.prettify())

hotels = soup.find_all('div',{'class':'PlaceListItemText_container__fUIgA text-unit'})

hotel_name = hotels[0].find('strong',{'class':'PlaceListTitle_text__2511B'})
hotel_rate = hotels[0].find('span',{'class':'PlaceListScore_rating__3Glxf'})
hotel_link = hotels[0].a

print(hotel_name.get_text()) # 소노벨 청송
print(hotel_rate.get_text()) #4.7
print(hotel_link['href']) # /hotel/3009871?srpKeyword=%EC%B2%AD%EC%86%A1
allHotel = []
for i in range(len(hotels)):
    hotelArr = []
    hotel_name = hotels[i].find('strong',{'class':'PlaceListTitle_text__2511B'})
    hotel_rate = hotels[i].find('span',{'class':'PlaceListScore_rating__3Glxf'})
    hotel_link = hotels[i].a
    if hotel_name:
        hotelArr.append(hotel_name.get_text())
    if hotel_rate:
        hotelArr.append(hotel_rate.get_text())
    else:
        hotelArr.append("")
    if hotel_link:
        hotelArr.append("https://www.yanolja.com"+hotel_link['href'])
    else:
        hotelArr.append("")
    allHotel.append(hotelArr)
    print(hotelArr)