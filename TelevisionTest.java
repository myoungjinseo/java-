package Hw9_1;

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: ������");
		//		�ڷ����� ��ü tv1�� ���� - ������1 ȣ���ϵ���
		Television tv1 = new Television ();
		System.out.println(tv1.toString());

		//		�ڷ����� ��ü tv2�� ���� - ������ �Ű������� �־� ������2 ȣ���ϵ���
		Television tv2 = new Television ("TV24");
		System.out.println(tv2.toString());
		
		//		�ڷ����� ��ü tv3�� ���� - ������ �Ű������� �־� ������3 ȣ���ϵ���
		Television tv3 = new Television ("TV32",340000);
		System.out.println(tv3.toString());
	}
	
	//***************************
		// ���ϸ�: Television .java
		// �ۼ���: ������
		// �ۼ���: 2021-11-03
		// ����: television�� ���� �� �� �Է� �� ��� ������ ���� 
		//***************************
}
