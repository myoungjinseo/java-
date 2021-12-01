package Hw12_2;

public class Point implements Resettable{
	protected double x;		//x좌표
	protected double y;		//y좌표
	protected double X;		// x 총 이동 거리
	protected double Y;		// y 총 이동 거리

	//  x, y 좌표를 매개변수로 하여 초기화 하는 생성자
	public Point(double x, double y) {
		this.x =x;
		this.y =y;
	}
	// 이동 - x축이동량, y축이동량을 매개변수로 받아 좌표 이동
	public void move(double a,double b) {
		this.x +=a;
		this.y +=b;
		this.X +=a;
		this.Y +=b; 
	}
	// toString 오버라이드
	@Override
	public String toString() {
		return "x의 좌표: "+x + " y의 좌표: "+y;
	}
	//기타 필요한 메소드
	public void reset() {
		x -= X;
		y -= Y;
	}
	
}
//***************************
//파일명: BankTest.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: move 메소드 구현
//***************************
