package Hw8_2;

public class DiceTest {

	public static void main(String[] args) {
		System.out.println("hw8_2: ������");
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int sum;
		//(1) �ֻ��� ��ü�� �ΰ� ����
		dice1.roll();
		dice2.roll();
		
		//(2) �� �ֻ����� ���� ��� �� ���� ���� ���
		sum= dice1.getDice()+dice2.getDice();
		System.out.println("�ֻ���A = "+dice1.getDice()+" �ֻ���B = "+dice2.getDice()+" �� = "+sum);
		System.out.println("�ֻ��� �ΰ��� �����ϴ�.");
		
		//(3) �� �ֻ����� ������ ���� �� ���� ���Դ����� �� ���� ���� ���
		do{
			dice1.roll();
			dice2.roll();
			sum= dice1.getDice()+dice2.getDice();
			System.out.println("�ֻ���A = "+dice1.getDice()+" �ֻ���B = "+dice2.getDice()+" �� = "+sum);
		}while(dice1.getDice()+dice2.getDice()!=7); //(4) �� �ֻ��� ���� ���� 7�� ���� ������ �ܰ�(3)�� �ݺ�
	}
		
	
	}
	//***************************
	//���ϸ�: DiceTest .java
	//�ۼ���: ������
	//�ۼ���: 2021-10-18
	//����: �� �ֻ����� 7�� ���ö����� �ֻ����� ������ ���α׷� �ۼ�
	//***************************


