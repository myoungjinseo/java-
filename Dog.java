package Hw12_1;

class Dog extends Animal {
	protected double speed; 		//속도(실수형)
	//이름, 속도를 매개변수로 받아 초기화하는 생성자
	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}
	// toString 오버라이드
	@Override
	public String toString() {
		return super.toString() +"시속"+speed+"km";

	}

	//기타 필요한 메소드들
	public void sound() {
		System.out.println("멍멍 " + name);
	}
	//기타 필요한 메소드들
	public void newYear() {
		this.speed += 5;
	}
}
//
//***************************
//파일명: Dog.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: sound, newYear 메소드 구현
//***************************

