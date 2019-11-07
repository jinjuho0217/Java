package d_array;


public class sort_test {

	public static void main(String[] args) {
		//		//		
		//		//		int[] arr = {10,20,30,40,50};
		//		//		int sum1 = 0;
		//		//		
		//		//		for(int i=0; i<arr.length; i++){
		//		//			sum1 = sum1 +arr[i];
		//		//			System.out.println(sum1);
		//		//
		//		//		}
		//
		//		//		int[][] arr = {
		//		//				{5,5,5,5,5},
		//		//				{10,10,10,10,10},
		//		//				{20,20,20,20,20},
		//		//				{30,30,30,30,30}
		//		//		};
		//		//		int total = 0;
		//		//		float average = 0;
		//		//		int count = 0;
		//		////		System.out.println(arr);
		//		//		for(int i=0; i<arr.length; i++){
		//		//
		//		//			for(int j=0; j < arr[i].length; j++){
		//		//				total = total + arr[i][j];
		//		//				System.out.println("total은"+total);
		//		//				count++;
		//		//			}
		//		//		}
		//		//		average = (float)total / count;
		//		//		System.out.println("average"+average);
		//
		//
		//		//		public static void main(String args[])
		//		
		//			//		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		//			//	
		//
		//
		//			/* 
		////		(1) . 알맞은 코드를 넣어 완성하시오
		////		*/
		//			//		
		//
		//			//		} // main
		//			//		}
		//			//		[ ] 실행결과
		//			//		money=2680
		//			//		500 : 5 원
		//			//		100 : 1 원
		//			//		50 : 1 원
		//			//		10 : 3
		//		
		//		String[] words = { "television", "computer", "mouse", "phone" };
		//		Scanner scanner = new Scanner(System.in);
		//		for(int i=0;i<words.length;i++) {
		//		char[] question = words[i].toCharArray();	
		//		
		//		
		//		for(i = 0; i< question.length; i++){
		//			for(int j=0; j< question.length; j++){
		//				int random = (int)(Math.random()* question.length);
		//				char a = question[0];
		//				question[0] = question[random];
		//				question[random] = a;
		//						
		//			}
		//		
		//					
		//		}
		//
		//	
		//	}

		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다

		/* 
//		(1) . 알맞은 코드를 넣어 완성하시오
//		*/
		//		

		// main

		//		[ ] 실행결과
		//		money=2680
		//		500 : 5 원
		//		100 : 1 원
		//		50 : 1 원
		//		10 : 3
		//	int[] coinUnit = {500, 100, 50, 10};
		//	
		//	int money = 2680;
		//		
		//	
		//	for(int i=0;i<coinUnit.length;i++){
		//		if(i==10)
		//		System.out.println(coinUnit[i]+"원"+":"  + money/coinUnit[i]); // 각 동전별로 얼마가 필요한지 까지 밖에 못함, 누적시키면서 빼는거 해야됨
		//		money = money % coinUnit[i];
		//	}
		//	System.out.println("money="+money);


		//	int[] coinUnit = {500, 100, 50, 10};
		//
		//	int money = 2680;
		//	
		//	
		//	for(int i=0;i<coinUnit.length;i++) {
		//		if(i==10){
		//		 // 각 동전별로 얼마가 필요한지 까지 밖에 못함, 누적시키면서 빼는거 해야됨
		//		
		//		
		//				}System.out.println(coinUnit[i]+"원"+":"  + money/coinUnit[i]);
		//				money = money % coinUnit[i];
		//	}	
		//







		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
			counter[answer[i]-1]++; 
		}
		
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			
			for(int j=0; j < counter[i];j++) {
				System.out.print("*"); 
			}
			System.out.println();
		} 
	}
}









