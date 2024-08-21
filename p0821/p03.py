import requests
from bs4 import BeautifulSoup
import re
import movie_Oracle as mo
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
for year in range (2015, 2024):
    url = 'https://search.daum.net/search?w=tot&q='+str(year)+'%EB%85%84%EC%98%81%ED%99%94%EC%88%9C%EC%9C%84&DA=MOR&rtmaxcoll=MOR'
    res = requests.get(url, headers=headers)
    res.raise_for_status()
    soup = BeautifulSoup(res.text, "lxml")  
    movies = soup.find_all("c-doc")
    for i in range(len(movies)):
        mlist = []
        movie_title = movies[i].find("c-title").string.strip()
        movie_cnt_string = movies[i].find("c-contents-desc").string.strip()
        movie_cnt = re.sub(r'[^0-9]','',movie_cnt_string) # 정규식으로 숫자만 가져오기 
        movie_date = movies[0].find("c-contents-desc-sub").string.strip()[:-1]
        m_date = movie_date.replace(".","-") +" 00:00:00" #  2023.11.22 > 2023-11-22
        # 2023-11-23 00:00:00 
        print("제목:{}, 관객 {}만명 개봉일:{}".format(movie_title,movie_cnt,m_date))
        mlist.append(movie_title)
        mlist.append(movie_cnt)
        mlist.append(m_date)
        mo.insertDB(mlist)

# 새로운 movie_Oracle.py를 만들어서 
# dmovie 테이블 만들어서 
# insert 해보기 








# 파일 저장 
# with open("daum.html", "w", encoding="utf-8") as f:
#     f.write(res.text)