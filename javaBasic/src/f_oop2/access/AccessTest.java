package f_oop2.access;

import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();

		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
	
	
	}

	void protectedTest(){
		System.out.println(protectedVar);
		protectedMethod(); // 상속받으면 사용됨
	
//		System.out.println(defaultVar);
//		defaultMethod();
		
//		System.out.println(privateVar);
//		privateMethod();
	
	
	}
	
	
	
}
