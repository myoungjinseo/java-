package hw23_1;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("hw23_1: 서명진");
		Thread t1 = new MessageThread("hello");
		Thread t2 = new MessageThread("안녕");
		t1.start();
		t2.start();

	}

}
//***************************

//파일명: ThreadTest.java

//작성자: 서명진	

//작성일: 2021.12.08

//내용: Thread 상속 방법으로 스레드를 생성해본다.

//***************************