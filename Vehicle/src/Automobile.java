import java.util.ArrayList;

public class Automobile {

	public static void main(String[] args) {
		/*
		Car seltos = new Car();
		seltos.nColor="white"; //setting
		seltos.maxSpeed=240;
		seltos.nSpeed=0;
		seltos.guest=5;
		seltos.modelName="Trendy";
		seltos.nWheel=4;
		seltos.dailyRun=new ArrayList<Integer>();
		seltos.dailyRun.add(23);
		seltos.dailyRun.add(52);
		seltos.dailyRun.add(42);
		seltos.dailyRun.add(112);
		System.out.println("색상"+seltos.nColor); //getting
		System.out.println("최고속도"+seltos.maxSpeed);
		System.out.println("현재속도"+seltos.nSpeed);
		System.out.println("최대승객수"+seltos.guest);
		System.out.println("모델명"+seltos.modelName);
		System.out.println("바퀴갯수"+seltos.nWheel);
		for(int run:seltos.dailyRun) { //advance for
			System.out.println(run);
		}
		for(int i=0;i<seltos.dailyRun.size();i++) { //legacy for
			System.out.println(seltos.dailyRun.get(i));
		}
		*/
		
		// 학생클래스로 인스턴스변수 s1을 만든다.
		// s1안의 필드들에 적당한 값을 넣는다.
		// s1안의 필드들의 값을 화면에 출력
		// 컴퓨터 클래스로 인스턴스변수 sr을 만든다.
		// sr안에 필드들에 적당한 값을 넣는다.
		// sr안에 필드들의 값을 화면에 출력한다.
		// 1.student class정의한 부분
		// 2. computer class정의한 부분
		// 3. main에서 실행한 부분
		// 4. 콘솔에 출력된 화면 캡쳐
		// 3개의 자바 소스파일, 1개의 이미지 파일
		// 압축해서 본인이름.zip로 제출
		Student s1 = new Student();
		s1.name="Jason";
		s1.nYear=3;
		s1.nClass=4;
		s1.nNumber=32;
		s1.birthday="2000/07/28";
		s1.gender="MAN";
		s1.mobile="010-xxxx-xxxx";
		System.out.println("학생의 이름은 "+s1.name);
		System.out.println("학생의 학년은 "+s1.nYear);
		System.out.println("학생의 반은 "+s1.nClass);
		System.out.println("학생의 번호는 "+s1.nNumber);
		System.out.println("학생의 생년월일은 "+s1.birthday);
		System.out.println("학생의 성별은 "+s1.gender);
		System.out.println("학생의 핸드폰 번호는 "+s1.mobile);
		
		System.out.println("");
		Phon sr = new Phon();
		sr.nMemory=4;
		sr.nco=3;
		sr.charging="c타입";
		sr.screen="고화질";
		System.out.println("휴대폰의 메모리 공간은 "+sr.nMemory);
		System.out.println("휴대폰의 코어갯수는 "+sr.nco);
		System.out.println("휴대폰의 USB 타입은 "+sr.charging);
		System.out.println("휴대폰의 그래픽 화질은 "+sr.screen);
	}

}
