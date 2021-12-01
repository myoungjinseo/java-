package Hw11_1;

//Car 클래스를 상속하되, 생산연도 속성을 추가로 지닌다.
class UsedCar extends Car{

	int year;		//생산연도
	
	//생산연도에 대한 getter
	public int getYear() {

	      return year;

	   } 
	
	//색상, 가격, 생산연도를 매개변수로 받아 초기화 하는 생성자
	public UsedCar(String color, int price, int year) {
		super(color,price);
		this.year = year;
	}
}
//***************************

//파일명: UsedCar.java

//작성자: 서명진

//작성일: 2021-11-11

//내용: UsedCar 생성자 작성 및 Year에 대한 getter만들기

//***************************