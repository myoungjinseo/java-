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

//���ϸ�: ThreadTest.java

//�ۼ���: ������	

//�ۼ���: 2021.12.08

//����: Thread ��� ������� �����带 �����غ���.

//***************************