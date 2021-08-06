import java.util.Scanner;

public class Test1 {
   public static void main(String[] args) {
	    Animal animal = new Animal(2,2);
		
		System.out.println("눈: "+animal.eye_count);
		System.out.println("발: "+animal.feet_count);
		animal.run();
		animal.sound();
		
	    Human ningen = new Human();
	    
	    System.out.println("인간 눈: "+ningen.eye_count);
	    System.out.println("인간 발: "+ningen.feet_count);
	    ningen.run();
	    ningen.sound();
	    
	    
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   /*
	   Reuse rus = new Reuse();
	   System.out.println(rus.nNumber);
	   */
	   
	   
	   /*
	   Scanner s = new Scanner(System.in);
      
      Test2 t = new Test2();
      t.setField(10);
      t.setField("Hello");
      System.out.println(t.getT1()+","+t.getT2());
      t.setk(7);
      System.out.println(t.getk());
      Test2 tx = new Test2();
      System.out.println(tx.getk());
      
      Reuse rus = new Reuse();
      */
      
      
      /*
      Test2 t = new Test2(7,"Hello");
      
      System.out.println(t.getT1());
      System.out.println(t.getT2());
      t.showAll();
      
      Test2 tx = new Test2(24,"World");
      
      System.out.println(tx.getT1());
      System.out.println(tx.getT2());
      tx.showAll();
      
      // 메소드 오버로딩 이용 <- 다형성
      tx.setT1();      // 7
      tx.setT1(100);   // 100
      tx.setT1("-24"); // -24
      */
      
      
      
      
      
      /*
      // 변수 사용 가능 범위(중괄호 내로 제한된다.)
      // scope
      // endoscope (내시경)
      // microscope (현미경)
      // Telescope (망원경)
      int a=20,b=9;
      for(int i=0;i<10;i++) {
         System.out.println(i+"/"+a);
      }
      System.out.println("ok");
      for(int i=0;i<5;i++) {
         System.out.println(i*2+"/"+a);
      }
      f1(a,b);
      System.out.println(a+"/"+b);
      /*
       * (1) 10, 9 (2) 20, 9 (3) 10, -1 
       
      if(a>b) {
         //block
      } else {
         
      }
   }

   private static void f1(int a, int b) {
      a=10;
      b=-1;
      */
   }

}