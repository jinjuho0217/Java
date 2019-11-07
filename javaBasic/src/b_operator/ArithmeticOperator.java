package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<산술 연산자>>
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지(나머지 결과값)
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 * 
		 * 
		 */

		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		// 수학과 같이 *,/,% 연산자가 +-보다 연산의 우선순위가 높다.
		// 우선순위가 동일한 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		a = (int) (10+20.3); // int + double -> double + double
		// 피연산자의 타입이 서로 다를 경우 표현볌위가 큰 쪽으로 형변환 후 연산이 수행된다.
		// 따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		// 연산에서는 4byte가 기준이다.
		
		
		byte b = 10;
		short c = 20;
		
		short d = (short) (c - b);
		// int 보다 작은 정수 타입은 int로 형변환 후 연산이 수행된다.
		
		long e1 = 100000 * 100000; // int와 int의 연산 결과는 int이다.
		System.out.println(e1);  // 오버플로우가 발생(int의 표현범위를 넘어감.)
		long e2 = 100000 * 100000L;// 피연산자 중 하나는 long 이어야 결과로 long을 얻을 수 있다.
		System.out.println(e2);
		
		float f1 = 10 / 4;
		System.out.println(f1); // 2.0
		float f2 = 10 / 4f;
		System.out.println(f2);
		int f3 = 10 % 4; // 10을 4로 나눈 나머지
		System.out.println(f3); //2
		
		// 정수는 0으로 나눌 수 없다. 실수는 0으로 나눌 수있다.
		//int g1 = 10 / 0; // 런타임 에러 발생
		float g2 = 10.0f/0;
		System.out.println(g2); //Infinity : 무한대 값이 나옴
		float g3 = 0/0f;
		System.out.println(g3); // NaN : Not a Number
		
		char h1 = 'A';// 아스키코드표
		char h2 = (char) (h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D'-'A';  //68-65
		System.out.println(h3);
		
		int h4 = '5'-'0';// 53-48
		System.out.println(h4);
		
		int i = 0;
		i = i + 1;
		i +=1; // 복합연산자
		
		// 더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; // 전위형 : 변수가 참조되기 전 수행
		i++; // 후위형 : 변수가 참조된 후 수행
		
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		
		i = i-1;
		i -=1;
		i--;
		--i;
		
		i = i * 2;
		i *=2;
		
		i /= 3;
		i = i % 4;
		i %= 4;
		
		
		// 반올림
		// 반올림을 하기 위해0.5를 더하고 소수점을 없애기 위해 int 로 형변환 한다.
		double round = 50.46;
		
		System.out.println((int)(round + 0.5));
		System.out.println(Math.round(round));// 소수점 첫째자리에서만 반올림
		
		// 소수점 둘째짜리에서 반올림	
		System.out.println((int)(round*10+0.5) /10f);
		System.out.println((int)(round*10+0.5)/10.0);
		
		
		
		
		// 연산을 할때는 연산의 벙위와 타입을 고려하자
		
		//문제1. 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1. 12345+654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 -654321
		//5. 4번의 결과값 %123456
		
		long z1 = (123456+654321);
		System.out.println(z1);
		
		long x1 = (z1*123456);
		System.out.println(x1);
		
		long c1 =(x1/123456);
		System.out.println(c1);
		
		long v1 = (c1-654321);
		System.out.println(v1);
		
		long b1 = (v1 %123456);
		System.out.println(b1);
		
		long result = 123456+654321;
		result = result * 123456;
		result /=123456;
		result -= 654321;
		result %=123456;
		System.out.println(result);
		
		
		//문제2. 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요(평균은 소수점 두째자리에서 반올림)
		
		int q1 = (10);
		int w1 = (100);
		int r1 = (1000);
		System.out.println(q1+w1+r1);
		double y1 = (q1+w1+r1)/3;
		
		System.out.println((int)(y1*10+0.5)/10.0);
		
		double k2 = 50.66;
		System.out.println((int)(k2 + 0.5));
		System.out.println((int)(k2*100+0.5)/100.0);
		
		
		double p1 = 45.65;
		System.out.println((int)(p1*10)/10.0);
		System.out.println((int)(p1*100)/100.0);
		
		
		
				
		
		
				
		
		
		
		
		
				

		
		
		
		
	}

}
