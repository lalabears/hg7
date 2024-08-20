# p07.py 에 1-15위까지 출력은 어떻게 해야할까요? hint : 중첩 for문 
# ntitle = []  nurl=[] 
import requests
from bs4 import BeautifulSoup
url = "https://novel.naver.com/webnovel/weekday"
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
res = requests.get(url, headers=headers)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")  
# list 변수 선언
ntitle = []
nurl = []
nimg = []
nlike = [] 
# soup으로 data 가져오기 
rankDiv = soup.find("div",{"id":"integrationRaking"})
rankAll = rankDiv.find_all("ul",{"class":"ranking_list"})
# novels = rankAll.find_all("li")
for i in range (len(rankAll)):
    novels = rankAll[i].find_all("li")
    for j in range(len(novels)):
        ntitle.append( novels[j].find("span",{"class":"title"}).get_text()  )
        nurl.append( novels[i].a["href"])
        nimg.append( novels[i].img["src"] )
        nlike.append ( novels[i].find("span",{"class":"count"}).span.get_text() )
        
print(ntitle)
print(nurl)
print(nimg)
print(nlike)



