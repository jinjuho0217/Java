package e_oop;

public class Airconditioner {

	public static void main(String[] args) {
		
		Airconditioner aircon = new Airconditioner();
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		aircon.power();
		aircon.temperatureUp();
		System.out.println(aircon.temperature);
		aircon.temperatureDown();
		aircon.temperatureDown();
		System.out.println(aircon.temperature);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
		aircon.airVolume();
		System.out.println(aircon.airVolume);
				
		// 온도가 18~30도까지만 변경할 수 있게 해주시고,
		// 전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
		
		
		
	}
	boolean power; //전원
	int temperature;  // 온도
	int airVolume; // 풍량
	
	Airconditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	//전원버튼
	void power(){
		power = !power;
	}
	// 온도 + 버튼
	void temperatureUp(){
		if(power){
			if(temperature < 30){
				temperature++;	
			}
		}
	}
	//온도 -버튼
	void temperatureDown(){
		if(power && 18 < temperature){
			temperature--;
		}
	}
	// 풍량 버튼
	void airVolume(){
		if(power && 3<++airVolume){
			airVolume =1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
