"""
    긴 주석을 원할때는 
    이런식으로 사용하시면 됩니다 .. 

for 문 
1.
    for 변수 in 반복가능한 데이터 :
        수행코드 
2. 
    for  i in range(시작값, 끝값+1, 증감값) :
        수행코드 

while 문 
1. 
    while 조건식:
        수행코드
2.
    변수 = 시작값
    while 변수 < 끝값
        수행코드
        변수 = 변수 + 증감값
"""


# for 
for i in range(0,5,1):
    print(i,"안녕하세요")
for i in range(0,5): # 증가 값이 1인 경우 1 생략 가능 
    print(i,"안녕하세요")
for i in range(5): # 5번 반복할 경우 
    print(i,"안녕하세요")
for _ in range(3): # i값이 필요 없을 경우 
    print("안녕하세요")

# while 
j = 0 
while j<5 :
    print(j,"반갑습니다")
    j += 1

# for,  if 를 사용해서 1- 10 까지 홀수만 출력
for i in range(1,11,1):
    if i%2==1:
        print(i, end=" ")
print() # 줄바꿈용
# while,  if 를 사용해서 1- 10 까지 짝수만 출력
j=0
while j<11:
    j+=1
    if j%2 == 0:
        print(j,end=" ")
print()



# continue, break 를 사용할 수 있음 
for i in range (10):
    if i==5:
        continue
    print(i)
    
# list type : 배열 . array 
numArr = [1,2,3,4,5]
strArr = ["a","b","c"]
print(numArr[0])
student = [1,'홍길동',99.5]
print(student)
print(student[0],student[1],student[2])
print(len(student)) # 배열의 길이 출력 

fruit = ['사과','복숭아','수박','포도','망고','멜론']
print(len(fruit))
fruit.append('딸기')
print(fruit)
if '딸기' in fruit:
    print("딸기가 있습니다")
for f in fruit: # 간단for
    print(f)
for i in range(len(fruit)):
    print(fruit[i])

# for문을 사용해서 1-10까지 num배열에 넣어보세요 > 출력도 해보세요 
num =[]
for i in range(1,11,1):
    num.append(i)

print(num)