from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time # 대기시간 사용을 위함. 
import random # 랜덤 시간을 위함 
from bs4 import BeautifulSoup
# 옵션 설정
options = Options() # webdriver.ChromeOptions()
options.add_experimental_option('detach',True)  # 브라우저 꺼짐 방지 옵션
userAgent="user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36"
options.add_argument(userAgent)
url = "https://www.naver.com"
# 크롬드라이버 생성
browser = webdriver.Chrome(options) 
# 페이지 로딩이 완료될때 까지 기다리는 코드 
browser.implicitly_wait(3)
# 사이트 접속하기
browser.get(url)
#######################################################################
# 시가총액 검색 
elem = browser.find_element(By.ID,'query')
elem.send_keys('시가총액')
elem.send_keys(Keys.ENTER)
time.sleep(3)
elem = browser.find_element(By.PARTIAL_LINK_TEXT, "시가총액 상위종목 더보기")
elem.send_keys(Keys.ENTER)
time.sleep(3)
# 탭 전환하기 
first_tab = browser.window_handles[0]
next_tab = browser.window_handles[1]
browser.switch_to.window(next_tab)
# 페이지 저장하기 
page_url = browser.page_source
soup = BeautifulSoup(page_url,'lxml')
# 1위부터 5위까지 종목명, 현재가 출력하기 
table = soup.find("table",{"class":"type_2"})
trs_all = table.tbody.find_all('tr')
for i in range(6):
    td = trs_all[i].find('td',{'class':'no'})
    if td:
        print(td.find_next_siblings("td")[0].get_text())
        print(td.find_next_siblings("td")[1].get_text().strip())

