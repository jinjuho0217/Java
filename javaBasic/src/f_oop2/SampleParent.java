package f_oop2;

public class SampleParent extends Object {
//object는 입력하지 않아도 자동으로 적용된다.
	
	String var;
	
	{
		var = "초기화블럭은 물려주지 않는다.";
	}
	SampleParent(){
		var = "생성자도 물려주지 않는다.";
		
	}
	int method(int a, int b){
		return a+b;
	}
	
	
}
