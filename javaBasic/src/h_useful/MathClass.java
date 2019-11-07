package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * round() : 반올림 // 반환하는 타입 long
		 * ceil() : 올림 // 반환하는 타입 double
		 * floor() : 내림// 반환하는 타입 double
		 * abs() : 절대값
		 * random() : double 난수발생(0.0~1.0미만)
		 */
		
		double d1 = 0.05;
		double d2 = -0.05;
		
		System.out.println(Math.round(d1)); 
		System.out.println(Math.round(d2));
		
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));
		
		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(d2));
		
		for(int i=0; i<20; i++){
			int random = getRandom(10,5); // 앞 뒤에 들어가는 순서상관없음
			System.out.print(random+" ");
		}
		
		
		
	}
	
	private static int getRandom(int from, int to){
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
	}

}
