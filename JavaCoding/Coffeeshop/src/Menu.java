import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { //선언(정의) only. not Run code
	ArrayList<String> alName;
    private ArrayList<Integer> alPrice;
   
   Menu() {
      this.alName = new ArrayList<String>();
      this.alPrice = new ArrayList<Integer>();
      this.load();
//      this.alName.add("Americano");
//      this.alName.add("Espresso");
//      this.alName.add("Latte");
      //this.addName("Americano");
      //this.addName("Espresso");
      //this.addName("Latte");
//      this.alPrice.add(2000);
//      this.alPrice.add(2500);
//      this.alPrice.add(3000);
      //this.addPrice(2000);
      //this.addPrice(2500);
      //this.addPrice(3000);
      
//      for(int Num = 0; Num < this.alName.size();Num++)
//         System.out.println(this.alName.get(Num)+"\t"+this.alPrice.get(Num));
//      this.showMenu();
   }
   // 생성자 - 일종의 메소드
   // 용도: 주로 초기화 작업용.
   // 명명법: 이름이 클래스와 같아야 함.
   // 반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행) (Ex, void)
   // 실행/호출: new 연산자가 실행된 직후, 자동 실행
   // 다른 메소드/생성자를 호출할 수 있다.
   
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
   void addPrice(String price) {
	   this.alPrice.add(Integer.parseInt(price));
   }
   String getName(int menu_num) {
	   return this.alName.get(menu_num-1);
   }
   int getPrice(int menu_num) {
	   return this.alPrice.get(menu_num-1);
   }
   void appendMenu() {
	   	// 새 메뉴명 읽기
	   	@SuppressWarnings("resource")
	   	Scanner sc = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("메뉴명을 입력해주세요");
		String strM1 = sc.nextLine(); // 메뉴명을 입력 받는다.
		// 새 가격 읽기
		System.out.println("메뉴 가격을 입력해주세요.");
		int strP = sc1.nextInt(); // 메뉴 가격을 입력 받는다.
		// 메뉴명 추가
		addName(strM1); // 입력 받은 값을 메뉴명에 추가
		// 메뉴 가격 추가.
		addPrice(strP); // 입력 받은 값을 메뉴가격에 추가 
		System.out.println(strM1+" 메뉴가 추가 되었습니다."); // 메뉴가 정상적으로 추가 완료 되었다는 메세지 출력
   }
   void showMenu() {
      for(int Num = 0; Num < this.alName.size(); Num++)
         System.out.println((Num+1)+"\t"+this.alName.get(Num)+"\t"+this.alPrice.get(Num));
   }
   void changeMenu() {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		// 수정 할 메뉴 번호 읽기
		System.out.println("수정하고 싶은 메뉴 번호를 입력해주세요.");
		int x = sc.nextInt(); // 수정하고 싶은 메뉴 번호 입력 받는다.
		int menu_num = x-1; // 인덱스 값 -1
		// 수정된 메뉴명 읽기
		System.out.println("수정될 메뉴명을 입력해주세요.");
		String strN = sc1.nextLine(); // 수정될 메뉴명을 입력 받는다.
		String name = strN;
		this.alName.set(menu_num, name);
		// 수정된 가격 읽기
		System.out.println("수정될 가격을 입력해주세요.");
	    int price = sc2.nextInt(); // 수정 될 메뉴가격을 입력 받는다.
	    this.alPrice.set(menu_num, price);
	    System.out.println(x+"번 메뉴가 수정되었습니다."); // 해당 메뉴가 수정되었다는 메세지 출력
	   }
   void deleteMenu() {
	   // 삭제할 메뉴 번호 읽기
	   @SuppressWarnings("resource")
	   Scanner sc1 = new Scanner(System.in);
	   System.out.println("삭제할 목록의 번호를 입력해주세요");
	   int x = sc1.nextInt(); // 삭제할 메뉴 번호를 입력 받는다.
	   int menu_num = x;
	   // 메뉴 삭제
	   this.alName.remove(menu_num-1); // 해당 메뉴 번호 인덱스 값 -1한 메뉴 삭제
	   System.out.println(x+"번 메뉴가 삭제되었습니다."); // 삭제가 완료 되었다는 메세지 출력
   }
   void save() { // arraylist alName, alPrice를 화일(menu.txt)에 저장
	   File file=new File("c:/temp/menu.txt");
		if(file.exists()) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				for(int i=0;i<this.alName.size();i++) {
					String line = this.alName.get(i)+","+this.alPrice.get(i);
					writer.write(line);
					if((i+1)!=this.alName.size())
						writer.write("\r\n");
				}
				writer.flush();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
   }				
   void load() { // 화일 (menu.txt)을 읽어서 arraylist alName, alPrice에 로드
	   File file=new File("c:/temp/menu.txt");
		if(file.exists()) { 
			BufferedReader inFile = null;
			try {
				inFile = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String line;
			try {
				line = inFile.readLine();
				while(line!=null) {
					String[] parts = line.split(",");
					addName(parts[0]);
					addPrice(parts[1]);
					line=inFile.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
   	}
}