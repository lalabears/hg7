/*
연산자 

1. 산술연산자 
+ : 더하기
-  : 빼기
*  : 곱하기
/  : 나누기결과값
% : 나누기한 나머지 값
 */

 var x = 10, y = 3 ; 
 
 document.write(x+y+"<br>");
 document.write(x-y+"<br>");
 document.write(x*y+"<br>");
 document.write(x/y+"<br>");
 document.write(x%y+"<br>");
 document.write((++x) +"<br>");
 
/*
 2. 대입연산자 : 
오른쪽값을 왼쪽 변수에 넣는다

y = x + 3 ; 

y += x ;  =>  y = y + x;
y  -= x ;  =>  y = y - x;
y  *= x ;  =>  y = y * x;
y  /= x ;  =>  y = y / x;  
y  %= x ; =>  y = y % x;
*/
 
 
 var x = 10, y = 10 , z = 10 ; 
 
 x = x - 5;  // 10 - 5 값을 다시 x에 넣는다 
 y -= 5 ;   //  y = y - 5 와 같은 표현임 
 z =  -  5 ;   // z  = -5; 와 같은표현임
 
 document.write(x , y, z);
 
 
 /*
 3. 증감 연산자 
피연산자를 1씩 증가 혹은 감소 할때 사용
피 연산자는 1개뿐인 단항연사자 


++x : 먼저 x값을 1 증가시킨다음에 연산진행
x++ : 연산 수행 후 x 값을 1증가 
--x   : 먼저 x값을 1감소 시킨다음 연산진행
x--   : 연산 수행후 x 값을 1감소 

*/

 var x ;   // 변수를 선언한다
 x = 5 ; // 변수에 값을 넣는다 
 var y = 5 ; // 변수 선언과 초기화를 동시에 한다. 
 
  document.write("<br><br><br><hr>" ); 
 
 document.write(  (++x  - 3 ) +"<br>"   );
 
 // x = 5 가 있음, 먼저 x를 1증가 시킨후(x=6) 연산(-) 를 실행 : 결과 - 3

 document.write( x + "<br>" );  //  x를 1증가 시켜서   x=6 
 
  document.write(  (y++  - 3 ) +"<br>"   );
  
 // y = 5 가 있는 상태.  y - 3 연산 수행 후 (5 - 3 = 2) 
 // 다음에 y를 1증가시킴 
  
 document.write( y + "<br>" ); //  y를 1증가시킴 y = 6
 
 /*
 4. 연결연산자 
둘 이상의 문자열을 합쳐서 하나의 문자열로
만드는 연산자   
+ 기호 사용
 
  */
 
 var name ="홍길동";
 var age = 20 ; 
 
 var str = "이름은 "+ name + ", 나이는 "+ age ;
 document.write(str);
 
 
 /*
 5. 비교연산자 
: 피연산자 두개를 비교해서
true, false결과 값을 반환 

= 대입 
== 같은지?

== 피연산자가 서로 같으면 true
=== 피연산자가 같고, 자료형도 같으면 true 
!=  피연산자가 서로 같지 않으면 true 
!== 피연산자가 같지않거나 자료형이 같지 않으면 true 
<   왼쪽 피연산자가 오른쪽 피연산자보다 작으면 true 
<= 
>   왼쪽 피연산자가 오른쪽 피연산자보다 크면 true 
>= 

  */
 document.write("<hr>");
 var x = 3, y = 5; 
 var a ="abc", b="bcd"; 
 
 
 document.write( (x > y ) +"<br> "); 
 //              3   >  5 
 document.write( (a <= b ) + "<br>") ; 
 //     문자'a'가  'b'보다 먼저 있기때문에 true 
 
 document.write( ( x < a )+ "<br>") ;
 
 var x = 3, y = "3", z = 3 ;
 //   숫자     문자열      숫자 
 document.write( (x == z) + "<br>");  // true
 document.write( (x === z) + "<br>");  // true
 
 document.write( (x == y) + "<br>");  // true 
 document.write( (x === y) + "<br>"); // false
 // x 와 y의 타입이 서로 다르기 때문
 
 
 /*
 6. 논리연산자 

OR       ||       : 피연산자 하나만 참이어도 참
   (   (true) || (true) )  -> true 
   (   (false) || (true) )  -> true 
   (   (true)  ||  (false) )  -> true 
   (   (false)  ||  (false) )  -> false

AND    &&     : 피연산자 모두 참이어야 참 
   (   (true)  &&  (true) )  -> true 
   (   (false) &&  (true) )  ->  false
   (   (true)  &&  (false) )  -> false
   (   (false) &&  (false) )  -> false

NOT      !       : 피연산자의 반대 값 
    !(true)  -> false
    !(false) -> true 
 
 
 */
 document.write("<hr>")

 var x = 3, y = 5 , z = 7 ; 
 
 document.write( (x > y ) || (y < z ) +"<br>");
 //               3 > 5      5  < 7
//                 거짓    ||    참
  
  
 document.write( ( (x > y ) && (y < z ) ) +"<br>");
 //               3 > 5      5  < 7
//                 거짓    &&   참

 
 document.write( !(y < z ) );
 //               3 > 5      5  < 7
//                 거짓    ||    참
 
 
 /*
 7. 삼항연산자 

표현식 ? 반환값1 : 반환값2 

표현식이 참이면 반환값1, 
표현식이 거짓이면 반환값2 
 
  */
 
 document.write( "<hr>" );
 
 var x = 13, y = 5;
 
 var res = ( x > y ) ? x : y ; 
 
 document.write("둘중에 더 큰수는 "+ res +"입니다");
 
 
 
 
 
 
 
 
 
 
 