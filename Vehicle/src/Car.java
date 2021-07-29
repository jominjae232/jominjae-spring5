import java.util.ArrayList;

public class Car {
	// 속성=변수=필드(Java)/멤버변수(C++)
	private String nColor;
	private int maxSpeed;
	private int nSpeed;
	private int guest;
	private String modelName;
	private int nWheel;
	private ArrayList<Integer> dailyRun;
	// 동작=메소드(함수)=메소드(Java)/멤버함수(C++)
	
	/*
	반환값 메소드명(매개변수s) {
		~~~~~
		return 값/표현식
	}
	*/
	
	void drive(int x){
		this.nSpeed=x;
	}
	void stop() {
		this.nSpeed=0;
	}
	public String getnColor() {
		return nColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getnSpeed() {
		return nSpeed;
	}
	public int getGuest() {
		return guest;
	}
	public String getModelName() {
		return modelName;
	}
	public int getnWheel() {
		return nWheel;
	}
	public ArrayList<Integer> getDailyRun() {
		return dailyRun;
	}
	public void setnColor(String nColor) {
		this.nColor = nColor;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setnWheel(int nWheel) {
		this.nWheel = nWheel;
	}
	public void setDailyRun(ArrayList<Integer> dailyRun) {
		this.dailyRun = dailyRun;
	}
	
}
