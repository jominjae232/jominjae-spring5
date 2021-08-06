import java.util.Scanner;

public class Coffeeshop {

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
	    		   if (strM.equals("q")) { // 입력 받은 값이 q이면 실행 정지
	    			   System.out.println("메뉴 추가 작업을 종료합니다.");
	    			   break;
	    		   } else if (strM.equals("c")) { // 입력 받은 값이 c이면 실행
	    			   menu.appendMenu(); // 메뉴 추가 하기.
	    		   } else if (strM.equals("r")) { // 입력 받은 값이 r이면 실행
	    			   menu.showMenu(); // 메뉴목록 보기.
	    		   } else if (strM.equals("u")) { // 입력 받은 값이 u이면 실행
	    			   menu.changeMenu(); // 메뉴명&메뉴 가격 바꾸기.
	    		   } else if (strM.equals("d")) { // 입력 받은 값이 d이면 실행
	    			   menu.deleteMenu(); // 메뉴 삭제
	    		   }
	    		   System.out.println("메뉴 작업을 선택 해주세요.");
	    		   System.out.println("c:추가, r:목록보기, u:수정, d:삭제, q:메뉴관리 종료");
	    		   //menu.showMenu();	    		   
	    	   }
	       } else if(str.equals("o")) { // 입력 받은 값이 o이면 실행
	    	   // 출력: "메뉴 번호를 선택하세요."
	    	   // 값을 읽는다
	    	   // 메뉴 번호가 ""이 아닌 동안
	    	   // 출력: "수량을 입력하세요."
	    	   // 값을 읽는다.
    		   // 메뉴 번호로 메뉴명을 찾아낸다.
    		   // menu.getName(Integer.parseInt(Name));
    		   // 주문을 order에 추가 (order.addOrder(메뉴명문자열, 수량);)
    		   // 각 메뉴의 총액을 더한 전체 총액을 출력 (getTotalSum())
		       // System.out.println("지금까지 입력 받은 금액의 총합: "+a);
    		   // 출력: "모바일 번호를 입력하세요."
	    	   // 주문 고객의 모바일 번호를 입력받는다.
    		   // 실적에 추가한다.(나중에)
	    	   menu.showMenu();
	    	   Order order = new Order();
		    	   while(true) {
	    		   System.out.println("메뉴 번호를 선택하세요.");
	    		   String menu_num = sc.nextLine(); //메뉴 번호를 입력 받는다.
	    		   if(menu_num.equals("")) { // 메뉴 번호가 ""이면 while문 정지
	    			   break;
	    		   } else { // 메뉴 번호가 ""이 아닌 동안 while문 실행
		    			System.out.println("수량을 입력하세요.");
		    			int cnt = sc1.nextInt(); // 수량을 입력 받는다.
		    			System.out.println("주문 받은 메뉴 명 "+menu.getName(Integer.parseInt(menu_num))+" 주문 받은 갯수 "+cnt+"개 입니다."); // 주문 받은 메뉴명과 갯수 출력
		    			int price=menu.getPrice(Integer.parseInt(menu_num)); // 주문 받은 메뉴의 가격 가져온다.
		    			int Price = price*cnt; // 해당 메뉴 가격 * 갯수 = 해당 상품 주문 가격
		    			order.addOrder(menu_num, price, cnt); // 주문한 메뉴, 가격, 갯수를 order.addOrder에 저장한다.
		    			System.out.println("주문 받은 메뉴의 금액은: "+Price); // 주문 받은 금액 출력한다.
	    		   }
		    }
		    	   		order.getTotalSum(); // 지금까지 주문 받은 금액의 총합 출력
			    	   	System.out.println("모바일 번호를 입력하세요.");
			   			String Phone_Num = sc.nextLine(); // 모바일 번호를 입력 받는다.
			   			order.alMobile(Phone_Num); // 입력 받은 값 order.alMobile에 저장하고 입력값 출력한다.
		       } else if(str.equals("s")) { // 입력 받은 값이 s이면 실행
		    	   System.out.println("실적보기");
		       }
		       System.out.println("실행 값을 다시 입력해주세요.");
		       System.out.println("m: 메뉴 관리, o: 주문받기, s: 실적보기, x: 프로그램 종료");
			}
			sc.close();
			sc1.close();
	   }
	}