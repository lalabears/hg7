import requests

headers = {"User-Agent" : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36"}
# url 모든 정보를 가져온다. 
# url = "https://www.google.com/"
url = "https://www.melon.com/"
# url = "https://www.whatismybrowser.com/detect/what-is-my-user-agent/"
res = requests.get(url, headers=headers)
# 응답코드가 200일 경우는 정상, 403일 경우는 접근 권한없음 , 404 페이지없음 ,
# 500번대는 프로그램오류
print("응답코드: " ,  res.status_code) 
if res.status_code == requests.codes.ok:
    print("페이지가 정상적으로 열립니다")
else:
    print("페이지에 오류가 있습니다")
# 코드가 200이 아니면 프로그램을 자동 종료 (예외 발생)
res.raise_for_status()
# 문자 출력 
# print(res.text)
# # 파일 저장 
with open("mymelon.html", "w", encoding="utf-8") as f:
    f.write(res.text)
