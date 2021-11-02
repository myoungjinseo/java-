package Hw7_1;

class Car2{
	String color; //색상
	int speed;	//현재 속도
	int gear;	//현재 기어
	
	void print(){		//정보출력
		System.out.println("현재 차량의 정보");		//수업 내용에는 없지만 가독성을 위해 넣었습니다.
		System.out.println("("+color+", "+speed+", "+gear+")");			
	}
	void speedUp(int a) {		//속도증가
		for (int i=0; i<a; i++) {		//a =반복할 값
			speed +=1;	
		}	
	}
	void speedDown(int a) {		//속도감소
		for (int i=0; i<a; i++) {	//a =반복할 값
			speed -=1;	
			if(speed ==0) {
				
				return ;
			}
		}
		
	}
	void changeGear(int a) {	//기어변속
		gear =a; // a=바꿀기어
	}
	
	//***************************
		// 파일명: Car.java
		// 작성자: 서명진
		// 작성일: 2021-10-11
		// 내용:car 클래스
		//***************************
}