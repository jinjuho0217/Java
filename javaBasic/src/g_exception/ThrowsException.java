package g_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * <<메서드에 예외 선언하기>>
		 * - void method() throws Exception {발생할 가능성 있는 예외}
		 * - 메서드의 구현부 끝에 throws 키워드와 예외 클래스명으로 예외를 선언할 수 있다.
		 * - 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다. 
		 * 
		 * - 예외를 처리하는 방법 : 호출한 애한테 넘기던가(throw사용해서), try-catch로 감싸던가
		 * - 예외 찾는 법 : 내가 아는 메서드나 입력한 메서드가 나올때까지 찾는다.
		 */
		
		try {
			method();
		} catch (IOException e) {
			// 넘겨받은 예외를 처리한다.
			e.printStackTrace();
		}
		
		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void method1() throws IOException{
		System.out.println(10/0);
	}

	private static void method() throws IOException { // 예외를 처리하지 않고 넘겨준다.
		throw new IOException(); // 호출한 메서드에서 예외 발생, 메서드를 try-catch 로 감싸준다.
	}

	
	
	
	
}
