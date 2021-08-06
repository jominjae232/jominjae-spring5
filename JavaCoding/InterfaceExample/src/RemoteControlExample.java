
public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl() {
			 private int _volume;
			 
			 public void turnOn() {
				 System.out.println("Audio를 켭니다.");
			 }
			 public void turnOff() {
				 System.out.println("Audio를 끕니다.");
			 }
			 public void setVolume(int m) {
				 if(m>RemoteControl.MAX_VOLUME) {
					 this._volume = RemoteControl.MAX_VOLUME;
				 } else if (m<RemoteControl.MIN_VOLUME) {
					 this._volume = RemoteControl.MIN_VOLUME;
				 } else {
					 this._volume = m;
				 }
				 System.out.println("현재 Audio 볼륨"+this._volume);
			 } // Anonymous
			 //인터페이스명 인스턴스 변수명 = new 구현클래스명();
		};
		tv.turnOn();
		tv.setMute(false);
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl.changeBattery();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(5);
		audio.setMute(true);
		audio.turnOff();
	}

}
