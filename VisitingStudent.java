package hw11_2;

public class VisitingStudent extends Student{
	protected String schoolName;	//�Ҽ��б���
	
	//�Ҽ��б����� getter/setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getschoolName() {
		return schoolName;
	}
	
	// ��ϱݰ�� ������ - ��û���� 1������ 10����
	public int price() {
		 
		
		return Credit*100000;
	}
	
	//print() ������ - ��� �Ӽ�(�̸�, ��û������, �Ҽ��б���)�� ���
	public void print() {
		System.out.println("�̸� : " +name +" ����: " +Credit+ " �Ҽ��б� : "+schoolName);
					
	}
	
}

//***************************
//���ϸ�:  Student.java
//�ۼ���: ������
//�ۼ���: 2021.11.11
//����: ��ȯ�л� ��ϱ� ��� �� ���� ���
//***************************
