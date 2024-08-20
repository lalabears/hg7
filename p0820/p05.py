import requests
from bs4 import BeautifulSoup
url = "https://novel.naver.com/webnovel/weekday"
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
res = requests.get(url, headers=headers)
res.raise_for_status()
# text를 lxml파싱해서 soup에 담음. 
soup = BeautifulSoup(res.text, "lxml")  

# # 네이버 소설 1위 출력하기 
# print(soup.find("li",{"class":"item"}))
# print(soup.find("li",{"class":"item"}).get_text())
# # 1위 링크 가져오기 
# print(soup.find("li",{"class":"item"}).a["href"]) # /webnovel/list?novelId=1145135
# # 제목만 가져오기 
# print(soup.find("span",{"class":"title"})) # <span class="title">선 넘는 결혼 생활</span>
# print(soup.find("span",{"class":"title"}).get_text())

nurl = "https://novel.naver.com" + soup.find("li",{"class":"item"}).a["href"]
ntitle = soup.find("span",{"class":"title"}).get_text()

print("1위 {}".format(ntitle))
print("바로가기 링크 : ", nurl)
