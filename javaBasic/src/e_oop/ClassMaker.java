package e_oop;

public class ClassMaker {
	int a = 10; 
	int b = 0;
	
	
	void t1(){
		System.out.println(a);
	}
	int t2(){
		return a; // return 타입이 있을 때는 타입 없을때는 void사용 + 뒤에 전역변수;
	}
	void t3(int a){
		System.out.println(a);
	}
	int t4(int a, int b){
		return a * b;
	}
	int c = 20;
	int d = 1;
	
	
}
