import requests
from bs4 import BeautifulSoup
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}

title =[]
rate = []
for page in range(1,6):
    url = "https://series.naver.com/novel/top100List.series?rankingTypeCode=DAILY&categoryCode=ALL&page="+str(page)
    res = requests.get(url, headers=headers)
    res.raise_for_status()
    soup = BeautifulSoup(res.text, "lxml")  
    # print(soup.prettify())
    listAll = soup.find("ul",{"class":"comic_top_lst"})
    # print(listAll)
    listN = listAll.find_all('li')
   
    for i in range ( len(listN) ):
        # print(listN[i].h3.a.get_text())
        # print(listN[i].find("em",{"class":"score_num"}).get_text())
        title.append(listN[i].h3.a.get_text())
        rate.append(float(listN[i].find("em",{"class":"score_num"}).get_text()))


for i in range(len(title)):
    print("{}위 : {} - {:.1f}".format(i+1, title[i], rate[i]))




# 평균 평점 ??

sum = 0 
for r in rate: # 간단 for문
    sum += r
print("평균 평점 : ", sum/len(rate)) # java : 배열.length()   python: len(배열)
