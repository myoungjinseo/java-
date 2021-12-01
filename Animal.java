package Hw12_1;

abstract class Animal {
	protected String name;		//이름
	
	// 이름을 매개변수로 받아 초기화하는 생성자
	public Animal(String name){
		this.name = name;
	}
	//  이름에 대한 getter
	public String getName() {
		return name;
	}
	//sound - 어떤 소리를 내는지를 출력하는 메소드로서, 추상메소드
	public abstract void sound();
	// newYear - 한 해가 지날 때 해야할 일을 정의한 메소드로서, 추상메소드
	public abstract void newYear();
	// toString 오버라이드
	@Override
	public String toString() {
		return name+" ";

	}
}

//***************************
//파일명: animal.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: sound, newYear 메소드 작성
//***************************

