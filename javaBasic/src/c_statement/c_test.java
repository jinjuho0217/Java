package c_statement;

public class c_test {

	public static void main(String[] args) {
	
//		int score = 60;
//		String grade = null;
//		if(90<=score && 100 <=score){
//			grade = "A";
//		}else if(80 <= score){
//			grade = "B";
//		}else if(70 <= score){
//			grade = "c";
//		}else{
//			grade = "D";
//		}
//		System.out.println("점수"+score+"은"+grade+"입니다.");
		
//		int z = 1;
//		String g = null;
//		
//		if(z == 1){
//			g = "A";
//		}else if(z ==2){
//			g ="B";
//		}else if(z == 3){
//			g="C";
//		}else{
//			g = "D";
//		}
//		System.out.println(z +"는"+g+"입니다.");
		
		//문제1. 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
		
//		int num = 67;
//		String s = null;
//		
//		if(num <= 50){
//			s = "50이하 입니다.";
//			
//		}else if(num>=50){
//			s = "50이상 입니다.";
//			
//		}
//		System.out.println(num+"는"+s);
//		
		
		//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
		
//		int a = 24;
//		String b = null;
//		
//		if(a%3 == 0){
//			b = "3의 배수입니다.";
//		}else{
//			b = "3의 배수가 아닙니다.";
//		}
//		System.out.println(a+"는"+b);
		
		
//		문제3. 코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다. 
//
//	    4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//
//	    이를 판단하는 프로그램을 작성해보자.
//
//	    점수가 0미만 100초과이면 경고문구 출력!
//		
//		int grade = 4;
//		int score = 60;
//		
//		
//		if(0<= score && score <= 100){
//			if(score >= 70){
//				if(grade == 4){
//					System.out.println(grade+"학년"+score+"는 합격입니다.");
//				}if(grade !=4){
//					if(score <= 70){
//						System.out.println(grade+"학년"+score+"는 불합격입니다.");
//					}
//				}
//			}
//
//
//
//
//		}

//	
//		int sum = 0;
//		for (int i = 1; i <=10; i++){
//			if(i % 2 ==0){
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		
//		
//	int sum = 0;
//	for(int i =1; i<=10; i+=2){
//			sum +=i;
//		}
//	
//		
//		문제1. 사용자로부터 숫자 한개를 입력받아 1부터 그 숫자까지의 합을 구해보자.
//
//		   ex) 입력받은 숫자 : 5              
//
//		   1부터 5까지의 합 : 15
//		int sum = 0;
//		int a = 5;
//		for(int i = 1; i<a; i++){
//			sum += i;
//		}System.out.println("1부터"+a+"까지의 합"+sum);
//		
		
//		문제3. 영희가 은행에 500원(원금)을 입금했다. 하루에 1원씩 이자가 붙는다. 5일 후(일수) 잔액은 얼마가 되어 있을까?
//		int sum = 0;
//		int a = 500;
//		for(int i = 0; i<=5; i++){
//			sum = a + i;
//		}System.out.println(sum);
//			
	
//		[4-4] 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100 이상이 되는지 구하시오
//	
//		int sum = 0;
//		int s =1;
//		int num = 0;
//
//		for(int i =1; sum<100; i++, s=-s){
//			num = s *i;
//			sum += num;
//		}
//		System.out.println(sum);
//		System.out.println(num);
		
	int[] a = new int[9];
	
	int sum = 0;
	
	for(int i=0; i <a.length; i++){
		sum +=i;
	}
		
		
		
		
}
}
