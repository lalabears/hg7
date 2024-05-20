package j0520;

public class C0520_01 {
	public static void main(String[] args) {
		// 실행 버튼 control + f11
		/*
		 control + shift + l  : 모든 단축키의 목록을 보여줌
		 control + + : 글자 키우기
		 control + - : 글자 축소하기
		 control + d : 한줄삭제하기 
		 control + alt + down(up) : 행단위 복사 
		 tab : 들여쓰기
		 shift + tab :들여쓰기 반대
		 control + / : 주석
		 control + shift + / : 두줄이상주석 
		 control + space : 자동완성  
		    클래스 생성시 main가져오기 안했을 경우, 
		    main + control + space  를 하면된다.
		    sysout + control + space  
		       System.out.println(); 자동완성
		*/		
		System.out.println("안녕하세요");
		
		// 한줄 주석을 쓰고싶을때는  //
		/*
		 여러줄 주석은 / * 여기안에다가 작성을 하면된다.* /
		*/
		
		// console창에 출력할때는 println 명령어를 사용한다. 
		System.out.println("안녕하세요. 자바수업을 진행하겠습니다.");
		System.out.println("로그인해주세요 >>");
		System.out.println("아이디 :");
		System.out.println("비밀번호 :");
		
		System.out.println("반갑");
		System.out.println("습니다");
		// print는 줄 바꿈 없이 출력해준다. 
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print(10);
		// 줄바꿈을 하고싶을때 
		System.out.print("\n"); // 줄바꿈 방법 1
		System.out.println("줄바꿈은 역슬레시엔");
		System.out.print(11);
		System.out.println(); // 줄바꿈 방법 2
		System.out.print(12);
		System.out.println();
		
		System.out.print("안녕\n하세요\n"); // \n이 줄바꿈을 의미한다. 
		// 쌍 따옴표안에 있는 것은 문자 그대로 출력한다. 
		System.out.println("5+3");
		System.out.println("안녕하세요");
		System.out.println("안녕"+"하세요");
		System.out.println(2+4);
		System.out.println(4.1234);
		System.out.println("문자"+3);
		System.out.println("문자"+1+2);
		System.out.println("문자"+(1+2));
		
		System.out.println(5+3); // 계산의 결과출력
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);  // 나누기 같은경우는 정수/정수 > 정수
		// 실수의 결과를 얻고자 한다면 숫자 두개 중 한개는 실수여야함. 
		System.out.println(5.0/3);  // 실수
		System.out.println(5/3.0);  // 실수
		System.out.println(5.0/3.0);// 실수
		
		System.out.println("문자열"); // 문자열 
		System.out.println(100);    // 숫자
		int a = 10; 
		System.out.println(a);      //변수
		
		
		
	}
	

}
