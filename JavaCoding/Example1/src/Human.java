
public class Human extends Animal { //Human은 Animal을 상속한다.
	// 생성자 오버라이딩(Overriding)
	// 부모 생성자 무시
	Human() {
		super(2,2);
		//this.eye_count=2;
		//this.feet_count=2;
	}
	void run() {
		System.out.println("걷는다.");
	}
	void sound() {
		System.out.println("말한다.");
	}
	void study() {
		System.out.println("공부한다.");
	}
}
