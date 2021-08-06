
public class Animal {
	int eye_count;
	int feet_count;
	
	Animal() {
		this.eye_count=2;
		this.feet_count=4;
	}
	Animal(int x, int y) {
		this.eye_count=x;
		this.feet_count=y;
	}
	void run() {
		System.out.println("달린다.");
	}
	void sound() {
		System.out.println("소리낸다.");
	}
}
