import requests
from bs4 import BeautifulSoup
from urllib.request import Request, urlopen
import oracleCon as oc

headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
url = 'https://www.gmarket.co.kr/n/best'

req = Request(url, headers=headers)
webpage = urlopen(req).read()

soup = BeautifulSoup(webpage, "lxml")  
# print(soup)

# 이름과 가격을 가져오기 

bul = soup.find('ul',{'class':'list__best'})
items = bul.find_all('li')

# name = items[0].img['alt']
# price_str = items[0].find('div',{'class':'box__price-seller'}).span.find_next_sibling("span").get_text()
# # 15900 > 숫자가 필요함 
# price = int(price_str.replace(",",""))
# print(name,price)

for i in range (len(items)):
    glist = []
    name = items[i].img['alt']
    price_str = items[i].find('div',{'class':'box__price-seller'}).span.find_next_sibling("span").get_text()
    price = int(price_str.replace(",",""))
    glist.append(name)
    glist.append(price)
    
    oc.insertDB(glist)

    print("{}:{}".format(name, price))
