//
//
//package z_exam;
//
//
//public class Exam07 {
//
//	public static void main(String[] args) {
//


//		[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		
		// 상속받은 메서드의 내용을 재정의하는 것이다.
		// 상속받은 메서드와 리턴타입, 메서드명, 파라미터가 같아야 한다.
		// - 상속받은 메서드보다 좁은 범위의 접근제어자로 변경할 수 없다.
		// - 상속 받은 메서드보다 많은 예외를 선언할 수 없다.
		// - static을 빼거나 더할 수 없다.
				
				
//		[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은 모두 고르시오 ? ( )
//		a. . 조상의 메서드와 이름이 같아야 한다 - O
//		b. . 매개변수의 수와 타입이 모두 같아야 한다 - O
//		c. . 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다 -x
//				- 상속받은 메서드보다 좁은 범위의 접근제어자로 변경할 수 없다.
//		d. . 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다. -x, 
//				= 상속받은 메서드보다 많은 예외를 선언할 수 없다.
						
//						
//			[7-5] 다음의 코드는 컴파일하면 에러가 발생한다 그 이유를 설명하고 에러를 수정하기 .
//			위해서는 코드를 어떻게 바꾸어야 하는가? 
//			[ ] 연습문제 /ch7/Exercise7_5.java
		//	
		//	
//			class Product
//			{
//			int price; // 제품의 가격
//			int bonusPoint; // 제품구매 시 제공하는 보너스점수
			//		Product() {
			//		} - 아래 Tv가 파라미터가 없는 생성자를 사용했기 때문에
//						파라미터가 없는 생성자를 하나 만들었음
		
		
//			Product(int price) {
//				this.price = price;
//				bonusPoint =(int)(price/10.0);
//			}
//			}
//				class Tv extends Product {
//					Tv() {}
//					public String toString() {
//						return "Tv";
//					}
//				}
//				class Exercise7_5 {
//					public static void main(String[] args) {
//						Tv t = new Tv();
//					}
//				}		
		//
		//
//				
				
		//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
		//가?
					//	기존의 클래스를 물려받아 새로운 클래스를 만들기 위해서
				
				
				
		//[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
		//[ ] 연습문제 /ch7/Exercise7_7.java
//				
//				class Parent {
//					int x=100;
//					Parent() {
//						this(200);
//					}
//					Parent(int x) {
//						this.x = x;
//					}
//					int getX() {
//						return x;
//					}
//				}
//				class Child extends Parent {
//					int x = 3000;
//					Child() {
//						this(1000);// super가 생략되어있음
//					}
//					Child(int x) {
//						this.x = x; // this 없는 생성자에 super가 들어감
//					}
//				}
//				class Exercise7_7 {
//					public static void main(String[] args) {
//						Child c = new Child();
//						System.out.println("x="+c.getX());
//					}
//				}
								// main메서드에서 child를 먼저 불러서 child가 실행되고
						//		child안에 생성자가 2개 있는데 순서대로 child()파라미터 없는거 그리고child(int x)
						//		순으로 실행이 되고child(int x) 안에 생성자 this가 있기 때문에 this는 상속받았다는 의미이므로
						//		parent클래스로 가고 그 생성자 안에 있는 parent() 그리고 parent(int x)순으로 실행이 된다.
		
		
		//
		//[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		//것은?
				//a. public-protected-(default)-private - O
				//		- public : 접근에 제한이없음
				//		- protected : 같은 패키지, 상속받은클래스
				//		- default : 같은패키지 안에서만 접근 가능
				//		- private : 클래스 내에서만 접근 가능
		//b. public-(default)-protected-private
		//c. (default)-public-protected-private
		//d. private-protected-(default)-public
		//
		//
		//7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다  .
		//옳지 않은 것은 모두 고르시오 ? (c)
		//a. - . 지역변수 값을 변경할 수 없다 	=o, 지역변수도 final을 붙일 수 있고 변경할 수 없는 상수가 됨
		//b. - . 클래스 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다 = O, 자식 클래스는 부모클래스의 내용을 추가할 수 없다.
		//c. - . 메서드 오버로딩을 할 수 없다 =x, 
		//d. - . 멤버변수 값을 변경할 수 없다 = o, final을 붙일 수 있고, 변경할 수 없는 상수가 된다.
		//
		//
		//[7-10] MyTv2  클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		//수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		//getter와 setter  메서드를 추가하라
		//[ ] 연습문제 /ch7/Exercise7_10.java
//		class MyTv2 {
				//			private boolean isPowerOn;
				//			// isPoweOn, Channel, Volume 이 멤버변수를 다른 곳에서
				//			//	사용하지 못하게 하기위해서 앞에 Private를 붙인다		
				//			private int channel; 
				//			private int volume; 
//			final int MAX_VOLUME = 100; 
//			final int MIN_VOLUME = 0; 
//			final int MAX_CHANNEL = 100; 
//			final int MIN_CHANNEL = 1; 
//			
//			//getter : 다른 클래스에서 읽게 하려고 사용
//			//setter : 다른 클래스에서 변경하게 하려고 사용
//			
				//			public int getVolume(){
				//				return volume; 
				//			} 
				//		public void setVolume(int volume){ 
				//			if(volume > MAX_VOLUME || volume < MIN_VOLUME)
				//				return; 
				//			this.volume = volume;
				//				} 
				//		public int getChannel(){ 
				//			return channel; 
				//		} 
				//		public void setChannel(int channel){
				//			if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) 
				//				return; 
				//			this.channel = channel; 
				//			}
				//		}
//
//
//
//
//		class Exercise7_10 {
//			public static void main(String args[]) { 
//				MyTv2 t = new MyTv2(); 
//				t.setChannel(10); 
//				System.out.println("CH:"+t.getChannel()); 
//				t.setVolume(20); 
//				System.out.println("VOL:"+t.getVolume()); } }
		//
		//
		//[7-11] 문제 에서 작성한 클래스에 이전 채널 로 이동하는 7-10 MyTv2 (previous channel)
		//기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
		//[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
		//메서드명 : gotoPrevChannel
		//기 능 현재 채널을 이전 채널로 변경한다 : .
		//반환타입 없음 :
//			매개변수 없음 :
//		class MyTv2 {
//			private boolean isPowerOn;
//			// isPoweOn, Channel, Volume 이 멤버변수를 다른 곳에서
//			//	사용하지 못하게 하기위해서 앞에 Private를 붙인다		
//			private int channel; 
//			private int volume; 
//				private int beforeChannel; // 이전채널
//			
//final int MAX_VOLUME = 100; 
//final int MIN_VOLUME = 0; 
//final int MAX_CHANNEL = 100; 
//final int MIN_CHANNEL = 1; 
//
////getter : 다른 클래스에서 읽게 하려고 사용
////setter : 다른 클래스에서 변경하게 하려고 사용
//
//			public int getVolume(){
//				return volume; 
//			} 
//		public void setVolume(int volume){ 
//			if(volume > MAX_VOLUME || volume < MIN_VOLUME)
//				return; 
//			this.volume = volume;
//				
//				} 
//		public int getChannel(){ 
//			return channel; 
//		} 
//		public void setChannel(int channel){
//			if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) 
//				return; 
//			this.channel = channel; 
//				beforeChannel = this.channel;
//				// set채널에서 채널값을 변경하는 곳이기 때문에 여기에 입력함
//				// this.channel이 지금 현재 채널을 가르키고 그걸 beforeChannel로 넣겠다는 의미
//			}
//		public void gotoPrevChannel(){
//			setChannel(beforeChannel); // set채널(현재채널)을 이전 채널로 이동하는 메서드
//		}
//		}


		//
		//
		//[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은 모두 고르시오 ? (c)
//			a. public . 은 접근제한이 전혀 없는 접근 제어자이다 = o, 접근에 제한이 없어 가능하다
//			b. (default) , . 가 붙으면 같은 패키지 내에서만 접근이 가능하다 = o, default는 같은 패키지에서 사용가능
//			c. . 지역변수에도 접근 제어자를 사용할 수 있다- x, 접근제어자가 사용될 수 있는 곳 : 클래스, 멤버변수, 메서드, 생성자에서 사용 가능하다
//			d. protected , . 가 붙으면 같은 패키지 내에서도 접근이 가능하다 -o, protected는 같은 패키지, 상속받은 클래서에서 가능
//			e. protected , . 가 붙으면 다른 패키지의 자손 클래스에서 접근이 가능하다-o, protected는 같은 패키지, 상속받은 클래서에서 가능
		//
		//
		
		
		
		
		
		
		
		//[7-13] Math클래스의 생성자는 접근 제어자가 private이다 그 이유는 무엇인가?
//		- 객체 생성을 막기 위해서 private이다.
//		- math클래스는 값이 딱 정해져 있어서 남들이 함부로 못바꾸게 하려고 
//		- 이미 정해진 형식을 못바꾸게 하려고

		
		
		
		
		
		//[7-15] 클래스가 다음과 같이 정의되어 있을 때 형변환을 올바르게 하지 않은 것은 , ?
		//( .) 모두 고르시오
		//class Unit {}
		//class AirUnit extends Unit {}
		//class GroundUnit extends Unit {}
		//class Tank extends GroundUnit {}
		//class AirCraft extends AirUnit {}
		//Unit u = new GroundUnit();
		//Tank t = new Tank();
		//AirCraft ac = new AirCraft();
		
		
		
		//a. u = (Unit)ac; - ground 유닛과 air유닛의 부로 클래스가 Unit이여서 부모클래스인 Unit으로 형변환하다.
		//b. u = ac; - 자식 클래스에서 부모클래스로 가는 것이므로 업케스팅이여서 생략이 가능하다.
		//c. GroundUnit gu = (GroundUnit)u; - 가능함 업케스팅 
		//d. AirUnit au = ac; - 가능함 업케스팅
		//e. t = (Tank)u; = 불가능함 , 실행이 안됨 다운케스팅은 맞지만 에러가 발생
		//f. GroundUnit gu = t; -가능함 업케스팅 
		//
		//
		//
		//[7-16] 다음 중 연산결과가 true가 아닌 것은 모두 고르시오 ? (e)
		//class Car {}
		//class FireEngine extends Car implements Movable {}
		//class Ambulance extends Car {}
		//FireEngine fe = new FireEngine();
		//a. fe instanceof FireEngine
		//b. fe instanceof Movable
		//c. fe instanceof Object
		//d. fe instanceof Car
		//e. fe instanceof Ambulance
		
		//fireEngine은 Ambulance와 연관이 없다. 조상만 같은 뿐 그 이외에 연관성이 없음
//		-instanceof : 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해 true를 반환한다.
		//
		//
		
		
		
		
		
		//[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 이라는 클래스를 만들고 이 Unit ,
		//클래스를 상속받도록 코드를 변경하시오.
//		public class Unit{
//			int x,y;
//			void move(int x, int y) { /* */ } //지정된 위치로 이동
//			void stop() { /* */ } //현재 위치에 정지
//		}
//		
//		
		//class Marine extends Unit { // 보병
		//int x, y; // 현재 위치
		//void move(int x, int y) { /* */ } 지정된 위치로 이동
		//void stop() { /* */ } 현재 위치에 정지
		//void stimPack() { /* .*/} 스팀팩을 사용한다
		//}
		//class Tank extends Unit { // 탱크
		//int x, y; // 현재 위치
		//void move(int x, int y) { /* */ } 지정된 위치로 이동
		//void stop() { /* */ } 현재 위치에 정지
		//void changeMode() { /* . */} 공격모드를 변환한다
		//}
		//class Dropship extends Unit{ // 수송선
		//int x, y; // 현재 위치
		//void move(int x, int y) { /* */ } 지정된 위치로 이동
		//void stop() { /* */ } 현재 위치에 정지
		//void load() { /* .*/ } 선택된 대상을 태운다
		//void unload() { /* .*/ } 선택된 대상을 내린다
		//}
		//
		
		
		
		
		
		
		
		
		
		
		//
		//[7-19] 다음은 물건을 구입하는 사람을 정의한 클래스이다 이 클래스는 멤버변수 Buyer .
		//로 돈 과 장바구니 를 가지고 있다 제품을 구입하는 기능의 메서드와 장 (money) (cart) . buy
		//바구니에 구입한 물건을 추가하는 메서드 구입한 물건의 목록과 사용금액 그리고 남 add , ,
		//은 금액을 출력하는 메서드를 완성하시오 summary .
		//1. : buy 메서드명
		//기 능 지정된 물건을 구입한다 가진 돈 에서 물건의 가격을 빼고 : . (money) ,
		//장바구니 에 담는다 (cart) .
		//만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
		//반환타입 없음 :
		//매개변수 구입할 물건 : Product p -
		//2. : add 메서드명
		//기 능 지정된 물건을 장바구니에 담는다 : .
		//만일 장바구니에 담을 공간이 없으면 장바구니의 크기를 배로 늘린 다음에 담는다 , 2 .
		//반환타입 없음 :
		//매개변수 구입할 물건 : Product p -
		//3. : summary 메서드명
		//기 능 구입한 물건의 목록과 사용금액 남은 금액을 출력한다 : , .
		//반환타입 없음 :
		//매개변수 없음 :
		//[ ] 연습문제 /ch7/Exercise7_19.java
		//class Exercise7_19 {
		//public static void main(String args[]) {
		//Buyer b = new Buyer();
		//b.buy(new Tv());
		//b.buy(new Computer());
		//b.buy(new Tv());
		//b.buy(new Audio());
		//b.buy(new Computer());
		//b.buy(new Computer());
		//b.buy(new Computer());
		//b.summary();
		//}
		//}
		//class Buyer {
		//int money = 1000;
		//Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
		//int i = 0; // Product cart index 배열 에 사용될
		//void buy(Product p) {
		///*
		//(1) . 아래의 로직에 맞게 코드를 작성하시오
		//1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
		//1.2 , 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		//1.3 .(add ) 장바구니에 구입한 물건을 담는다 메서드 호출
		//Java 3 - 의 정석 판 연습문제 풀이 定石 57
		//*/
		//}
		//void add(Product p) {
		///*
		//(2) . 아래의 로직에 맞게 코드를 작성하시오
		//1.1 i의 값이 장바구니의 크기보다 같거나 크면
		//1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
		//1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다
		//1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
		//1.2 (cart) . i 1 . 물건을 장바구니 에 저장한다 그리고 의 값을 증가시킨다
		//*/
		//} // add(Product p)
		//void summary() {
		///*
		//(3) . 아래의 로직에 맞게 코드를 작성하시오
		//1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
		//1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
		//1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		//*/
		//} // summary()
		//}
		//class Product {
		//int price; // 제품의 가격
		//Product(int price) {
		//this.price = price;
		//}
		//}
		//class Tv extends Product {
		//Tv() { super(100); }
		//public String toString() { return "Tv"; }
		//}
		//class Computer extends Product {
		//Computer() { super(200); }
		//public String toString() { return "Computer";}
		//}
		//class Audio extends Product {
		//Audio() { super(50); }
		//public String toString() { return "Audio"; }
		//}
		//[ ] 실행결과
		//잔액이 부족하여 을 를 살수 없습니다 Computer / .
		//구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
		//사용한 금액:850
		//남은 금액:150
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
		//[7-20] 다음의 코드를 실행한 결과를 적으시오.
		//[ ] 연습문제 /ch7/Exercise7_20.java
		//class Exercise7_20 {
		//public static void main(String[] args) {
		//Parent p = new Child();
		//Child c = new Child();
		
		//System.out.println("p.x = " + p.x);
		//p.method();
		//System.out.println("c.x = " + c.x);
		//c.method();
		
		//}
		//}
		//class Parent {
		//int x = 100;
		//void method() {
		//System.out.println("Parent Method");
		//}
		//}
		//class Child extends Parent {
		//int x = 200;
		//void method() {
		//System.out.println("Child Method");
		//}
		//}
		//
//		실행결과
//		100
//		parent method
//		200
//		child Method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//[7-24] 다음 중 인터페이스의 장점이 아닌 것은?(e)
		//a. . 표준화를 가능하게 해준다 - 같은 메서드를 사용하니깐 표준화 같음 O
		//b. . 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다 -o
		//c. . 독립적인 프로그래밍이 가능하다 -o, 클래스의선언과 구현을 분리시킬수있기 떄문에 실제구현에 독립적인 프로그램을 작성하는것이 가능
		//d. . 다중상속을 가능하게 해준다-o
		//e. . 패키지간의 연결을 도와준다. - , 클래스 연결은 도와주지만 패키지 연결은 잘 모르겠음

//
//
//
//
//
//
//			}
//
//		}
//
//	}
//
//}
