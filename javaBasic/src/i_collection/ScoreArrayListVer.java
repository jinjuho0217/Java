package i_collection;

import java.util.ArrayList;

public class ScoreArrayListVer {

	public static void main(String[] args) {
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
		
		ArrayList<String> students = new ArrayList<String>();
		ArrayList<String> subjects = new ArrayList<String>();
		ArrayList<ArrayList<Double>> scores = new ArrayList<ArrayList<Double>>();
		
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
		
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("JQuery");
		subjects.add("JSP");
		
		//점수 생성
		for(int i = 0; i < students.size(); i++){
			ArrayList<Double> score = new ArrayList<Double>();
			
			score.add(1.0); //석차 1등으로 초기화
			
			for(int j = 0; j < subjects.size(); j++){
				score.add((double)getRandom(50, 100));
			}
			
			scores.add(score);
		}
		
		//총점과 평균을 구한다.
		for(int i = 0; i < scores.size(); i++){
			ArrayList<Double> score = scores.get(i);
			int sum = 0;
			for(int j = 1; j < score.size(); j++){
				sum += score.get(j);
			}
			score.add((double)sum); //총점
			score.add((int)((double)sum / subjects.size() * 100 + 0.5) / 100d); //평균
		}
		
		//석차를 구한다.
		for(int i = 0; i < scores.size(); i++){
			for(int j = 0; j < scores.size(); j++){
				if(scores.get(i).get(subjects.size() + 1)
						< scores.get(j).get(subjects.size() + 1)){
					scores.get(i).set(0, scores.get(i).get(0) + 1);
				}
			}
		}
		
		//석차대로 정렬한다.
		for(int i = 0; i < scores.size() - 1; i++){
			for(int j = i + 1; j < scores.size(); j++){
				if(scores.get(i).get(0) > scores.get(j).get(0)){
					ArrayList<Double> temp = scores.get(i);
					scores.set(i, scores.get(j));
					scores.set(j, temp);
					
					String tempName = students.get(i);
					students.set(i, students.get(j));
					students.set(j, tempName);
				}
			}
		}
		
		//출력한다.
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.size(); i++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t총점\t평균");
		
		for(int i = 0; i < scores.size(); i++){
			System.out.print((int)((double)scores.get(i).get(0)) + "\t" + students.get(i));
			for(int j = 1; j < scores.get(i).size(); j++){
				if(j == scores.get(i).size() - 1){
					System.out.print("\t" + scores.get(i).get(j));
				}else{
					System.out.print("\t" + (int)((double)scores.get(i).get(j)));
				}
			}
			System.out.println();
		}
	}

	private static int getRandom(int from, int to){
		return (int)(Math.random() * (Math.abs(to - from) + 1))
				+ Math.min(from, to);
	}

}
