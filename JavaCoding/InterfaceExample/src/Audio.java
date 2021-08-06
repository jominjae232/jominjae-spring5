
public class Audio implements RemoteControl {
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
	 }
}
