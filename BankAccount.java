package Hw12_2;

public class BankAccount implements Resettable{
	protected int balance;	//잔액
	protected int A;		// 입금 금액 총합
	protected int B;		// 출금 금액 총합
	//잔액을 매개변수로 하여 초기화 하는 생성자
	public BankAccount(int balance) {		
		this.balance =balance;
	}
	//입금
	public  void deposit(int a) {	//a =입금 금액
		balance +=a;
		A +=a;
	}
	//출금
	public void withdraw(int b) {	//b=출금 금액
		balance -=b;
		B +=b;
	}
	// toString 오버라이드
	@Override
	public String toString() {
		return "잔액은 " +balance+ "원 입니다.";
	}
	//기타 필요한 메소드
	public void reset() {
		balance = balance -A+B;
	}
}
//***************************
//파일명: BankTest.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: 입금 출금 메소드 구현
//***************************
