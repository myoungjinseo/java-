package hw20_2;

import java.util.Scanner;

public class PackagerTest {

	public static void main(String[] args) {
		System.out.println("hw20_2 ������ \n");
		//�������� 1.5�� ���� ����(���̰��� static ����� �̿�)
		System.out.println(Math.PI *Math.pow(1.5, 2));
		
		//3�� 10��
		System.out.println(Math.pow(3, 10));
		
		//��Ʈ 8
		System.out.println(Math.sqrt(8));
		
		// 0.0 <= r < 1.0 ������ �����ѹ�
		System.out.println(Math.random()+"\n");
		
		Scanner sc = new Scanner(System.in);
		
		//����ڷκ��� �ֹε�Ϲ�ȣ(- ����)�� �� ���� ���ڿ��� �Է¹���
		System.out.print("�ֹε�Ϲ�ȣ �Է�(-����) :");
		String a = sc.next();
		
		//�ֹε�Ϲ�ȣ ���ڿ��κ��� �պκ� ���������� ��ȯ    
		String b = "";	
		for(int i=0; i<6;i++) {
			b += a.charAt(i);
		}
		int b1 = Integer.parseInt(b);
		System.out.println("���ڸ� = "+b);
		
		//�ֹε�Ϲ�ȣ ���ڿ��κ��� �޺κ� ���������� ��ȯ    
		String c = "";
		for(int i=7; i<14;i++) {
			c += a.charAt(i);
		}
		int c1 = Integer.parseInt(c);
		System.out.println("���ڸ� = "+c1);
		
		// �� �� ���� ���� ����� ���
		int sum = c1+b1;
		System.out.println("�� = "+sum);
	}

}

//***************************

//���ϸ�: PackagerTest.java

//�ۼ���: ������

//�ۼ���: 2021.11.25

//����: java.lang ��Ű���� Ŭ�������� ����غ�.

//***************************
