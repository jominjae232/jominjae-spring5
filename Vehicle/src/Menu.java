import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu { //선언(정의) only. not Run code
	ArrayList<String> alName;
    private ArrayList<Integer> alPrice;
   
   Menu() {
      this.alName = new ArrayList<String>();
      this.alPrice = new ArrayList<Integer>();
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
      this.showMenu();
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
   void showMenu() {
      for(int Num = 0; Num < this.alName.size();Num++)
         System.out.println(this.alName.get(Num)+"\t"+this.alPrice.get(Num));
      	//alName, alPrice 출력.
       	//아메리카노   2500
        //라떼      3000
		//카푸치노   3500   
   }
   void save() { // arraylist alName, alPrice를 화일(menu.txt)에 저장
	   
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