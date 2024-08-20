# 네이버 뉴스 관심 분야 항목에가서 
# 헤드라인 뉴스 5개 제목, 링크를 배열에 넣어서 출력해보세요 
import requests
from bs4 import BeautifulSoup
url = "https://news.naver.com/section/105"
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
res = requests.get(url, headers=headers)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")  
# list 변수 선언
ntitle=[]
nlink=[]

newsList = soup.find("ul",{"class":"sa_list"})
news = newsList.find_all("li")
print(news[0].find("strong",{"class":"sa_text_strong"}).get_text())
print(news[0].a["href"])

for i in range(len(news)):
    ntitle.append(news[i].find("strong",{"class":"sa_text_strong"}).get_text())
    nlink.append(news[i].a["href"])
    

for i in range(len(ntitle)):
    print("{:02d}위 제목: {}\n링크: {}".format(i+1, ntitle[i],nlink[i]))

