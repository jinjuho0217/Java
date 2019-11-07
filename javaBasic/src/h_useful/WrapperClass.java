package h_useful;

import java.util.Vector;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		 * 
		 * boolean : Boolean
		 * char : Character
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * 기본형타입과 객체가 연산이 가능하게 해준다.
		 */
		
		int i =10;
		Integer iw = new Integer(20);
		
		System.out.println(i+iw);
		
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20"));
		
		System.out.println(i+String.valueOf(20));
		
		System.out.println(i+Integer.valueOf("20"));
		
		Vector<Integer> v = new Vector<Integer>(); // vector : integer타입을 저장할수 있는 배열
		
		v.add(new Integer(10)); // 객체만 저장가능
		v.add(10);// 형변환이 숨어있기 때문에 컴파일에러가 안나타나고 가능  
					//오토박싱 : 기본형타입이 wrapper클래스로 자동변환
		
		Integer integer = v.get(0);
		int i2 = v.get(0); // integer타입을 int로도 저장할 수 있는데 형변환이 자동으로 되서 가능
		// 언박싱 : wrapper클래스가 기본형타입으로 자동변환
	}

}
