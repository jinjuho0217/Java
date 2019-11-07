package e_oop;

public class tv_1 {

	public static void main(String[] args) {
		tv_1 tv_1 = new tv_1("삼성");
		
		tv_1.power();
		tv_1.channelUp();
		tv_1.changeChannel(99);
		tv_1.channelUp();
		tv_1.channelUp();
		tv_1.channelUp();
		tv_1.channelUp();
		tv_1.channelUp();
		tv_1.channelDown();
		tv_1.channelDown();
		tv_1.channelDown();
		tv_1.channelDown();
		tv_1.channelDown();
		tv_1.channelDown();
		tv_1.power();
		tv_1.volumeUp();
		tv_1.power();
		tv_1.volumeUp();
		tv_1.volumeUp();
		tv_1.volumeUp();
		tv_1.volumeUp();
		tv_1.volumeUp();
		tv_1.volumeUp();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
		tv_1.volumeDown();
	}
	
	//tv_1를 대상으로 가능한 tv_1와 비슷하게 tv_1 클래스를 만들어주세요.
	
	boolean power; //전원
	int channel; //채널
	int volume; //음량
	String brand; //브랜드
	
	final int MIN_CHANNEL = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_VOLUME = 0;
	final int MAX_VOLUME = 10;
	
	tv_1(String brand){
		power = false;
		channel = MIN_CHANNEL;
		volume = 5;
		this.brand = brand;
	}
	
	void power(){
		power = !power;
		System.out.println(power ? "tv_1 켜짐" : "tv_1 꺼짐");
	}
	
	void changeChannel(int channel){
		if(power){
			if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
				this.channel = channel;
			}
			System.out.println("채널. " + this.channel);
		}
	}
	
	void channelUp(){
		changeChannel(channel + 1);
	}
	
	void channelDown(){
		changeChannel(channel - 1);
	}
	
	void volumeUp(){
		if(power){
			if(volume < MAX_VOLUME){
				volume++;
			}
			showVolume(volume);
		}
	}
	
	void volumeDown(){
		if(power){
			if(MIN_VOLUME < volume){
				volume--;
			}
			showVolume(volume);
		}
	}
	
	void showVolume(int volume){
		System.out.print("음량. ");
		for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
			if(i <= volume){
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
	}
	

}

















