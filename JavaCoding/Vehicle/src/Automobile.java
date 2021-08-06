import java.util.Scanner;

public class Automobile {

   public static void main(String[] args) {
    
      Menu menu = new Menu();
      menu.showMenu();
      // m: 메뉴관리
      // o: 주문받기
      // s: 실적보기
      // x: 프로그램종료
      	System.out.println("실행 값을 입력해주세요");
		System.out.println("이 프로그램은 사용자의 입력값에 반응하는 프로그램입니다.");
		Scanner sc = new Scanner(System.in);   
		while(true) {			
			String str = sc.nextLine();
	       if(str.equals("x")) {
	    	   System.out.println("프로그램이 종료 되었습니다.");
	    	   break;
	       } else if (str.equals("m")) {
	    	   System.out.println("메뉴관리");
	       } else if(str.equals("o")) {
	    	   System.out.println("주문받기");
	       } else if(str.equals("s")) {
	    	   System.out.println("실적보기");
	       } else {
	    	   System.out.println("실행값이 잘못 되었습니다.");
	       }
	       System.out.println("실행 값을 다시 입력해주세요.");
	       }
			sc.close();
	       
      
      
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