package d_array;

import java.util.Arrays;

public class array_test {

	public static void main(String[] args) {
		// 1~10 사이의 난수를 500번 생산하고, 각 숫자가 생성된 횟수를 출력해주세요.
		//1,2,3,4,5,6,7,8,9,10이 몇번 나왔는지 출력해주세요.
		int random;
		int[] count;
		count = new int[10];
		for(int i =0; i<500; i++){
			random = (int)(Math.random()*10)+1;
			count[random-1]++;
		}
		for(int i = 0; i< count.length; i++){
	
			System.out.println(i+1+"의 갯수 : " + count[i]);
		}
//
//			if(random==1){
//				count[0] = count[0]+ 1;
//			}if(random == 2){
//				count[1] = count[1]+ 1;
//			} if(random == 3){
//				count[2] = count[2]+ 1;
//			} if(random == 4){
//				count[3] = count[3]+ 1;
//			} if(random == 5){
//				count[4] = count[4]+ 1;
//			} if(random == 6){
//				count[5] = count[5]+ 1;
//			} if(random == 7){
//				count[6] = count[6]+ 1;
//			} if(random == 8){
//				count[7] = count[7]+ 1;
//			} if(random == 9){
//				count[8] = count[8]+ 1;
//			} if(random == 10){
//				count[9] = count[9]+ 1;
//			} 
			
//			for(int j=0; j<10; j++){
//				if(random==j+1){
//					count[j] = count[j]+ 1;
//				}
//			}
//		
//		System.out.println("1의 개수= "+count[0]);
//		System.out.println("2의 개수= "+count[1]);
//		System.out.println("3의 개수= "+count[2]);
//		System.out.println("4의 개수= "+count[3]);
//		System.out.println("5의 개수= "+count[4]);
//		System.out.println("6의 개수= "+count[5]);
//		System.out.println("7의 개수= "+count[6])
//		System.out.println("8의 개수= "+count[7]);
//		System.out.println("9의 개수= "+count[8]);
//		System.out.println("10의 개수= "+count[9]);
//		for(int i = 0; i<10; i++){
//			System.out.println(i+1+"의 개수"+count[i]);
//		}
	}
}


