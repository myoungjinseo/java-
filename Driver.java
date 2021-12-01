package Hw12_3;

//Dog 객체와 AlarmClock 객체를 하나씩만 생성하고 이용하는 드라이버 클래스
public class Driver {
public static void main(String[] args) {
	System.out.println("hw12_3: 서명진");
	//// Speakable 인터페이스를 구현하는 무명 클래스
	Speakable Dog = new Speakable() {
		public void speak() {
			   System.out.println("멍멍");
			}
   };
   //// Speakable 인터페이스를 구현하는 무명 클래스
   Speakable AlarmClock = new Speakable() {
	   private int number = 5;
	   public void speak() {
	      for(int i=0; i<number; i++)
	         System.out.print("삐");
	      System.out.println();
	      number = number + 3;
	   }
  };
   Dog.speak();
   AlarmClock.speak();
   AlarmClock.speak();
}
}

//***************************
//파일명: Driver.java
//작성자: 서명진
//작성일: 2021.11.19
//내용: 무명 클래스 이해
//***************************



