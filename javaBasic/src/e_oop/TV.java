package e_oop;

public class TV {

	public static void main(String[] args) {

	TV t = new TV();
	t.power();
	System.out.println(t.ch);
	
	}

	// TV를 대상으로 가능한 TV와 비슷하게 TV클래스를 만들어 주세요.
	
	//전원버튼
	
	boolean power; 
	int ch;
	int vol;
	final int MIN_CH = 1; // 상수 리터럴에 의미부여할 떄 사용
	final int MAX_CH= 10;
	final int MIN_VOL = 0;
	final int MAX_VOL = 100;
	
	TV(){
		power = false;
		ch = MIN_CH;
		vol = 20;
	}
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV꺼짐");
	}
	void chUp(){
		if(power && ch < 10){
			ch++;
		}
	}
	void chDown(){
		if(power && 1 < ch){
			ch--;
		}
	}
	void volUp(){
		if(power && vol <100){
			vol++;
		}
	}
	void volDown(){
		if(power && 0 < vol){
			vol--;
		}
	}
}
