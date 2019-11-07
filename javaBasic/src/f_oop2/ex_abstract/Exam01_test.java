package f_oop2.ex_abstract;

public class Exam01_test {
	private boolean isPowerOn;
//	 isPoweOn, Channel, Volume 이 멤버변수를 다른 곳에서
	//	사용하지 못하게 하기위해서 앞에 Private를 붙인다		
	private int channel; 
	private int volume; 
	private int beforeChannel; // 이전채널
	
	final int MAX_VOLUME = 100; 
	final int MIN_VOLUME = 0; 
	final int MAX_CHANNEL = 100; 
	final int MIN_CHANNEL = 1; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
