import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int Num = 0; Num < this.alName.size();Num++)
			System.out.println(this.alName.get(Num)+"\t"+this.alPrice.get(Num));
		//alName, alPrice 출력.
		/* 아메리카노	2500
		 * 라떼		3000
		 * 카푸치노	3500
		 */
	}
}
