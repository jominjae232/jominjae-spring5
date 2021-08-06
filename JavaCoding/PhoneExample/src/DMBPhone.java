
public class DMBPhone extends Phone {
	public DMBPhone(String owner) {
		super(owner);
	}
	public void turnOn() {
		System.out.println("DMB폰을 켭니다.");
	}
	public void turnOff() {
		System.out.println("DMB폰을 끕니다.");
	}
}
