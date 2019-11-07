/*
모든 변수는 private으로 설정해야하며 public으로 선언된 getter, setter를 이용해서 접근한다.
데이터베이스에서 값을 가져올 때 거치는 장소이다.
*/

package vo;


public class UserVO {
	private String id; //id
	private String password; // 비밀번호
	private String name; // 이름
	private String email; // 이메일
	private String address; //주소
	
	private String phonenumber; //핸드폰 번호
	private int grade; // 회원등급
	private int mileage; // 마일리지
	private int money; // 적립금
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
		
}
