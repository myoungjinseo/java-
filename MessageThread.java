package hw23_1;

public class MessageThread extends Thread{

	String Message;
	public MessageThread(String Message) {
		this.Message =Message;
	}
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.print(Message+" ");
		}
	}
}

//***************************

//파일명: ThreadTest.java

//작성자: 서명진	

//작성일: 2021.12.08

//내용: Thread 상속 방법으로 스레드를 생성해본다.

//***************************