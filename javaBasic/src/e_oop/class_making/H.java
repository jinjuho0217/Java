package e_oop.class_making;

import java.util.ArrayList;
import java.util.Scanner;

public class H {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		int number;
		do{
			System.out.println("-------------------------");
			System.out.println("1.전원");
			System.out.println("2.소리키우기");
			System.out.println("3.소리줄이기");
			System.out.println("4.화면밝기 키우기");
			System.out.println("5.화면밝기 줄이기");
			System.out.println("6.전화번호 입력");
			System.out.println("7.통화목록");
			System.out.println("0.종료");
			System.out.println("-------------------------");
			
			number = Integer.parseInt(s.nextLine());
			switch(number){
			
			 case 1 : 
				 power();
			 break;
			 case 2 : 
				 volUp();
				 break;
			 case 3 :
				volDown();
				break;
			 case 4:
				 lightUp();
				 break;
			 case 5 : 
				lightDown();
				 break;
			 case 6 : 
				 num();
				 break;
			 case 7 : 
				 save();
				 break;
			 case 0 :
				 System.out.println("프로그램을 종료합니다.");
				 break;
				 
			} 
			
		}while(number!=0);

		
		
		}
		
	static ArrayList<Integer> pnumber = new ArrayList<Integer>();
	static boolean power;
	static int vol;
	final static int MIN_vol = 0;
	final static int MAX_vol = 10;
	static int light;
	static final int MIN_light = 1;
	final static int MAX_light = 3;
	static int num;
	int save;

	H() {
		power = false;
		num = 0;
		light = MIN_light;
		vol = MIN_vol;
	}

	static void power() {
		power = !power;
		System.out.println(power ? "핸드폰 켜짐" : "핸드폰 꺼짐");
	}

	
	static void light(){
	
		System.out.println("1.밝게 / 2. 어둡게");
		
	}
	
	
	static void lightUp() {
		if (power) {
			if (power) {
				if(light < MAX_light){
					light++;
				}else {
					light--;
				}
				
					if(light==MIN_light){
						System.out.print("최소 : ●");
					}else if(light==MAX_light){
						System.out.print("최대 : ○");
					}else{
						System.out.print("중간 : ◐");
					}
				System.out.println();
			}
	}
	}


	static void lightDown() {
		if (power) {
			if(MIN_light < light){
				light--;
			}
			if(light==MAX_light){
				System.out.print("최대 : ○");
			}else if(light==MIN_light){
				System.out.print("최소 : ●");
			}else{
				System.out.print("중간 : ◑");
			}
			System.out.println();
		}
		}
		
		
	

	void showlight(int light) {
		System.out.println("밝기 : ");
		for (int i = MIN_light; i <= MAX_light; i++) {
			if (i < light) {
				System.out.println("○");
			} else if (i == light) {
				System.out.println("◐");
			} else {
				System.out.println("●");
			}
		}
	}

	static void volUp() {
		if (power) {
			if(vol < MAX_vol){
				vol++;
			}else {
				vol--;
			}
			for(int i = MIN_vol; i< MAX_vol; i++){
				if(i<= vol){
					System.out.print("■");
				}else{
					System.out.print("□");
				}
			}System.out.println();
		}
	}

	static void volDown() {
		if (power) {
			if(MIN_vol < vol){
				vol--;
			}
			for(int i = MIN_vol; i< MAX_vol; i++){
				if(i<= vol){
					System.out.print("■");
				}else{
					System.out.print("□");
				}
			}System.out.println();
		}
	}
	 
	 
	static void num() {
		if(power){
			System.out.println("전화번호를 입력하세요.");
			//Integer.parseInt(s.nextLine());
			int a = s.nextInt();
			pnumber.add(a);
			
		}
		
	}

	
	static void save() {
		if(power){
			System.out.println("통화기록 : ");
//			for(int i=0; i < 10; i++ ){
//				if(i == num){
//					System.out.println(i+1 +" : 0"+pnumber.get(i));
//				}
//			}
			
			for (int i =0 ; i<pnumber.size(); i++){
				System.out.println(i+1 +" : 0"+pnumber.get(i));
			}

		}
		
	}

}
