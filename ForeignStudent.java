package hw11_2;

class ForeignStudent extends Student{
	protected String country;		//����
	
	//������ getter/setter 
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	//print() ������ - ��� �Ӽ�(�̸�, ��û������, ����)�� ���
	public void print() {

		System.out.println("�̸� : " +name +" ����: " +Credit+ " ���� : "+country);			
	}
	
}


//***************************
//���ϸ�:  Student.java
//�ۼ���: ������
//�ۼ���: 2021.11.11
//����: �ܱ����л� ��ϱ� ��� �� ���� ���
//***************************