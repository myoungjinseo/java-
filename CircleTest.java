package Hw8_1;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("hw8_1: 서명진");
		
		//(1) 원 객체를 두개 생성(circle1, circle2라고 부르자)
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		//(2) circle1의 반지름을 1.2, 좌표를 (3, 4)로 설정
		circle1.SetR(1.2);
		circle1.SetX(3);
		circle1.SetY(4);
		
		//(3) circle2의 반지름을 -1.2, 좌표를 (-3, -4)로 설정
		circle2.SetR(-1.2);
		circle2.SetX(-3);
		circle2.SetY(-4);
		
		//(4) circle1을 x축으로 10, y축으로 20만큼 이동
		circle1.move(10,20);
		
		
		//(5) circle2도 x축으로 10, y축으로 20만큼 이동
		circle2.move(10,20);
		
		
		//(6) circle1, circle2 에게 각자의 현재 x, y좌표와 면적을 물어보아 알아내어 출력
		System.out.println("circle1의 면적: "+circle1.area(circle1.getR())+"\ncircle1의 x,y 좌표 ("+circle1.getX()+","+circle1.getY()+")");
		System.out.println("circle2의 면적: "+circle2.area(circle2.getR())+"\ncircle2의 x,y 좌표 ("+circle2.getX()+","+circle2.getY()+")");
		
		//***************************
		//파일명: Circle.java
		//작성자: 서명진
		//작성일: 2021-10-18
		//내용: 원의 면적 및 좌표를 불러오는 메소드 구현 생각해볼점 답안: 제 생각에는 move메소드가 없어도 이동을 가능하나, 
		//***************************
	}
	
}
