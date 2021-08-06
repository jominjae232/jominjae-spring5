import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal; // Generic (포괄적인, 일반적인)
//	ArrayList<Menu> alCollection;
	
	Order() {
		this.alMobile = new ArrayList<String>();
		this.alMenu = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alTotal = new ArrayList<Integer>();
	}
	
	void alMobile(String Num) {
		this.alMobile.add(Num);
		System.out.println("입력 받은 모바일 번호는"+Num+"입니다.");
	}
	int addOrder(String name, int price, int cnt) {
		// 주문 메뉴명 추가
		this.alMenu.add(name);
		this.alCount.add(cnt);
		// 주문 수량 추가
		// 합계계산+추가+반환
		int total=price*cnt;
		this.alTotal.add(total);
		return total;
	}
	int getTotalSum() {
	      int sum = 0;
	      for(int i = 0; i < alTotal.size(); i++) {
	    	  	// 주문 리스트의 총액을 모두 더해서 합계를 반환
	    	  	sum = sum + alTotal.get(i);
	    	  }
	      System.out.println("지금까지 주문 받은 메뉴의 총 가격은: " + sum);
		return sum;
	}
}
