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
url = "https://flight.naver.com/flights/domestic/GMP-CJU-20241005/CJU-GMP-20241012?adult=1&fareType=YC"
# 크롬드라이버 생성
browser = webdriver.Chrome(options) 
browser.implicitly_wait(3)  # 페이지 로딩이 완료될때 까지 기다리는 코드 
browser.maximize_window()  # 최대화면으로 만들기 
browser.get(url) # 사이트 접속하기

# webdriverwait를 통해서 브라우저를 최대 10초동안 기다린다. 
WebDriverWait(browser,10).until(EC.presence_of_all_elements_located((By.ID,'__next')))
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
    
time.sleep(5)

page_url = browser.page_source
soup = BeautifulSoup(page_url,'lxml')
time.sleep(3)
# with open('flight.html','w',encoding='utf-8') as f:
#     f.write(str(soup.prettify()))

# 항공사 이름, 출발시간, 도착시간, 요금  > 배열로 만들어서 [항공사, 출발, 도착, 요금 ] > 출력
flights = soup.find('div',{'class':'domestic_results__gp5WB'}).find_all('div',{'class':'domestic_Flight__8bR_b'})
print(len(flights))
flight_name = flights[0].find('b',{'class':'airline_name__0Tw5w'}).get_text() #에어서울
flight_time = flights[0].find_all('b',{'class':'route_time__xWu7a'})
depart_time = flight_time[0].get_text()
arr_time = flight_time[1].get_text()
flight_fair = flights[0].find('i',{'class':'domestic_num__ShOub'}).get_text()
farr = [flight_name,depart_time,arr_time,flight_fair]
print(farr)
