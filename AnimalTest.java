package Hw12_1;

public class AnimalTest {
	private static Animal[] arrayOfAnimals;
	
	public static void main(String[] args) {

		System.out.println("hw12_1: 서명진");
		//(1) 크기가 4인 Animal 배열을 생성하고, 다음과 같은 Dog 객체 2개, Person 객체 2개를 생성하여 배열에 저장
	    //new Dog("진돌이", 13.5) 
	    // new Dog("진순이", 12.5)
	    //new Person("홍길동", 20)
	    //new Person("박길동", 25)
		arrayOfAnimals = new Animal[4];
		arrayOfAnimals[0]= new Dog("진돌이",13.5);
		arrayOfAnimals[1] =new Dog("진순이",12.5);
		arrayOfAnimals[2] = new Person("홍길동",20);
		arrayOfAnimals[3] = new Person("박길동",25);
		
		//(2) 반복문을 이용하여 배열 원소들의 정보를 출력
		for(int i =0; i<arrayOfAnimals.length; i++) {
			System.out.println(arrayOfAnimals[i].toString());
		}
		//(3) 반복문을 이용하여 배열 원소들의 sound() 메소드를 호출
		for(int i =0; i<arrayOfAnimals.length; i++) {
			arrayOfAnimals[i].sound();
		}
		//(4) 반복문을 이용하여 배열 원소들의 newYear() 메소드를 호출
		System.out.println("------------1년 후-----------");
		for(int i =0; i<arrayOfAnimals.length; i++) {	
			arrayOfAnimals[i].newYear();
		}
		//(5) 반복문을 이용하여 배열 원소들의 정보를 출력
		for(int i =0; i<arrayOfAnimals.length; i++) {
			System.out.println(arrayOfAnimals[i].toString());
		}
		//(6) 반복문을 이용하여 배열 원소들의 newYear() 메소드를 호출
		System.out.println("------------2년 후-----------");
		for(int i =0; i<arrayOfAnimals.length; i++) {
			arrayOfAnimals[i].newYear();
		}
		//(7) 반복문을 이용하여 배열 원소들의 정보를 출력
		for(int i =0; i<arrayOfAnimals.length; i++) {
			System.out.println(arrayOfAnimals[i].toString());
		}
		
	}

}
//***************************
//파일명: animalTest.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: sound, newYear 메소드 실행
//***************************
