import requests
from bs4 import BeautifulSoup
import gal_orcale as go
headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
base_url = 'http://apis.data.go.kr/B551011/PhotoGalleryService1'
url = '/galleryList1'
# 본인 서비스키에 decoding부분
serviceKey = ''

for page in range(1,6):
    params = {
        'serviceKey' :serviceKey,
        'pageNo' : page,
        'numOfRows' : 10,
        'MobileOS':'ETC',
        'MobileApp':'AppTest',
        'arrange':'A'
    }
    res = requests.get(base_url+url, headers=headers, params=params, verify=False)
    res.raise_for_status()
    soup = BeautifulSoup(res.text, "xml")  
    # print(soup.prettify())
    items = soup.body.items.find_all("item")
    for i in range(len(items)):
        gal = []
        gal.append(items[i].galContentId.get_text() )
        gal.append(items[i].galContentTypeId.get_text() )
        gal.append(items[i].galTitle.get_text() )
        gal.append(items[i].galWebImageUrl.get_text() )
        gal.append(items[i].galCreatedtime.get_text() )
        gal.append(items[i].galModifiedtime.get_text() )
        gal.append(items[i].galPhotographyMonth.get_text() )
        gal.append(items[i].galPhotographyLocation.get_text() )
        gal.append(items[i].galPhotographer.get_text() )
        gal.append(items[i].galSearchKeyword.get_text() )
        # print(gal[0],gal[9])
        go.insertDB(gal)

print("완료")