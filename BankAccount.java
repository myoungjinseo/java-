package Hw12_2;

public class BankAccount implements Resettable{
	protected int balance;	//�ܾ�
	protected int A;		// �Ա� �ݾ� ����
	protected int B;		// ��� �ݾ� ����
	//�ܾ��� �Ű������� �Ͽ� �ʱ�ȭ �ϴ� ������
	public BankAccount(int balance) {		
		this.balance =balance;
	}
	//�Ա�
	public  void deposit(int a) {	//a =�Ա� �ݾ�
		balance +=a;
		A +=a;
	}
	//���
	public void withdraw(int b) {	//b=��� �ݾ�
		balance -=b;
		B +=b;
	}
	// toString �������̵�
	@Override
	public String toString() {
		return "�ܾ��� " +balance+ "�� �Դϴ�.";
	}
	//��Ÿ �ʿ��� �޼ҵ�
	public void reset() {
		balance = balance -A+B;
	}
}
//***************************
//���ϸ�: BankTest.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: �Ա� ��� �޼ҵ� ����
//***************************
