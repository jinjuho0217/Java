package d_array;

public class Score_test {

	public static void main(String[] args) {
		
		
		String[] students = {
				"오동규", "박재욱", "오제민", "전보영", "유지상",
				"박신규", "진주호", "지원희", "한승희", "안정현",
				"이이슬", "이정은", "이선욱", "조건희", "최효은",
				"김혜정", "김명성", "신유진", "조윤호", "조아라",
				"백운영", "최도혁", "김영호", "박희제", "현솔비"};
		String[] subjects = {"Java", "Oracle", "HTML", "JQuery", "JSP"};
		double[][] scores = new double[students.length][subjects.length + 3];
		
		//점수 생성
		for(int i = 0; i < scores.length; i++){
			scores[i][0] = 1; //석차 1등으로 초기화
			for(int j = 0; j < subjects.length; j++){
				scores[i][j + 1] = (int)(Math.random() * 51) + 50;
				System.out.println(scores[i][j+1]);
			}
		}
		
		
		
	}

}
