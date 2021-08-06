
public class BeepPrintSample2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread t = new Thread(beepTask);
		t.start();
		
		for(int i=0; i<5; i++) {
			try {
				System.out.println("띵");
			} catch (Exception e) {}
		}
	}

}
