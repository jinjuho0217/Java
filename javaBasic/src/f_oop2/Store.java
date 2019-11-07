//package f_oop2;
//
//public class Store {
//
//	public static void main(String[] args) {
//		
//		Customer c = new Customer();
//		product  p = new Desktop();
//		p.info();
//		c.buy(p);
//		
//		p = new tv();
//		p.info();
//		c.buy(p);
//		
//		c.showItem();
//		// product타입의 변수 p가 Desktop도 될수 있고, TV도 될수 있다.
//		// 이렇게 여러가지 형태를 가지는 특징을 다형성이라고 한다.
//		  
//		
//	}
//
//}
//
//
//class product{
//	String name;
//	int price;
//	
//	product(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
//	void info(){
//		System.out.println("----------------------");
//		System.out.println("상품명 : "+ name);
//		System.out.println("금 액 :"+price + "원");
//		System.out.println("----------------------");
//	}
//	int totalsum(int a, int b){
//		return a+b;
//	}
//}
//
//class Desktop extends product{
//	Desktop(){
//		super("삼성컴퓨터", 500000); // 부모클래스(product)의 생성자 호출
//	}
//}
//
//class tv extends product{
//	tv(){
//		super("LG TV", 1000000); // 부모클래스(product)의 생성자 호출
//	}
//}
//
//class Customer{
//	int money = 20000000;
//	product[] item = new product[10]; // 장바구니 , 부모타입의 배열로 담으면 된다.
//	
//	void buy(product p){
//		if(money < p.price){
//			System.out.println("돈이 부족합니다.");
//			return;
//		}
//		money -= p.price;
//		for(int i=0; i < item.length; i++){
//			if(item[i] == null){
//				item[i] = p;
//				break;
//			}
//		}
//		System.out.println(p.name + "을 구매했습니다.");
//	}ut.println("-------장바구니--------");
//		for(int i = 0; i < item.length; i++){
//			if(item[i] !=null){
//				System.out.println(i+1+" . " + item[i].name);
//			
//			}
//		}
//	System.out.println("------------");
//	}
//	
//}
//
//
//	
//	void showItem(){
//		System.o
//
//
//
//
//
//
//
//
