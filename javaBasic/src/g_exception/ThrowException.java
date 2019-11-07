package g_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		
		/*
		 * <<예외 발생시키기>>
		 *- throw new Exception();
		 *- throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
		 *
		 */
		
		IOException ioe = new IOException();
		
		try {
			throw ioe; // 예외를 고의로 발생시킬 수 있다.
		
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
		throw new NullPointerException("예외가 발생한 원인"); // 런타임exception은 예외처리가 강제되지 않는다, 생성자의 파라미터로원인을 표시할 수 있음.
		// 코드를 테스트 하기 위해서 사용
		// 예외처리가 되지 않았기 때문에 밑으로는 컴파일에러 발생
		
		
		
		
//		System.out.println("여기는 수행되지 않아요.");
		
	}

}
