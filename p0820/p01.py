
print("hello")
print("hello world")
# 주석은 # 입니다 
# alt shift 밑으로
print("%d"%150.15)
print("%f"%150.15)
print("%s"%150.15)
print("%.1f"%150.15)
print("{}+{}={}".format(1,2,1+2))
print("정수 :{:5d} ,  실수: {:.2f},  문자열{:s}".format(5,1.234,"abc"))

# 변수 
num1 = 10 
num2 = -100
print(num1)
print(num2)
num3 = 3.14
print(num3)
str1 = "안녕하세요"
print(str1)

name = "홍길동"
age = 22
print("안녕하세요 저는 "+ name+"입니다")
print("저는 ", age,"살 입니다")

# 함수
def cal(a,b): 
    print(a+b)
    print(a-b)
    print(a*b)
    print(a/b)

cal(100, 5)

# if 문 
num = 10
if num == 10 :
    print("10 입니다")
else:
    print("10이 아닙니다")
    
# 만약에 값이 10보다 크면 10보다 큽니다 라고 출력해보세요 
n = 100
if n > 10 :
    print(n,"은 10보다 큽니다")

# str = int(input("입력하세요: "))
# print("입력하신 숫자는 ", str+100)

# 중첩 if 문 
num = 201 
if num > 100 :
    print("100보다 큰수이며, ")
    if num%2 == 0:
        print("짝수입니다")
    else:
        print("홀수입니다")
else:
    print("100보다 작습니다")

# else if >  elif 
score = 50
if score >= 90 :
    print("A")
elif score >=80 :
    print("B")    
elif score >= 70:
    print("C")
else:
    print("F")

