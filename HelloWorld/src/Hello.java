import java.math.BigInteger;
import java.util.ArrayList;
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
		
		/*
		//100이하의 홀수를 출력하는 for문
		System.out.println("이 프로그램은 100이하의 홀수를 출력합니다.");
		for(int i=1;i<=100;i++) {
			if(i%2==1)
			System.out.println(i);
		}
		System.out.println("프로그램이 종료 되었습니다.");
		*/
		
		
		/*
		//for문 안에 for문을 넣어서, 구구단을 2단부터 9단까지 출력
		System.out.println("이 프로그램은 구구단 2~9단 까지 출력합니다.");
		for(int n=2;n<=9;n++){
			for(int i=1; i<=9;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
		*/
		
		
		/*
		for(int i=0;i<100;i++) {
			if(i>50) {
				System.out.println(i+"continue");
				continue;
			}
			System.out.println(i);
		}
		*/
		
		
		/*
		// Snake
		//1   2   3   4
		//8   7   6   5
		//9   10  11  12
		//16  15  14  13
		System.out.println("이 프로그램은 ㄹ자 순서로 숫자를 출력합니다.");
		Scanner sc = new Scanner(System.in);
        System.out.println("크기를 입력해주세요.");
        int n = sc.nextInt();
		  int r = 0;
		  int s;
		  int c = 1;
		  for (int i = 0; i < n; i++) {
		    s = n;
		    for (int j = 0; j < n; j++) {
		      if (r % 2 == 0) {	
		        System.out.printf("%3d ", c);
		      } else if (r % 2 != 0) {
		        System.out.printf("%3d ", c + (s - 1));
		        s = s - 2;
		      }
		        c++;
		    }
		    r++;
		    System.out.println("\n");
		  }
		  System.out.println("프로그램이 종료 되었습니다.");
			*/
		
		
		/*
		 int first = 1; 
         int second = 1;
         int third = 0;
         for (int i = 0; i < 18; i++) {
               third = first + second;           
               System.out.println(third);
               first = second; 
               second = third; 
         }
		*/
		
		
         
		/*
	      // 소수: 1과 자기자신으로 밖에는 나눠지지 않는 수
	      // N이라는 숫자가 있으면
	      // 2부터 N-1까지 숫자로 N을 나눈다.
	      // 예, 51이 소수인가?No. 2, %3==0 17
	      // 2부터 10000까지의 사이에 있는 모든 소수를 구하는 프로그램
	      System.out.println("이 프로그램은 입력 받은 수의 최대 소수까지를 출력합니다.");
	      Scanner sc = new Scanner(System.in);
	      System.out.println("숫자를 입력해주세요.");
	      int sci = sc.nextInt();
	         int i=0;
	           for(int n=2; n<=sci; n++) {
	               for(int j=2; j<=n; j++) {
	                    if(n%j ==0) {
	                         i++;
	                    }
	               }
	               if(i==1) {
	                    System.out.println(sci+"에 해당하는 소수는 "+n+"입니다.");
	               }
	               i=0;
	           }
	          System.out.println("프로그램이 종료 되었습니다.");
	          */
		
		/*
		// 12 24 숫자 두개
	      // 12: 2, 3, 4, 6, 12
	      // 24: 2, 3, 4, 6, 8, 12, 24
	      // 최소 공배수(두수의 공통배수 중 가장 작은 수), => 24
	      // 최대 공약수(두수의 약수 중 가장 큰 수) => 6
	      // 양의 정수 2개를 순서대로 입력 받는다.
	      // 최소 공배수 최대공약수를 구한다.
	      // 출력
	      // 최소공배수는 하나만 나옵니다..최대공약수도 마찬가지..
	        // 그리고 최대공약수가 두 숫자보다 작거나 같고
	        // 최소공배수는 두숫자보다 크거나 같아요..
	      int Num1;
	      int Num2;
	      int m=0;
	      int h=0;
	      int i=2;
	      Scanner sc1 = new Scanner(System.in);
	      System.out.println("첫번째 숫자를 입력해주세요");
	      Num1 = sc1.nextInt();
	      Scanner sc2 = new Scanner(System.in);
	      System.out.println("두번째 숫자를 입력해주세요.");
	      Num2= sc2.nextInt();
	      for(int q = 1; q<=Num1; q++) {
	         for(int i2 = 1; i2<=Num2; i2++) {
	         if(Num1%q==0 && Num2%q==0)
	            h=q;
	         q++;
	         }
	      m=Num1*Num2/h;
	      System.out.println("최대 공약수는 "+h+"입니다.");
	      System.out.println("최소 공배수 "+m+"입니다.");
	      }
	   }
	}
        */
        
        
		/*
	      //1부터 100까지 출력
	      int a = 0;
	      for (int i = 1; i<=100; i++) {
	         a = a + i;
	      }
	      System.out.println("1부터 100까지의 합은 "+a+"입니다.");
	   }
	}
	*/
		
		/*
	      // 팩토리얼 (n!)
	      // 4! = 4x3x2x1 = 24
	      // 10! = 10x9x8x7x6x5x4x3x2x1
	      // 양의 정수를 입력 받는다. 단, 10이하의 숫자
	      // 팩토리얼을 계산하는 프로그램.
	      int a = 1;
	      for (int i = 1; i<=5; i++) {
	         a = a * i;
	      }
	      System.out.println("해당 값의 팩토리얼은"+a+"입니다.");
	   }
	      */
		
		/*
	      ArrayList<String> studentName = new ArrayList<String>();
	      studentName.add("John");   //생성
	      studentName.add("Jane");
	      studentName.add("Jacob");
	      studentName.add("Johanson");
	      studentName.add("Jason");
	      studentName.add("James");
	      for(int i = 0; i < studentName.size(); i++) {
	         System.out.println(studentName.get(i));  //조회
	      }
	      System.out.println("\n\n\n");
	      studentName.set(3, "Jefferson");  //수정(replace)
	      for(int i = 0; i < studentName.size(); i++) {
	         System.out.println(studentName.get(i));  //조회
	      }
	      studentName.remove(3); // by index
	      studentName.remove("Jason"); //by Value
	      //delete data and reduce the length
	      studentName.clear(); //delete all
	      // method(메소드) get, add, set, size, remove, clear ...
	      */
		
		// 사용자 입력 읽어 들이기
		// 입력값이 'x'가 아닌 동안
		// 값이 'm':메뉴리스트
		// 값이 'o':주문
		// 값이 's':실적
		// ArrayList/Scanner이용
		// 학생들의 수학 점수를 읽어 들이는 프로그램
		// -1이 들어올때까지 ArrayList에 입력값이 채워지면서 늘어난다.
		// 읽어 들이기가 끝나면,
		// (1) 모든 학생의 점수를 출력
		// (2) 점수의 총합계, 평균 점수를 계산해서 출력
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자열을 입력해주세요.");
		String str = sc.nextLine();
		Integer.parseInt(str);
		String[] result = new String[str.length()];
		int total=0;
		int num=0;
		for(int i=0; i<str.length(); i++) {
			result[i] = str.substring(i, i+1);
			total += Integer.parseInt(result[i]);
			num = total / result.length;
		}
		System.out.println("입력받은 숫자의 값은 ["+str+"]입니다.");
		System.out.println("합계는 "+total+"입니다.");
		System.out.println("평균은 "+num+"입니다.");
	}
}
		*/
		
		
		/*
		ArrayList<Integer> point = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=-1) {
			point.add(n);
			
			n=sc.nextInt();
		}
		//입력된 점수를 출력
		for(int i = 0; i < point.size(); i++) {
			System.out.println(point.get(i));
		}
		int sum=0;
		for(int j = 0; j < point.size(); j++) {
			sum = sum + point.get(j);
		}
		System.out.println("합계는 ["+sum+"]입니다.");
		System.out.println("평균은 ["+(sum/point.size())+"]입니다.");
	}
}
	*/
		
		
		
		/*
		int n;
		n=12;
		Week Weekdays;
		Weekdays=Week.WEDNESDAY;
		System.out.println(Weekdays);
		*/
		
		
		/*
		for(int i=2;i<10;i++) {
			show(i); // 함수호출
			System.out.println("");
		}
	}
	// 함수(메서드) 선언(정의)
	// 변수 명명 규칙 (1) $,_,알파벳으로만 시작
	// (2) 두번째 문자부터는 $,_,알파벳,숫자 사용가능 
	// (3) 자바 키워드는 변수로 사용할 수 없다.
	public static void show(int i) {
		for(int j=1;j<10;j++) {
			System.out.println(i+"x"+j+"="+(i*j));
		}
	}
}
*/
		/*
		함수
		(1) 함수 선언
		(2) 함수 호출 => 함수를 실행시킨다.
		
		function(함수)==method(메소드)
		변수 명명 규칙과 같다.
		
		반환값의 타입 함수명(전달되는 변수/매개변수/파라미터/arguments) {
			실행코드(들)
		}
		show(10);//반환값이 없는 함수 호출
		
		void show(int x) {
			for()
			if()
			...
		}
		
		int x;
		...
		x = outprint(10,0);//반환값이 있는 함수 호출
		
		반환값의 타입이 정수 (int)인 함수 outprint
		전달 받는 값의 실수(float)인 경우
		int outprint(float x){
		.....
		return m;
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}