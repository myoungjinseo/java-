package hw22_1;

import java.util.HashSet;

public class questionBank {
	public static void main(String args[]) {
		System.out.println("hw22_1: ������");
		String[] questionBank = new String[] {"�Ķ����� ����� �����ΰ�?","�������� ����� �����ΰ�?","����� ����� �����ΰ�?","�ѱ��� ������?","�Ϻ��� ������?",
				"1+2��?","9-3��?","99-33��?","3*2��?","12/3��?"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i= 0;i<5; i++) {
			int index = (int)(Math.random()*10);
			
			if(set.contains(questionBank[index])) {				
				i--;
			}
			else {
				set.add(questionBank[index]);
				System.out.println("\n"+(i+1)+") "+questionBank[index]);
			}
		}
		
	}
}
//***************************

//���ϸ�: questionBank.java

//�ۼ���: ������

//�ۼ���: 2021.12.08

//����: �ڹ� �÷��� ���̺귯�� ��� ����

//***************************