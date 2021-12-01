package Hw12_1;

class Person extends Animal{
	protected int age;		//나이
	//이름, 나이를 매개변수로 받아 초기화하는 생성자
	public Person(String name, int age) {
		super(name);
		this.age = age;
	}
	
	//기타 필요한 메소드들
	public void sound() {
	
		System.out.println("안녕 " + name);
	}
	//기타 필요한 메소드들
	public void newYear() {
		this.age +=1;
	}
	
	//   toString 오버라이드
	@Override
	public String toString() {
		return super.toString() + age+"세";

	}
	
	
}

//***************************
//파일명: Person.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: sound, newYear 메소드 구현
//***************************

