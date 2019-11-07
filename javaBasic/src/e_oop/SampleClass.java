package e_oop; // 현재 클래스의 위치를 알여준다.

import java.util.Scanner; // 다른 패키지에 있는 클래스의 위치를 알려준다.

public class SampleClass {

	int field = 10; // 전역변수 : 클래스 전체 영역에서 공유하는 변수, 초기화를 하지 않으면 기본값으로 초기화됨
	/*
	 * - 메서드 : 코드를 분리해서 더 효율적인 프로그램을 만들기 위한 도구
	 * - 리턴타입 메서드명 (파라미터){ }
	 * - 리턴타입(반환타입) : 실행 후 돌려줘야 하는 결과물
	 * - 파라미터(매개변수) : 실행에 필요한 정보
	 */

	void method1(){ // void - 리턴타입이 없을때 적는 타입
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}

	void method2(int parameter){
		System.out.println(parameter + "를 사용해 명령을 수행하는 메서드");
	}
	String method3(){
		return " 명령 수행 후 결과물을 돌려주는 메서드"; 
		// return : 메서드를 종료시키고 결과물을 돌려준다.
		// 리턴타입이 없는 메서드에서는 메서드를 종료시킨다.
	}

	int method4(int a, int b){
		System.out.println(a + ","+ b +"를 사용해 명령을 수행하고" + "결과물을 돌려주는 메서드");
		return a+b;
	}

	void test1(){
		System.out.println("1. test1 시작");
		test3();
		System.out.println("6. test1 종료");
	}

	void test2(){
		System.out.println("3. test2 시작");
		System.out.println("5. test2 종료");
	}

	void test3(){
		System.out.println("2. test3 시작");
		test2();
		System.out.println("4. test3 종료");
	}

}
