

public class BeepPrintSample {
	
	public static void main(String[] args) {
		// 순차적 실행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		for(int i=0; i<5; i++) {
			System.out.println("땅");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
	
}
