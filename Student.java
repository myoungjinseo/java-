package hw11_2;

public class Student {
	protected String name;	// �̸�
	protected int Credit ; 	// ��û������
	
	//�̸� getter/setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//��û������ getter/setter 
	public void setCredit(int Credit) {
		this.Credit = Credit;
	}
	
	public int getCredit() {
		return Credit;
	}
	
	//��ϱݰ�� - ��ϱ� �׼��� ����(��û�������� 6 �ʰ��̸� 300����, 6 �����̸� 1������ 20����)
	public int price() {
		int price;
		if(Credit>6) {
			price = 3000000;
		} else {
			price = Credit*200000;
		}
		return price;
	}
	
	//print() - ��� �Ӽ�(�̸�, ��û������)�� ���
	public void print() {
		System.out.println("�̸� : " +name +" ����: " + Credit);
				
	}
}
//***************************
//���ϸ�:  Student.java
//�ۼ���: ������
//�ۼ���: 2021.11.11
//����: �л� ��ϱ� ��� �� ���� ���
//***************************
