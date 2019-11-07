package g_exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * <<에버>>
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러(우리가 처리할 에러)
		 * 
		 * 
		 * <<런타임 에러>>
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(처리불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리가능)
		 * 
		 * <<예외>>
		 * - 모든 예외는  Exception 클래스의 자식 클래스 이다.
		 * - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.(unchecked예외)
		 * - [RuntimeException  클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다.(checked 예외)
		 * 
		 *  <<예외처리(try - catch)>>
		 *  - 예외처리를 통해 프로그램이비정상적으로 종료되는 것을 방지할 수 있다.
		 *  - try{ 코드가 들어오는 곳 } catch (Exception e){ 예외를 처리하는 곳 }
		 *  - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 *  - catch 의 ()안에는 처리할 예외를 지정해 줄 수 있다.
		 *  - 여러 종류의 예외를 처리할 수 있도록 catch는 하나 이상 올 수 있다.
		 *  - 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 *  - 발생한 예와와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 * */
		
		try{
		
		int result = 10/0; // 정수는 0으로 나눌수 없음, 예외가 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		System.out.println(result);	// 예외 발생시 프로그램이 실행하지 않는다.
		// 파란색 부분(위) : 예외가 발생한 클래스 - 원인 : /by zero
		// 파란색 부분(아래) : 예외가 발생한 위치
		} catch(ArithmeticException | IndexOutOfBoundsException e){// 안에다가 추가하려면 |를 입력하고 쓴다.
			
			e.printStackTrace(); // 예외 메시지를 출력한다, 발생한 예외를 처리하는게 아니고 출력만한다.
			//printStachTrace를 입력하지 않으면 콘솔창에 아무런 표시도 안됨, 예외가 처리됬다고 알리기 위해서 씀
		}catch(NullPointerException e){// 참조형 타입 객체가 생성되지 않았는데 변수나 메서드에 접근할 때 발생함
			// 여러 종류의 예외를 처리하기 위해 catch를 하나 이상 사용할 수 있다.
		}catch(Exception e){
			//Exception은 모든 예외의 부모클래스이기 때문에 모든 예외를 받을 수 있다.
			// 예상치 못한 예외를 처리할 수 있다.
		}
		
		test1();
		
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
//		System.out.println(10/0);
//		try{
//			new FileInputStream("");
//		}
//		catch(FileNotFoundException e
//		){e.printStackTrace();
//			}
		//new FilenInputStream(""); // 예외처리를 안해줘서 컴파일에러발생, Exception의 자식들은 예외처리가 강제된다.
	}

}
