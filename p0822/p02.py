from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time # 대기시간 사용을 위함. 
import random # 랜덤 시간을 위함 
from bs4 import BeautifulSoup
# 브라우저 꺼짐 방지 옵션
options = webdriver.ChromeOptions()
options.add_experimental_option('detach',False)
userAgent="user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36"
options.add_argument(userAgent)
url = "https://www.melon.com/chart/index.htm"
# 크롬드라이버 생성
browser = webdriver.Chrome(options) 
# 페이지 로딩이 완료될때 까지 기다리는 코드 
browser.implicitly_wait(3)
# 사이트 접속하기
browser.get(url=url)

# 현재 페이지 정보를 가져오기 
page_url = browser.page_source
soup = BeautifulSoup(page_url,'lxml')
charts = soup.find('tbody').find_all('tr',{'id':'lst50'})
for i in range(len(charts)): # 1 - 50 위 출력
    print(i+1,"위")
    print(charts[i].find('div',{'class':'ellipsis rank01'}).get_text().strip())
    print(charts[i].find('div',{'class':'ellipsis rank02'}).get_text().strip())
    print(charts[i].find('div',{'class':'ellipsis rank03'}).get_text().strip())
    print(charts[i].find('span',{'class':'cnt'}).get_text())



