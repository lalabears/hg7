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
url = "https://www.daum.net"
# 크롬드라이버 생성
browser = webdriver.Chrome(options) 
# 페이지 로딩이 완료될때 까지 기다리는 코드 
browser.implicitly_wait(3)
# 사이트 접속하기
browser.get(url)
elem = browser.find_element(By.ID, 'q')
time.sleep(random.uniform(1,3)) # 1-3초 사이 랜덤한 초 멈춤 
elem.send_keys("부동산")
time.sleep(random.uniform(1,3))
elem.send_keys(Keys.ENTER)
time.sleep(5)
elem = browser.find_element(By.LINK_TEXT, 'Daum 부동산')
elem.click()
time.sleep(random.uniform(1,3))
# 탭전환
browser.switch_to.window(browser.window_handles[1])
page_url = browser.page_source
soup = BeautifulSoup(page_url,'lxml')
# with open('daum.html','w',encoding='utf-8') as f:
#     f.write(str(soup))

print(soup)