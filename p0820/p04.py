import requests
from bs4 import BeautifulSoup
url = "https://novel.naver.com/webnovel/weekday"
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
res = requests.get(url, headers=headers)
res.raise_for_status()
# text를 lxml파싱해서 soup에 담음. 
soup = BeautifulSoup(res.text, "lxml")  
# print(soup) # 전체 html 코드를 출력해줌 

print("title : " , soup.title) # <title>네이버웹소설</title>
print("title -txt : " , soup.title.get_text())

print("soup - a : ", soup.a ) #  <a href="#lnb"><span>메인 메뉴로 바로가기</span></a>
print("soup - a txt : ", soup.a.get_text() )
print("a attr(속성) : ", soup.a.attrs) # a attr :  {'href': '#lnb'}
print("a href :", soup.a["href"]) #   #lnb

print("div : ", soup.div)
print("div attr ", soup.div.attrs) # {'id': 'wrap', 'class': []}
print("div id : ", soup.div["id"])

print("div id = integrationRaking ", soup.find("div", attrs={"id":"integrationRaking"}))
