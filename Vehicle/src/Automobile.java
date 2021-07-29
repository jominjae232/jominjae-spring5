import java.util.Scanner;

public class Automobile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		// 메뉴이름/가격을 입력하는 루틴
		// 메뉴이름이 ""이 입력되면 루틴(반복문) 종료
		// 그동안 입력된 메뉴명/가격 출력				
		// menu.showMenu();
		System.out.println("이 프로그램은 메뉴를 생성하는 프로그램입니다.");
		Menu menu = new Menu();
		menu.init();
		while(true) {
			
			System.out.println("메뉴 이름을 넣어주세요. 종료하려면 엔터를 입력해주세요.");
			String n = sc.nextLine();
			if(n.equals("")) {
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}
			menu.addName(n);
			System.out.println("메뉴 가격을 입력해주세요.");	
			
			int point1 = sc1.nextInt();
			menu.addPrice(point1);
			System.out.println("메뉴 입력이 완료되었습니다");
			//System.out.println("입력된 메뉴는"+menu.getshowPrice()+"입력된 가격은"+menu.getshowPrice()+"입니다.");
		}
		menu.showMenu();
	}
}
