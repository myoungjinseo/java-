package Hw12_2;

public class BankTest {

	public static void main(String[] args) {
		System.out.println("hw12_2: 서명진");
		//1) 다음과 같은 은행계좌 객체를 생성 new BankAccount(1000)
		BankAccount b1 = new BankAccount(1000);
		
		//은행계좌에 500원 입금, 200원 출금
		b1.deposit(500);
		b1.withdraw(200);
		
		//(3) toString() 호출하여 은행계좌 정보 알아내어 출력(잔액만 출력)
		System.out.println(b1.toString());
	
		//(4) 은행계좌 리셋
		b1.reset();
		
		//(5) toString() 호출하여 은행계좌 정보 알아내어출력(잔액만 출력)
		System.out.println(b1.toString());
		
		//(6) 다음과 같은 포인트 객체를 생성 new Point(1.5, 2.5)
		Point p1 = new Point(1.5,2.5);
		
		//(7) 포인트를 2.1, 2.1 만큼 이동
		p1.move(2.1,2.1);

		//(8) 포인트를 10.0, 10.0 만큼 이동
		p1.move(10.0,10.0);
		//(9) toString() 호출하여 포인트 정보 알아내어 출력(x, y 좌표만 출력)
		System.out.println(p1.toString());
		//(10) 포인트 리셋
		p1.reset();
		//(11) toString() 호출하여 포인트 정보 알아내어 출력(x, y 좌표만 출력)
		System.out.println(p1.toString());
		

	}

}
//***************************
//파일명: BankTest.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: 입금 출금 메소드 실행 및 move 메소드 실행
//***************************
