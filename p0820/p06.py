import requests
from bs4 import BeautifulSoup
url = "https://novel.naver.com/webnovel/weekday"
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
res = requests.get(url, headers=headers)
res.raise_for_status()
soup = BeautifulSoup(res.text, "lxml")  

rankAll = soup.find("ul",{"class":"ranking_list"})
novels = rankAll.find_all("li")
# print(novels[0].find("span",{"class":"title"}).get_text()  )
for i in range(len(novels)):
    print("{:2d}위 : {}".format(i+1,novels[i].find("span",{"class":"title"}).get_text())  )
    print("바로가기 링크 : ", "https://novel.naver.com"+novels[i].a["href"] )
    # img 주소 출력하기 
    print("이미지 링크 : ", novels[i].img["src"])
    # 관심 숫자 가져오기 
    print("관심 : ",novels[i].find("span",{"class":"count"}).span.get_text()  )

# p07.py 에 1-15위까지 출력은 어떻게 해야할까요? hint : 중첩 for문 
# ntitle = []  nurl=[] 