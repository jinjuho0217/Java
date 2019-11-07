package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {

	void method(){
		
	}
	// 추상메서드 : 선언부만 있고 구현부는 없는 메서드, 상속받으면 반드시 오버라이딩을 해서 구현해야한다.
	
	abstract void abstractMethod();
	
	
}
class SampleAbstractchild extends SampleAbstractParent{

	// 추상메서드를 상속받으면 반드시 구현해야한다.
	// 상속받은 추상메서드를 추상메서드로 남겨두려면
	// 클래스를 추상클래스로 변경해야 한다.
	
	@Override
	void abstractMethod() {
		
	}
	
}