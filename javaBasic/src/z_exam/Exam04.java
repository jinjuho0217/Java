package z_exam;

public class Exam04 {

	public static void main(String[] args) {
//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1. int형 변수 x가  10보다 크고 20보다 작을 때 true인 조건식 //  10 < x && x < 20
//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식 // 모름               //   ch !='' || ch != "\t"
//		3. char형 변수 ch가 ‘x'또는 ’X'일 때 true 인 조건식// ch ==x || ch ==X
//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식 0 <= ch && ch <= 9
//		5. char형 변수 ch가 영문자(대문자 또는 소문자) 일 때 true인 조건식 a <= ch && <= z || A <= ch && <=Z 
//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100 으로 나눠떨어지지
//			않을 때 true인 조건식  // year%400 =0 || year%4=0 && year%100 != 0
//		7. boolean형 변수 powerOn가 false일 때 true인 조건식  //	powerOn==fales  ||  !powerOn

//		8. 문자열 참조변수 str 이“yes” 일 때 true인 조건식 
//							String str =null;
//							if( str=="yes"){
//								System.out.println("true일때 실행");		}
//		
		
//		[4-2] 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
//		
//		int a = 0;
//		
//		 for(int i =1; i<=20; i++) {
//			 if(i%2 != 0 && i%3 !=0){
//				 a = a + i;
//			 }
//		 }
//		 	System.out.println(a);
//		    

		
//		[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
//		      int sum = 0;
//				for(int i =1; i<=10; i++){
//					for(int a =1; a<=i; a++){
//						sum+=a;
//					}
//				}
				
//		
//		[4-4] 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100 이상이 되는지 구하시오
//		 	int i =0;
//		 	int a =i%2;
//		 	int b =i%1;
//		for(i =1; i>=100; i++){
//			if(a+b == i){
//			}
//		} System.out.println(i);
							
		
				
		
		
							
							
//		
			
//		
//		[4-5] 다음의 for문을 while문으로 변경하시오 .
//		[연습문제] /ch4/Exercise4_5.java
//		
//		public class Exercise4_5 {
//		public static void main(String[] args) {
//			for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//			System.out.print("*");
//			System.out.println();
//			}
//			} // end of main
//			} // end of class
//		
//							int i= 0;
//							while(i <=10) {
//								int j = 0;
//								while(j <= i){
//									System.out.println("*");
//									j++;
//								}
//									
//								System.out.println();
//								i++;
//							} // while문 끝날때 증감식
							
							
							
							
							
							
							
							
							
							
							
							
//		[4-6] 두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 
//		프로그램을 작성하시오.
//		int i = 0;
//		int a = 0;
//		   for( i=1; i <= 6; i++)
//		     for( a=1; a <= 6; a++)
//			  if(i + a ==6)
//				  System.out.println(i + "," + a);
		   
		
							
							
//		
//		
//		[4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수value에 저장하는
//		코드를 완성하라  (1) 에 알맞은 코드를 넣으시오 .
//		[ ] 연습문제 /ch4/Exercise4_7.java
//		
//		class Exercise4_7 {
//		public static void main(String[] args) {
//		int value = ( /* (1) */ );
//		System.out.println("value:"+value);
//		}
//		}
//		    int value = (int)(Math.random()*6)+1;
//
//		[4-8] 방정식 의 모든 해를 구하시오 단 와 는 정수이고 각각의 범위는 2x+4y=10 . , x y
//			0<=x<=10, 0<=y<=10 이다
//					[ ] 실행결과
//					x=1, y=2
//					x=3, y=1
//					x=5, y=0	
//				
//					for(int x = 0; x <=10; x++){
//						for(int y = 0; y <=10; y ++){
//							if(2 * x + 4 * y == 10){
//								System.out.println("x :" + x + "y" + y);
//							}
//						}
//					}
//							
							
							
//				
//				[4-9] 숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 
//				코드를 완성하라 만일 문자열이 "12345"라면 의 , ‘1+2+3+4+5’ 결과인 15를 출력이 출력되 
//				어야 한다 (1) 에 알맞은 코드를 넣으시오
//				
//				[Hint] String charAt(int i) 클래스의 을 사용
//				
//				[ ] 연습문제 /ch4/Exercise4_9.java
//				
//				class Exercise4_9 {
//				public static void main(String[] args) {
//				String str = "12345";
//				int sum = 0;
//				for(int i=0; i < str.length(); i++) {
//				/*
//				(1) . 알맞은 코드를 넣어 완성하시오
//				*/
//				}
//				System.out.println("sum="+sum);
//				}
//				}
//				[ ] 실행결과
//				15
//
//				
//				[4-10]  , int 타입의 변수 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를
//				완성하라 만일 변수  num의 값이 12345 라면‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
//				에 알맞은 코드를 넣으시오.
//				[ ] 주의 문자열로 변환하지 말고 숫자로만 처리해야 한다.
//				
//				[ ] 연습문제 /ch4/Exercise4_10.java
//				
//				class Exercise4_10 {
//				public static void main(String[] args) {
//				int num = 12345;
//				int sum = 0;
//				/*
//				(1) . 알맞은 코드를 넣어 완성하시오
//				*/
//				System.out.println("sum="+sum);
//				}int i3 - input %10;
//				}
//				int num = 123456;
//				int sum = 0;
//				while(num!=0){
//					sum = sum+(num%10);
//					num=num/10;
//				}
//							System.out.println("sum = "sum);
//						
//				[] 실행결과 15
							
							
							
					
							
//				
//				
//				[4-11] 피보나치(Fibonnaci) 수열(數列) 은 앞을 두 수를 더해서 다음 수를 만들어 나가  
//				는 수열이다 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 . 
//				 1 1 과 를 더해서3 이 되어서 1,1,2,3,5,8,13,21,... .과 같은 식으로 진행된다 과 부터
//				시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오  .
//				[ ] 연습문제 /ch4/Exercise4_11.java
//				
//				public class Exercise4_11 {
//				public static void main(String[] args) {
//				// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
//				int num1 = 1;
//				int num2 = 1;
//				int num3 = 0; // 세번째 값
//				System.out.print(num1+","+num2);
//				for (int i = 0 ; i < 8 ; i++ ) {
//				/*
//				(1) . 알맞은 코드를 넣어 완성하시오
//				*/
//				}
//				} // end of main
//				} // end of class
//				
//				[ ] 실행결과
//				1,1,2,3,5,8,13,21,34,55
													
						//				int a = 1;
						//				int b = a+1;
						//				int c = a+b;
						//				System.out.print("," + c);
						//				a = b;
						//				b = c;
						//				for(int i = 0; i<=8; i++){
						//					System.out.println(c);
						//				}
						//							
//							
							
//		
//		
//				
//				[4-13] 다음은 주어진 문자열(value) 이 숫자인지를 판별하는 프로그램이다  (1)에 알맞  .
//				은 코드를 넣어서 프로그램을 완성하시오.
//				
//				[ ] 연습문제 /ch4/Exercise4_13.java
//				class Exercise4_13
//				{
//				public static void main(String[] args)
//				{
//				String value = "12o34";
//				char ch = ' ';
//				boolean isNumber = true;
//				// charAt(int i) 반복문과 를 이용해서 문자열의 문자를
//				// . 하나씩 읽어서 검사한다
//				for(int i=0; i < value.length() ;i++) {
//				/*
//				(1) . 알맞은 코드를 넣어 완성하시오
//				*/
//				}
//				if (isNumber) {
//				System.out.println(value+" ."); 는 숫자입니다
//				} else {
//				System.out.println(value+" ."); 는 숫자가 아닙니다
//				}
//				} // end of main
//				} // end of class
//				
//				[ ] 실행결과
//				12o34 . 는 숫자가 아닙니다
////				
//							String value = "12o34";
//							char ch = ' ';
//							boolean isNumber = true;	
//							
//							for(int i = 0; i < value.length(); i++){
//								
//								ch = value.charAt(i);
//										if(!('0' <= ch && ch <='9')){
//											isNumber = false;
//										}
//							}
//							
							
							
							
//				[4-14] 다음은 숫자맞추기 게임을 작성한 것이다 1과 100사이의 값을 반복적으로 입력 . 
//				해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다 사용자가 값을 입력하면 컴퓨터는 자 . ,
//				신이 생각한 값과 비교해서 결과를 알려준다 사용자가 컴퓨터가 생각한 숫자를 맞추면 .
//				게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다 (1)~(2)에 알맞은 코드를 넣어 프 . 
//				로그램을 완성하시오.
//				[ ] 연습문제 /ch4/Exercise4_14.java
//				class Exercise4_14
//				{
//				public static void main(String[] args)
//				{
//				// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
//				int answer = /* (1) */;
//				int input = 0; // 사용자입력을 저장할 공간
//				int count = 0; // 시도횟수를 세기위한 변수
//				// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
//				java.util.Scanner s = new java.util.Scanner(System.in);
//				do {
//				count++;
//				System.out.print("1 100 :"); 과 사이의 값을 입력하세요
//				input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//				/*
//				(2) . 알맞은 코드를 넣어 완성하시오
//				*/
//				} while(true); // 무한반복문
//				} // end of main
//				} // end of class HighLow
//				
//				[ ] 실행결과
//				1 100 :50 과 사이의 값을 입력하세요
//				더 큰 수를 입력하세요.
//				1 100 :75 과 사이의 값을 입력하세요
//				더 큰 수를 입력하세요.
//				1 100 :87 과 사이의 값을 입력하세요
//				더 작은 수를 입력하세요.
//				1 100 :80 과 사이의 값을 입력하세요
//				더 작은 수를 입력하세요.
//				1 100 :77 과 사이의 값을 입력하세요
//				더 작은 수를 입력하세요.
//				1 100 :76 과 사이의 값을 입력하세요
//				맞췄습니다.
//				시도횟수는 번입니다 6 .
//		
			//				int answer = (int)(Math.random() * 100) + 1;
			//				int input = 0;
			//				int count = 0;
			//				java.util.Scanner s = new java.util.Scanner(System.in);
			//				do {
			//					count++;
			//					System.out.print("1과 100사이의 값을 입력하세요 : "); 
			//				
			//					if(input > answer){
			//						System.out.println("더 작은 값입니다.");
			//						input = s.nextInt();
			//						if(input < answer){
			//							System.out.println("더 큰 값입니다.");
			//							input = s.nextInt();
			//					}else{
			//						System.out.println("정답");
			//						break;
			//					}
							
							
							
//		
//				[4-15] 다음은 회문수를 구하는 프로그램이다 회문수(palindrome) 란 숫자를 거꾸로 읽 .  ,
//				어도 앞으로 읽는 것과 같은 수를 말한다 예를 들면 ‘12321’이나  ‘13531’같은 수를 말한 . 
//				다 . (1) .에 알맞은 코드를 넣어서 프로그램을 완성하시오 
//				
//				[Hint] 나머지 연산자를 이용하시오.
//				
//				[ ] 연습문제 /ch4/Exercise4_15.java
//				class Exercise4_15
//				{
//				public static void main(String[] args)
//				{
//				int number = 12321;
//				int tmp = number;
//				int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
//				while(tmp !=0) {
//				/*
//				(1) . 알맞은 코드를 넣어 완성하시오
//				*/
//				}
//				if(number == result)
//				System.out.println( number + " ."); 는 회문수 입니다
//				else
//				System.out.println( number + " ."); 는 회문수가 아닙니다
//				} // main
//				}
//				[ ] 실행결과
//				12321 . 
//						int num = 123456;
//							int sum = 0;
//							while(num!=0){
//								sum = sum+(num%10);
//								num=num/10;
//		
//	}
//
//}
//						int number = 12321;
//						int tmp = number;
//						int result = 0;
//						
//						while(tmp !=0){
//							result *= 10;
//							result = result+(tmp%10);
//							tmp = tmp/10;
//						}if(number == result){
//							
//							System.out.println( number + " 는 회문수 입니다");
//				
//							} else
//								System.out.println( number + " 는 회문수가 아닙니다"); 
//							
				  
				  
		 }}
