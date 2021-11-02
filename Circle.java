package Hw8_1;

public class Circle {
	//반지름, x좌표, y좌표(세 값 모두 실수)
	double r;
	double x;
	double y;
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public double getR() {
		return r;
	}
	
	public void SetX(double X){
		x  =X;
	}
	
	public void SetY(double Y){
		y  =Y;
	}
	
	public void SetR(double R){
		if(R <0) {
			r  =1.0;
		} else {
			r = R ;
		}	
	}
	
	//면적을 계산하여 리턴(파이값은 3.14로 할 것). 
	public double area(double R) {
		return  R * R * 3.14;
	}
	
	// a =x축 이동거리   b= y축 이동거리  입니다.
	// return 값은 getX , getY 로 넣어집니다.
	public void move(double a ,double b) {
		x += a;
		y += b;
		
		
	}
	
	
	
	//***************************
		//파일명: Circle.java
		//작성자: 서명진
		//작성일: 2021-10-18
		//내용: getter와 setter를 이용한 메소드 생성
		//***************************
}
