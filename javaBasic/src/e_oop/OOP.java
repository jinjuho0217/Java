package e_oop;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		/*
		 * <<객체지향 프로그래밍>>
		 * -프로그래밍을 단순히 코드의 연속으로 보는것이 아니라
		 * 객체간의 상호작용으로 보는 것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체생성(인스턴스화)>>
		 * -글래스를 사용하기 위해 메모리 (Heap영역)에  올려놓는 것
		 * - new 객체 클래스명(); = 객체가 저장된 메모리 주소 반환
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로운 객체가 생성되고, 
		 * 여러개의 객체가 동시에 존재할 수 있다.
		 * 
		 */

		SampleClass sc = new SampleClass(); 

		sc.method1();

		sc.method2(10);

		String returnSting = sc.method3();
		System.out.println(returnSting);

		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);

		sc.test1();

		ClassMaker sc1 = new ClassMaker();
		sc1.t1();

		sc1.t2();
		System.out.println(sc1.t2());

		sc1.t3(10);


		System.out.println(sc1.t4(10, 2));


		Calculator a1 = new Calculator();

		long returnInt1 = a1.m1(123456, 654321);
		System.out.println("합 : "+returnInt1);

		long returnInt2 = a1.m3(returnInt1, 123456);
		System.out.println("곱 : "+returnInt2);

		long returnInt3 = a1.m5(returnInt2, 123456);
		System.out.println("나누기 : "+returnInt3);

		long returnInt4 = a1.m2(returnInt3, 654321);
		System.out.println("빼기 : " +returnInt4);

		long returnInt5 = a1.m4(returnInt4, 123456);
		System.out.println("나머지 : "+returnInt5);


		System.out.println("결과 : " + returnInt5);


		SimliTest b1 = new SimliTest();
		b1.method1();
		

	
		











}
}










