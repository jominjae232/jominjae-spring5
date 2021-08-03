import java.util.Scanner;

public class Coffeshop {

   public static void main(String[] args) {
    
      Menu menu = new Menu();
      
      //menu.showMenu();
      // "m": 메뉴관리
      // "o": 주문받기
      // "s": 실적보기
      // "x": 프로그램종료
      
      	System.out.println("실행 값을 입력해주세요");
		System.out.println("이 프로그램은 사용자의 실행 값에 반응하는 프로그램입니다.");
		System.out.println("m: 메뉴 관리, o: 주문받기, s: 실적보기, x: 프로그램 종료");
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		while(true) {
			String str = sc.nextLine();
	       if(str.equals("x")) {
	    	   System.out.println("프로그램이 종료 되었습니다.");
	    	   break;
	       } else if (str.equals("m")) {
	    	   // CRUD (추가/수정/삭제)
	    	   System.out.println("메뉴 작업을 선택 해주세요.");
	    	   System.out.println("c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료");
	    	   // 값을 읽는다.
	    	   // "q"가 아닌 동안
	    	   // "c": 새메뉴추가 작업 출력
	    	   // "r": 목록보기 출력
	    	   // "u": 기존 메뉴 수정(이름/가격) 수정
	    	   // "d": 기존 메뉴 삭제
	    	   // 메뉴 작업을 선택하시오(...)
	    	   // 새 값을 읽는다.
	    	   while(true) {
	    		   String strM = sc.nextLine();
	    		   if (strM.equals("q")) {
	    			   System.out.println("메뉴 추가 작업을 종료합니다.");
	    			   break;
	    		   } else if (strM.equals("c")) {
	    			   menu.appenMenu();
	    		   } else if (strM.equals("r")) {
	    			   menu.showMenu(); // 메뉴목록 보기.
	    		   } else if (strM.equals("u")) {
	    			   menu.changeMenu();
	    		   } else if (strM.equals("d")) {
	    			   menu.deleteMenu();
	    		   }
	    		   System.out.println("메뉴 작업을 선택 해주세요.");
	    		   System.out.println("c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료");
	    		   //menu.showMenu();	    		   
	    	   }
	       } else if(str.equals("o")) {
	    	   System.out.println("주문받기");
	       } else if(str.equals("s")) {
	    	   System.out.println("실적보기");
	       }
	       System.out.println("실행 값을 다시 입력해주세요.");
	       System.out.println("m: 메뉴 관리, o: 주문받기, s: 실적보기, x: 프로그램 종료");
		}
		sc.close();
		sc1.close();
		sc2.close();
			
	       
      
      
      /*
      menu.load();
      Scanner sc = new Scanner(System.in);
      Scanner sc1 = new Scanner(System.in);
      // 메뉴이름/가격을 입력하는 루틴
      // 메뉴이름이 ""이 입력되면 루틴(반복문) 종료
      // 그동안 입력된 메뉴명/가격 출력
      // menu.showMenu();
      System.out.println("이 프로그램은 메뉴를 생성하는 프로그램입니다.");
      while(true) {
         
         System.out.println("메뉴 이름을 넣어주세요. 종료하려면 엔터를 입력해주세요.");
         String n = sc.nextLine();
         if(n.equals("")) { //빈 문자열 입력
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
      */
      //sc.close();
      //sc1.close();
      
      
      /*
      //생성자 오버로딩(constructor overloading)<-다형성
      Car car = new Car();
      
      System.out.println(car.getnColor());
      System.out.println(car.getGuest());
      System.out.println(car.getMaxSpeed());
      System.out.println(car.getnSpeed());
      System.out.println("");
      
      Car avante = new Car("gery white",5,280,30);
      System.out.println(avante.getnColor());
      System.out.println(avante.getGuest());
      System.out.println(avante.getMaxSpeed());
      System.out.println(avante.getnSpeed());
      System.out.println("");
      
      Car grandeur = new Car("black",5,320,50,"Grandeur",4); 
      System.out.println(grandeur.getnColor());
      System.out.println(grandeur.getGuest());
      System.out.println(grandeur.getMaxSpeed());
      System.out.println(grandeur.getnSpeed());
      System.out.println(grandeur.getModelName());
      System.out.println(grandeur.getnWheel());
       */
      
      
   }
}