package e_oop;

public class JVM_Memory {

	/*
	 * <<JVM 메모리 구조>>
	 * - Method Area :  클래스가 저장된다.
	 * - Call stack : 현재 호출되어 있는 메서드가 저장된다.
	 * - Heap : 객체가 저장된다.
	 * 
	 * 운영체제 -> 프로그램
	 * 운영체제 -> JVM -> 프로그램
	 * 
	 * 
	 * */
	
	/*
	 * << Method Area >>
	 * - Static 클래스가 저장
	 * - Math 클래스 저장
	 * - System
	 * - PrintStream
	 * - ClassMember : static이 붙은 건 ClassVariable에 있음, ClassMethod()
	 * 
	 * 
	 * << Call Stack >>
	 * - main()에 내용이 저장 : cm1
	 * - random()이 호출됨 : 실행된 후에는 삭제
	 * - println() : 실행된 후에는 삭제
	 * - println() : 실행된 후에는 삭제
	 * - println() : 실행된 후에는 삭제
	 * 
	 * 
	 * << Heap >>
	 * - cm1 = new ClassMember() : instanceVariable, instanceMethod()
	 * - cm2 = new ClassMember() : instanceVariable, instanceMethod()
	 * 
	 */
	
	
}
