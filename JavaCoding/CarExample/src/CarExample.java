
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int punckTire = car.run();
			switch(punckTire) {
			case 1: //front Left
				System.out.println("왼쪽 앞 펑크");
				break;
			case 2: //front Right
				System.out.println("오른쪽 앞 펑크");
				break;
			case 3: //back Left
				System.out.println("왼쪽 뒤 펑크");
				break;
			case 4: //back Right
				System.out.println("오른쪽 뒤 펑크");
				break;
			}
			if(punckTire != 0) break;
		}
	}
}
