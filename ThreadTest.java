package hw23_1;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println("hw23_1: ������");
		Thread t1 = new MessageThread("hello");
		Thread t2 = new MessageThread("�ȳ�");
		t1.start();
		t2.start();

	}

}
//***************************

//���ϸ�: ThreadTest.java

//�ۼ���: ������	

//�ۼ���: 2021.12.08

//����: Thread ��� ������� �����带 �����غ���.

//***************************