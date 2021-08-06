
public class BeepTask implements Runnable {
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				System.out.println("땅");
			} catch (Exception e) {}
		}
	}
}
