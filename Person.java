package Hw12_1;

class Person extends Animal{
	protected int age;		//����
	//�̸�, ���̸� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Person(String name, int age) {
		super(name);
		this.age = age;
	}
	
	//��Ÿ �ʿ��� �޼ҵ��
	public void sound() {
	
		System.out.println("�ȳ� " + name);
	}
	//��Ÿ �ʿ��� �޼ҵ��
	public void newYear() {
		this.age +=1;
	}
	
	//   toString �������̵�
	@Override
	public String toString() {
		return super.toString() + age+"��";

	}
	
	
}

//***************************
//���ϸ�: Person.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: sound, newYear �޼ҵ� ����
//***************************

