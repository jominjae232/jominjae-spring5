import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Hello {

	public static void main(String[] args) {
		//문자열변수를 하나 선언하고,
		//자기 이름을 영문변수에 저장하고
		// 그 변수안의 문자열을 출력한다.
		//String strName;
		//strName = "JO MIN JAE";
		//System.out.println(strName);
		
		//구구단 5단 작성 코딩
		/*
		int Num = 5;
		System.out.println(Num+"x1="+(Num*1));
		System.out.println(Num+"x2="+(Num*2));
		System.out.println(Num+"x3="+(Num*3));
		System.out.println(Num+"x4="+(Num*4));
		System.out.println(Num+"x5="+(Num*5));
		System.out.println(Num+"x6="+(Num*6));
		System.out.println(Num+"x7="+(Num*7));
		System.out.println(Num+"x8="+(Num*8));
		System.out.println(Num+"x9="+(Num*9));
		*/
		
		// 문자열을 콘솔에서 읽어들인다.
		// 그 문자열이 자기 이름의 이니셜과 같으면
		// 자기 이름 전체를 출력
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("이니셜을 입력 하세요.");
	       String str = sc.nextLine();
	       if(str.equals("JMJ")) {
	    	   System.out.println("전체 이름은: JO MIN JAE 입니다.");
	    	   System.out.println("프로그램이 정상 종료 되었습니다.");
	       } else if(str.equals("JNJ")) {
			System.out.println("error 다시 시도해주세요.(저장된 이니셜 값이 아닙니다.)");
			System.out.println("프로그램이 종료 되었습니다.");
		} else {
			System.out.println("해당 이니셜에 대한 데이터가 없습니다.");
			System.out.println("프로그램이 종료 되었습니다.");
		}
	     */
		
		/*
		Scanner sc = new Scanner(System.in);
		//문자열을 콘솔에서 읽어 들인다.
		String str = sc.nextLine();
		// 그 문자열이 자기 이름의 이니셜과 같으면
		if (str.equals("a")||str.equals("A")) {
			System.out.println("Apple");
		}else if (str.equals("b")||str.equals("B")) {
			System.out.println("Banana");
		}else if (str.equals("w")||str.equals("W")) {
				System.out.println("Watermelon");
		}else if (str.equals("s")||str.equals("S")) {
			System.out.println("Strawberry");
		} else {
			System.out.println("모르는 이니셜 입니다.");
		}
		System.out.println("프로그램 종료");
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		switch (str) {
		case "a"
		case "A":
			System.out.println("Apply");
			break;
		
		case "b"
		case "B":
			System.out.println("Banana");
			break;
		case "w"
		case "W":
			System.out.println("Watermelon");
			break;
		case "s"
		case "S":
			System.out.println("Strawberry");
			break;
		default:
			System.out.println("모르는 이니셜");
		}
		System.out.println("프로그램 종료");
		*/
		
		/*
		//값을 읽어들인다(정수)
		//89보다 크면 A
		//79보다 크면 B
		//69보다 크면 C
		//59보다 크면 D
		// 이외는 F를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        String str = sc.nextLine();
        int n = Integer.parseInt(str);
        if (n > 89) {//89보다 크면 A
            System.out.println("해당 숫자에 저장된 값은 A입니다.");
            System.out.println("프로그램이 종료 되었습니다.");
        } else if (n > 79) {//79보다 크면 B
            System.out.println("해당 숫자에 저장된 값은 B입니다.");
            System.out.println("프로그램이 종료 되었습니다.");
        } else if (n > 69) {//69보다 크면 C
            System.out.println("해당 숫자에 저장된 값은 C입니다.");
            System.out.println("프로그램이 종료 되었습니다.");
        } else if (n > 59) {//59보다 크면 D
            System.out.println("해당 숫자에 저장된 값은 D입니다.");
            System.out.println("프로그램이 종료 되었습니다.");
        } else {// 이외는 F를 출력
        	System.out.println("해당 숫자에 저장된 값은 F입니다.");
        	System.out.println("프로그램이 종료 되었습니다.");
        }
		*/
		
		/*
		//1부터 12까지 출력하는 while문
		int n = 1;
		while (n<=12) {
			System.out.println(n);
			n++;
		}
		*/
		
		/*
		//1부터 100까지 출력하는 while문
		int n = 1;
		while (n<=100) {
			System.out.println(n);
			n++;
		}
		*/
		
		/*
		//1부터 100사이의 홀수만 출력하는 while문
				int n = 1;
				System.out.println("이 프로그램은 1부터 100사이의 홀수만 출력합니다.");
				while (n<=100) {
					if(n%2==1)
					System.out.println(n);
					n++;
				}
			*/
		
			/*
				//1부터 100사이의 5의 배수만 출력하는 while문
				int n5 = 1;
				// 반복문에서 가장 치명적인 실수 = 무한히 반복하는 경우(무한루프)
				// 반복문 = 무한루프 회피 //System.out.println("n ["+n+"]");
				System.out.println("이 프로그램은 1부터 100사이의 5의 배수를 구합니다.");
				while (n5<=100) {
					if(n5%5==0)	{
						System.out.println("1부터 100사이의 5의 배수는 "+n5+"입니다!");
					}
				n5++;					
				} 
			*/
				
				/* (1) 사용자 입력을 받는다.
				   (2) 입력값이 'x'면 "프로그램 종료"를 출력하고 프로그램종료.
				   (3) 입력값이 
				   		(a) 'm'이면 "메뉴리스트"를 출력
				   		(b) 'o'면, "주문"을 출력
				   		(c) 's'면, "매출현황"출력
				   (4) (1)로 돌아간다.
				
				System.out.println("실행 값을 입력해주세요");
				System.out.println("이 프로그램은 사용자의 입력값에 반응하는 프로그램입니다.");
			       while(true) {
					Scanner sc = new Scanner(System.in);
					String str = sc.nextLine();
			       if(str.equals("x")) {
			    	   System.out.println("프로그램이 종료 되었습니다.");
			    	   break;
			       } else if (str.equals("m")) {
			    	   System.out.println("메뉴리스트");
			       } else if(str.equals("o")) {
			    	   System.out.println("주문");
			       } else if(str.equals("s")) {
			    	   System.out.println("매출현황");
			       }
			       System.out.println("실행 값을 다시 입력해주세요.");
			       }
			      */ 
			
		
		/* (1) 사용자 입력을 받는다.
		   (2) 입력값이 'x'면 "프로그램 종료"를 출력하고 프로그램종료.
		   (3) 입력값이 
		   		(a) 'm'이면 "메뉴리스트"를 출력
		   		(b) 'o'면, "주문"을 출력
		   		(c) 's'면, "매출현황"출력
		   (4) (1)로 돌아간다.
		   (5) do while문으로 작성
		
		System.out.println("실행 값을 입력해주세요");
		System.out.println("이 프로그램은 사용자의 입력값에 반응하는 프로그램입니다.");
				Scanner sc = new Scanner(System.in);
				String n = sc.nextLine();
				do {
				switch (n) {
				case "m":
					System.out.println("메뉴리스트"); break;
				case "o":
					System.out.println("주문"); break;
				case "s":
					System.out.println("매출현황"); break;
				}
				n =sc.nextLine();
			}while(!n.equals("x"));
			System.out.println("프로그램 종료");
	      */
	}
}
	       
