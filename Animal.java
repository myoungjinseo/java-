package Hw12_1;

abstract class Animal {
	protected String name;		//�̸�
	
	// �̸��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Animal(String name){
		this.name = name;
	}
	//  �̸��� ���� getter
	public String getName() {
		return name;
	}
	//sound - � �Ҹ��� �������� ����ϴ� �޼ҵ�μ�, �߻�޼ҵ�
	public abstract void sound();
	// newYear - �� �ذ� ���� �� �ؾ��� ���� ������ �޼ҵ�μ�, �߻�޼ҵ�
	public abstract void newYear();
	// toString �������̵�
	@Override
	public String toString() {
		return name+" ";

	}
}

//***************************
//���ϸ�: animal.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: sound, newYear �޼ҵ� �ۼ�
//***************************

