package Hw12_2;

public class BankTest {

	public static void main(String[] args) {
		System.out.println("hw12_2: ������");
		//1) ������ ���� ������� ��ü�� ���� new BankAccount(1000)
		BankAccount b1 = new BankAccount(1000);
		
		//������¿� 500�� �Ա�, 200�� ���
		b1.deposit(500);
		b1.withdraw(200);
		
		//(3) toString() ȣ���Ͽ� ������� ���� �˾Ƴ��� ���(�ܾ׸� ���)
		System.out.println(b1.toString());
	
		//(4) ������� ����
		b1.reset();
		
		//(5) toString() ȣ���Ͽ� ������� ���� �˾Ƴ������(�ܾ׸� ���)
		System.out.println(b1.toString());
		
		//(6) ������ ���� ����Ʈ ��ü�� ���� new Point(1.5, 2.5)
		Point p1 = new Point(1.5,2.5);
		
		//(7) ����Ʈ�� 2.1, 2.1 ��ŭ �̵�
		p1.move(2.1,2.1);

		//(8) ����Ʈ�� 10.0, 10.0 ��ŭ �̵�
		p1.move(10.0,10.0);
		//(9) toString() ȣ���Ͽ� ����Ʈ ���� �˾Ƴ��� ���(x, y ��ǥ�� ���)
		System.out.println(p1.toString());
		//(10) ����Ʈ ����
		p1.reset();
		//(11) toString() ȣ���Ͽ� ����Ʈ ���� �˾Ƴ��� ���(x, y ��ǥ�� ���)
		System.out.println(p1.toString());
		

	}

}
//***************************
//���ϸ�: BankTest.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: �Ա� ��� �޼ҵ� ���� �� move �޼ҵ� ����
//***************************
