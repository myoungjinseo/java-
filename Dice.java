package Hw8_2;

public class Dice {
	int diceFace;
	
	//�ֻ����� ������ �޼ҵ�
	public int roll() {
		diceFace = (int)(Math.random() * 6) + 1; // 1���� 6 ������ ����
		return diceFace; 
	}
	
	//�ֻ��� ���� �޾ƿ��� �޼ҵ�
	public int getDice() {
		 return diceFace;
		 
	}
	
	
	//***************************
	// ���ϸ�: Dice.java
	// �ۼ���: ������
	// �ۼ���: 2021-10-18
	// ����: �ֻ����� ������ �޼ҵ�� ���� �޾ƿ��� �޼ҵ带 ����
	//***************************
	
}
