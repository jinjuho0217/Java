package d_array;

import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		

		
		/*
		 * << 배열>>
		 * -int [] numbe =new int[5];  // 변수선언과 비슷 []만 다름 []타입과 변수 뒤에 붙을 수 있음// 기본값으로 초기화 된다.// int타입의 5개의 주소를 저장할수있음
		 * -int number [] = new int[]{10,20,30,40,50}; // 다시 초기화하는 거아니면 값을 바꿀수없음 new는 새로운 주소를 만듬
		 * -int[] number = {10,20,30,40,50};
		 * 
		 * 
		 */
		
		//배열은 참조형 타입이다.
//		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
//		array = new int[5];// 배열이 생성되고 그 주소가 저장된다.
//		//new : 새로운 저장공간 생성 및 주소 반환
//		//int[5] : int를 저장할 수 있는 5개의 공간
//		//배열 초기화시 기본값이 저장된다.
//		
//		System.out.println(array); // 주소가 저장되어 있다.
//		System.out.println(array[0]);
//		// 실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
//		// index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
//		// 배열의 최대 크기는 int의 최대값(약 20억)이다.
//		
//		String arrayStr = Arrays.toString(array);
//		//배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
//		System.out.println(arrayStr); //int의 기본값인 0이 저장되어있다.
//		
////		int[] iArray1 = new int[1, 2, 3]; // 값의 개수로 배열의 길이가 정해주지 않고 뒤에 {}를 넣고 값을 정해준다.
////		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
////		int[] iArray3;
////		iArray3 = {1, 2, 3}; // 선언과 초기화 따로는 불가능하다		
//	
		
		int[] a = new int[9];	
		
		
		//모든 인덱스에 있는 값을 변경해주세요.
		a[0] = 10;		
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;
		a[6] = 70;
		a[7] = 80;
		a[8] = 90;
		
		
		// 모든 인덱스에 있는 값을 더해주세요.
//		int sum = 0;
//		for(int i = 0; i <= a.length; i++){
//			sum += i; //sum = sum + i;
//			System.out.println(sum);
//			
//		}
//		
		// index는 1씩 증가하는 규칙이 있어 for문과 함께 사용하기 좋다. <배열.length(배열의 길이가 반환됨)>
//		for(int i = 0; i < a.length; i++){
//			System.out.println(i);
//		}
//		
//		// 배열의 길이를 알고있다고 리터럴을 사용하는 것을 하드코딩이라고 한다.
//		// 길이를 알더라도 length를 사용하는 것이 더 좋은 코드이다.
//		
//		for(int i = 0; i<a.length; i++){
//			a[i] =i + 1;
//			
//		}
		
		
		
		//배열의 숫자를 저장하고 합계와 평균을 구해주세요.
		int[] numbers = new int[100];
		 int sum = 0;
		 double avg = 0;
		for(int i = 0; i < numbers.length; i++){
			 numbers[i]  = (int)(Math.random() * 99) + 1;
			 System.out.println(numbers[i]);
			 sum +=numbers[i];
		}
		System.out.println(sum);
		avg = (double)sum / numbers.length;
		System.out.println("............."+numbers.length);
		System.out.println(avg);
		System.out.println("합계="+sum+"평균="+avg);
		
		//향상된 for문
		for(int nember : numbers//<배열>
			){// 배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(numbers);
		}
		for(int number : numbers){
			
			number = 0; // numbers의 값은 변경되지 않는다
		}
		System.out.println(Arrays.toString(numbers));
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		//배열의 값이 최소값도가 작으면 최소값에 배열의 값을 저장하고
		//배열의 값이 최대값보다 크면 최대값에 배열의 값을 저장한다.
		
		
		//최소값을 저장할 변수를 선언하고 0번 인덱스의 값으로 초기화한다.
		int min = numbers[0];
		// 최대값을 저장할 변수를 선언하고 0번 인덱스의 값으로 초기화한다.
		//배열의 길이만큼 반복하는 반복문을 만든다.
		int max = numbers[0];
		
		for(int i=0; i <numbers.length; i++){
			// 최소값을 저장할 변수보다 배열의 값이 작은 경우
			// 그 값을 최소값을 저장할 변수에 저장한다.
			
			//최대갑을 저장할 변수보다 배열의 값이 큰 경우
			// 그 값을 최대값을 저장할 변수에 저장한다.
			if(numbers[i] < min){
				min = numbers[i];
				
			}
			if(numbers[i] > max){
				max = numbers[i];
			}
			// 배열의 값을 섞어주세요.
			// 0번 인덱스의 값과 랜덤 인덱스의 값을 서로 교환한다.
			
		}System.out.println("min="+min);
		System.out.println("max="+max);
		int[]shuffle= new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i]=i+1;
		} 
		
		int c = 0;
		int random = 0;
		
		for(int i = 0; i < shuffle.length; i++){// 값을 찍어주는 부분
			System.out.println("-----------i="+i);
			for(int j = 0; j < shuffle.length; j++){//섞는부분
				System.out.println("------------j="+j);
				random= (int)(Math.random() *shuffle.length );
				c = shuffle[0];
				 shuffle[0] = shuffle[random];
				 shuffle[random] = c;
			}
			
		
		}System.out.println(Arrays. toString(shuffle));
		// 여러번 반복하는 반복문을 만든다.
		//랜던한 인덱스를 발생시켜 변수에 저장한다.
		// 0번 인덱스의 값을 임시로 저장한다.
		//배열의 랜덤인덱스 값을 0번 인덱스에 저장한다.
		// 임시로 저장한 값을 랜덤 인덱스에 저장한다.
		//배열의 내용을 출력한다.
		 
	
		
		// 배열은 길이를 변경할 수 없기 때문에 길이가 부족할 경우
		// 더 큰 배열에 복사를 해야한다.
		int[] temp = new int[shuffle.length *2];
		for(int i = 0; i < shuffle.length; i++){
			temp[i] = shuffle[i];
		}
		shuffle = temp;
		System.out.println(Arrays.toString(shuffle));
		
		//배열 복사 매서드
		int[] originArray = new int[]{1,2,3,4,5};
		int[] copyArray = new int[originArray.length * 2];
		System.arraycopy(originArray, 0, copyArray, 0, originArray.length); //ori인덱스의 0번을 copy인덱스의 0번부터 시작 에 ori.length번 저장을 하겠다.
		System.out.println(Arrays.toString(copyArray));
		
		
		int[]aa= new int[5];
		for(int i = 0; i < aa.length; i++){
			aa[i]=i+1;
		}
		int b = 0;
		int ran = 0;
		
		for(int i=0; i<aa.length; i++){
			for(int j=0; j < aa.length; j++){
				ran=(int)(Math.random()*aa.length);
				b = aa[0];
				aa[0] = aa[ran];
				aa[ran] = b;
				
			}
		}System.out.println(Arrays. toString(aa));
		
		
		
		// 1~10 사이의 난수를 500번 생산하고, 각 숫자가 생성된 횟수를 출력해주세요.
		//1,2,3,4,5,6,7,8,9,10이 몇번 나왔는지 출력해주세요.
		
		int[] count = new int[10];
		
		for(int i=0; i<500; i++){
			int random1 = (int)(Math.random()*10)+1;
				count[random1-1]++;
				
			
		}
		for(int i=0; i< count.length; i++){
			System.out.println(i+1+" : " +count[i]);
		}
		
	}


}
