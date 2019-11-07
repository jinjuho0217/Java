package f_oop2;

// 싱글톤 패턴 : 객체의 생성을 제한하여 하나의 객체만 사용하게 하는 디자인 패턴
// 객체들간에 객체를 공유하기 위해 사용한다.


public class Singleton {
	
	private static Singleton instance;
	// 생성자의 접근제어자를 private 으로 만들어 다른 클래스에서 객체 생성하는 것을 막는다
	private Singleton(){
		System.out.println("-----------------");
	}

	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
			System.out.println("123123123");
		}
		return instance;
	}
	
	
}
