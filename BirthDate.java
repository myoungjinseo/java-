import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		System.out.println("hw5_1:������");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("�ֹε�Ϲ�ȣ ���ڸ� �Է�: ");
		int a = scan.nextInt(); // �ֹε�Ϲ�ȣ ���ڸ�
		System.out.println("�ֹε�Ϲ�ȣ ���ڸ� �Է�: ");
		int b =	scan.nextInt(); 	//�ֹε�Ϲ�ȣ ���ڸ�
	
		int year;
		int month;
		int day;
		
		year = (b < 3000000) ? 1900:2000;
		year = year + a/10000;
		month = a/100-a/10000*100;
		day = a-a/100*100;
		System.out.println(year);	
		System.out.println(month);
		System.out.println(day);
			//***************************
			// ���ϸ�: BirthDate.java
			// �ۼ���: ������
			// �ۼ���: 9-30
			// ����: [hw5_1] �������
			//***************************
	}

}
