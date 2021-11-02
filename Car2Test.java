package Hw7_1;

public class Car2Test {
	public static void main(String[] args) {
		Car2 mycar = new Car2();
		//myCar의 색상을 red, 속도를 0, 기어를 1로 지정
		mycar.color="red";
		mycar.speed = 0;
		mycar.gear=1;
		mycar.print();
		mycar.speedUp(20);		//myCar의 속도증가 메소드를 20번 호출
		mycar.print();
		mycar.changeGear(2);	//myCar의 기어변속 메소드를 호출하여 기어를 2로 변경	
		mycar.print();
		mycar.speedUp(20);		//myCar의 속도증가 메소드를 20번 호출
		mycar.print();
		mycar.speedDown(50);	//myCar의 속도감소 메소드를 50번 호출	
		mycar.print();
	}
	
	
	//***************************
	// 파일명: Car2.java
	// 작성자: 서명진
	// 작성일: 2021-10-11  => 10-12 수정
	// 내용: mycar 객체 생성 및 정보출력
	//***************************
	
	

}