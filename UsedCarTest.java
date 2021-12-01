package Hw11_1;

public class UsedCarTest {

	public static void main(String[] args) {
			
		System.out.println("hw11_1: 서명진");
		//(1) Car 객체를 생성하되, 색상, 가격을 각각 "blue", 2000000로 초기화 하도록 생성한다.
		Car car1 = new Car("blue",2000000);
		
		//(2) 위의 자동차 객체에게 물어보아 색상, 가격을 알아내어 출력한다.
		System.out.println("car1의 색상 : "+car1.getColor()+", 가격 : "+car1.getPrice());
		
		//(3) UsedCar 객체를 생성하되, 색상, 가격, 생산연도를 각각 "red", 1000000, 2004로 초기화 하도록 생성한다.
		UsedCar car2 = new UsedCar("red",1000000,2004);
		
		
		//(4) 위의 중고차 객체에게 물어보아 색상, 가격, 생산연도를 알아내어 출력한다.
		System.out.println("car2의 색상 : "+ car2.getColor()+", 가격 : "+car2.getPrice()+", 생산연도 : "+car2.getYear());

	}

}

//***************************

//파일명: UsedCarTest.java

//작성자: 서명진

//작성일: 2021-11-11

//내용: Car 객체 생성과 UsedCar 객체 생성 및 출력(확인)

//***************************
