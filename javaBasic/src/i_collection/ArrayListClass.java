package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add() : 마지막 위치에 객체를 추가
		 * get() : 지정된 위치의 객체를 반환
		 * set() : 지정된 위치에 주어진 객체를 저장(수정)
		 * remove() : 지정된 위치의 객체를 제거
		 * size() : 저장된 객체의 수 반환 
		 * 
		 */
		
//		ArrayList<Object> list = new ArrayList<Object>(); 
//		
//		list.add(10);
//		list.add("abc");
//		list.add(true);
//		
//		ArrayList<String> list2 = new ArrayList<>();
//		list2.add("abc");
//		list2.add("123");
//		list2.add("가나다");
//		list2.set(1, "456"); // 수정할 인덱스 번호, 수정할 내용
//	
//		for(int i=0; i< list2.size(); i++){
//			System.out.println(list2.get(i));
//			//abc
//			//456
//			//가나다
//		}
//		list2.remove(0);
//		// 리스트에 저장된 값을 삭제하면 그뒤의 모든 값의 인덱스가 당겨진다.
//		System.out.println(list2.get(0));
//		// 456-0번 인덱스로됨
//		System.out.println(list2.get(1));
//		//가나다 -1번 인덱스로옴
//		
//		
//		ArrayList<ArrayList<Integer>> list3 = new ArrayList<ArrayList<Integer>>(); // Array 리스트를 2차원 배열처럼 사용할 수 있다.
//		//ArratList안에 ArrayList를 넣으면됨
//		 ArrayList<Integer> list4 = new ArrayList<Integer>(); 
//		 list4.add(10);
//		 list4.add(55);
//		 list3.add(list4); // 값이 저장된 리스트를 저장
//		
//		list4 = new ArrayList<Integer>();
//		list4.add(20);
//		
//		list3.add(list4);
//		
//		
//		for(int i =0; i<list3.size(); i++){
//		System.out.println(list3.get(i));
//		}
//		
//		// 정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
//		ArrayList<Integer> list5 = new ArrayList<Integer>();
//		list5.add(10);
//		list5.add(20);
//		list5.add(30);
//		list5.add(40);
//		list5.add(50);
//		// 위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
//		int sum =0;
//		int avg =0;
//		for(int i=0; i<list5.size(); i++){
//			sum += list5.get(i);
//			System.out.println(sum+"------");
//			avg = sum/list5.size();
//			System.out.println(avg);
//		}
//		//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력하세요.
//		int Max= list5.get(0);
//		int Min = list5.get(0);
//		for(int i=0; i<list5.size(); i++){
//			if(list5.get(i) > Max ){
//				Max = list5.get(i);
//			}
//			else if(list5.get(i) < Min){
//				Min = list5.get(i);
//			}
//		}
//		System.out.println("Max :" + Max +" Min :"+Min);
//		
		/*
		 * 우리반 모두의 Java, Oracle, HTML, JQuery, JSP 점수를
		 * 50 ~ 100까지 랜덤으로 생성시켜주시고,
		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 석차	이름		Java	Oracle	HTML	JQuery	JSP		총점		평균
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 * 1	오동규	100		100		100		100		100		100		100
		 */
		
		ArrayList<String> students = new ArrayList<>();
		students.add("오동규");
		students.add("박재욱");
		students.add("오제민");
		students.add("전보영");
		students.add("유지상");
		students.add("박신규");
		students.add("진주호");
		students.add("지원희");
		students.add("한승희");
		students.add("안정현");
		students.add("이이슬");
		students.add("이정은");
		students.add("이선욱");
		students.add("조건희");
		students.add("최효은");
		students.add("김혜정");
		students.add("김명성");
		students.add("신유진");
		students.add("조윤호");
		students.add("조아라");
		students.add("백운영");
		students.add("최도혁");
		students.add("김영호");
		students.add("박희제");
		students.add("현솔비");
		System.out.println(students);
		
		ArrayList<String> subject = new ArrayList<>();
		subject.add("Java");
		subject.add("Oracle");
		subject.add("HTML");
		subject.add("JQuery");
		subject.add("JSP");
		subject.add("총점");
		subject.add("평균");
		System.out.println(subject+"\t");
		

		ArrayList<Integer> score = new ArrayList<Integer>();
		int sc =0;
		for(int i=0; i<5; i++){
			sc = (int)(Math.random()*51)+50;
			score.add(sc);
			System.out.println(sc);
			
		}
		
		ArrayList<Integer> sum = new ArrayList<Integer>();
		int sum1 =0;
		int avg = 0;
		for(int i =0; i<score.size(); i++){
			sum1 += score.get(i);
			avg = sum1/score.size();
		}
		System.out.println("총점 : "+sum1);
		System.out.println("평균 : "+avg);
		
		
		ArrayList<Object> num = new ArrayList<>();
		int a =0;
		for(int i=0; i<sum.size(); i++){
			if(sum.get(i) < sum.get(i+1)){
				
				
				
			}
		}


	}
}
