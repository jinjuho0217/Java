package h_useful;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * equals() : 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length() : 문자열의 길이를 반환한다.
		 * substring() : 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt() : 저장된 위치의 문자를 반환한다.
		 * indexOf() : 주어진 문자의 위치를 반환한다.
		 * lastIndexOf() :  주어진 문자의 마지막 위치를 반환한다.
		 * replace() : 문자열 내의 주어진 문자(앞에있는 문자열)를 새로운 문자(뒤에있는 문자열)로 바꾼 문자열을 반환한다.
		 * replaceAll() : 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		 * split() : 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startsWith () : 주어진 문자열로 시작하는지 여부를 반환한다.
		 * endWith() :  주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase() : 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase() : 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim() : 양끝의 공백을 제거한 문자열을 반환한다.
		 */
		
		String str = "abc abc  abc";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("a",1));// 뒤의 1은 1번인덱스부터 찾으라는 말이여서 가운데a를 찾는다.
		System.out.println(str.indexOf("a",str.indexOf("a")+1)); // a를 찾는데 안에 있는 인덱스 다음부터 찾는다.
		System.out.println(str.lastIndexOf("a")); // 마지막에 있는 a를 찾음
		
		
		System.out.println(str.replace("a", "0"));// 결과: 0bc 0bc 0bc, 앞에 있는 하나만이 아니라 전부를 바꿔줌
		System.out.println(str.replaceAll("[a-z]", "0")); // 결과 : 000 000 000
		
		System.out.println(Arrays.toString(str.split(" "))); // 결과: [, a, b, c,  , a, b, c,  , a, b, c]
		System.out.println(Arrays.toString(str.split(" +")));// +는 앞에 있는 공백이 하나이상이라는 의미, 결과 : [abc, abc, abc]
		
		
		System.out.println(str.startsWith("a")); //결과 : true 해당 문자열이 이 문자로 시작할 경우 true
		System.out.println(str.endsWith("c")); // 결과 : true 해당문자열이 이 문자로 끝날 경우 true
		
		System.out.println(str.toUpperCase()); // 결과 : ABC ABC ABC
		System.out.println(str.toUpperCase().toLowerCase()); // 결과 : abc abc abc
		
		String str2 = " abc abc ";
		System.out.println(str2); // 결과 :  abc abc 
		System.out.println(str2.trim()); // 결과 : abc abc(앞뒤의 공백을 지워줌, 주로회원가입할 때 사용함.)
		
		
		
		String s1 = new String("Hello");
		System.out.println(s1); // 결과 : Hello
		char[] c={'H','e','l','l','o'};
		String s2 = new String(c);
		System.out.println(s2);
		StringBuffer sb=new StringBuffer("Hello");
		String s3 = new String(sb);
		System.out.println(s3);
		String s4 = "Hello";
		String n ="0123456";
		char c1 = s4.charAt(1);
		char c2 = n.charAt(1);
		System.out.println(c1);
		System.out.println(c2);
		int i1 ="aaa".compareTo("aaa");
		int i2 ="aaa".compareTo("bbb");
		int i3 ="bbb".compareTo("aaa");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		String s5 = "Hello";
		String s6 = s5.concat(" World");
		System.out.println(s6);
		String s7 = "abcdefg";
		boolean b1 = s7.contains("bc");
		System.out.println(b1);
		String s8 = "Hello";
		boolean b2 = s8.equals("Hello");
		boolean b3 = s8.equals("hello");
		System.out.println(b2);
		System.out.println(b3);
		String s9 = "Hello";
		int idx1 = s9.indexOf('o');
		int idx2 = s9.indexOf('k');
		System.out.println(idx1);
		System.out.println(idx2);
		String s10 = "ABCDEFG";
		int idx3 = s10.indexOf("CD");
		System.out.println(idx3);
		String s11 = new String("abc");
		String s12 = new String("abc");
		boolean b4 = (s11==s12);
		boolean b5 = s11.equals(s12);
		boolean b6 = (s11.intern()==s12.intern());
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		String s13  = "java.lang.Object";
		int dix3 = s13.lastIndexOf('.');
		int dix4 = s13.indexOf('.');
		System.out.println(dix3);
		System.out.println(dix4);
		String s14 = "java.lang.java";
		int idx5 = s14.lastIndexOf("java");
		int idx6 = s14.indexOf("java");
		System.out.println(idx5);
		System.out.println(idx6);
		String s15 ="Hello";
		int length = s15.length();
		System.out.println(length);
		String s16 = "Hellollo";
		String s17 = s16.replace("11","LL");
		System.out.println(s17);
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB","bb");
		System.out.println(r);
		String ab1 = "AABBAABB";
		String r1 = ab.replaceAll("BB", "bb");
		System.out.println(r1);
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		String animals1 = "dog, cat, bear";
		String[] arr1 = animals.split(",",2);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		String s = "java.lang.Object";
		String c3 = s.substring(10);
		String p = s.substring(5,9);
		System.out.println(c);
		System.out.println(p);
		String s18 = "Hello";
		String s19 = s18.toLowerCase();
		System.out.println( s18);
		String s20 = "Hello";
		String s21 = s20.toString();
		String s22 = "Hello";
		String s23 = s22.toUpperCase();
		System.out.println(s23);
		String s24 = "	Hello World	";
		String s25 = s24.trim();
		String b = String.valueOf(true);
		String c4 = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		System.out.println(b);
		System.out.println(c4);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(date);
	
	
	
	
	
	
	
	
	}

}
