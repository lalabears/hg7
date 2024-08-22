# 멜론 > 멜론 차트에서 
# 1위부터 50위까지 곡들의 제목, 가수, 앨범, 좋아요 수 가져오기
#   id: lst50
import requests
from bs4 import BeautifulSoup
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
url = 'https://www.melon.com/chart/index.htm'
res = requests.get(url, headers=headers)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")  
charts = soup.find('tbody').find_all('tr',{'id':'lst50'})
print(charts[0].find('div',{'class':'ellipsis rank01'}).get_text().strip())
print(charts[0].find('div',{'class':'ellipsis rank02'}).get_text().strip())
print(charts[0].find('div',{'class':'ellipsis rank03'}).get_text().strip())
print(charts[0].find('span',{'class':'cnt'}).get_text())
