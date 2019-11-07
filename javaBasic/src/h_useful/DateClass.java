package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); // 현재날짜  //1
		System.out.println(today); // 결과 : Tue Oct 15 11:04:54 KST 2019
		
		// 날짜 -> 포멧 -> 문자열
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"+"---------"); // 월을 나타낼때 대문자M //2
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss.sss"); // 대문자H일경우 24시간 기준 소문자h일 경우 12시간 기준으로 표시
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yy-MM-dd HH:mm:ss a");// 뒤의 소문자 a는 오전 오후 표시
		SimpleDateFormat sdf7 = new SimpleDateFormat("hh:mm:ss");
		String format = sdf1.format(today); //3 
		System.out.println(format); //4
		
		String format2 = sdf2.format(today); //2019-10-15
		System.out.println(format2);//11:17:09.009
		System.out.println(sdf3.format(today)); //2019-10-15 11:17:57.057
		System.out.println(sdf4.format(today)); //19-10-15 11:18:19 오전
		System.out.println(sdf7.format(today)); //11:37:06
		System.out.println();
		//문자열-> 포멧->날짜
		String str = "2019년 10월 16일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		// 예외처리안해서 컴파일에러발생
		try {
			Date dateStr = sdf5.parse(str);
			
			System.out.println(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		} 
		Calendar cal = Calendar.getInstance(); // getInstance는 객체를 반환
		//닐찌 셋팅
		cal.setTime(new Date());
		cal.set(2019, 9, 16); //2019/10/16(월은 0부터 시작)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MONTH, 2);//2019-10-16 11:31:56.056
		cal.add(Calendar.DAY_OF_MONTH, -3); //2020-12-13 11:31:56.056
		cal.add(Calendar.HOUR, 2); 
		cal.add(Calendar.MINUTE, 5); 
		cal.add(Calendar.SECOND, -15); 
		
		
		System.out.println(sdf3.format(cal.getTime()));
		
	}

}
