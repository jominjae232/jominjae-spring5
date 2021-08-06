
public class Car {
	Tire frontLeft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;
	
	Car() {
		this.frontLeft = new Tire("왼쪽 앞바퀴",6);
		this.frontRight = new Tire("오른쪽 앞바퀴",2);
		this.backLeft = new Tire("왼쪽뒤",3);
		this.backRight = new Tire("오른쪽",4);
	}
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeft.roll()==false) {
			stop(); return 1;
		}
		if(frontRight.roll()==false) {
			stop(); return 2;
		}
		if(backLeft.roll()==false) {
			stop(); return 3;
		}
		if(backRight.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
