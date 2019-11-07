package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^ 뒷문자로 시작
		 * $ 앞문자로 종료
		 * . 임의의 문자 (줄바꿈 제외)
		 * * 앞 문자가 0개 이상
		 * + 앞문자가 1개 이상
		 * ? 앞문자가 없거나 1개
		 * [] 문자의 집합이나 범위([a-z] : a부터 z까지, [^a-z] : a부터 z가 아닌 것)
		 * {} 앞 문자의 개수 ({2} : 2개 {2,4} : 2게 이상 4개 이하)
		 * () 그룹화(1개의 문자처럼 인식)
		 * | OR 연산
		 * \s 공백, 탭, 줄바꿈
		 * \S 공백, 탭, 줄바꿈이 아닌 문자
		 * \w 알파벳이나 숫자
		 * \W 알파벳이나 숫자가 아닌 문자
		 * \d 숫자
		 * \D 숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분안함
		 * \ 정규식에서 사용되는 특수문자 표현
		 */
		
//		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";// 자바에서는 \를 사용하기 위해서는 \를 사용해야 한다 \\가 되야 정규표현식이 된다.
//		String regex = ".*";// 줄바꿈을 제외한 모든 문자 포함
		// 패턴을만들때는 범위가 좁게 만들어야 좋다.
//		
//		Pattern p = Pattern.compile(regex);
//		
//		Matcher m= p.matcher(str);
//		
//		System.out.println(m.matches()); // 결과 true , 패턴이 일치하기 때문에
//		
		
		//아이디, 전화번호, 이메일 주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		// 5~20자의 영문 소문자, 숫자와 특수기호(_)(-)만 사용가능합니다.
		// 전화번호 : 
		String str1 = "jin-8231";
		String regex1 = "[a-z|0-9|\\-\\_|A-Z]{5,20}";
		Pattern p1 = Pattern.compile(regex1);
		Matcher m1 = p1.matcher(str1);
		System.out.println(m1.matches());
		
		
		
		
		
	}

}
