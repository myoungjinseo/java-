package Hw12_1;

class Dog extends Animal {
	protected double speed; 		//�ӵ�(�Ǽ���)
	//�̸�, �ӵ��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Dog(String name, double speed) {
		super(name);
		this.speed = speed;
	}
	// toString �������̵�
	@Override
	public String toString() {
		return super.toString() +"�ü�"+speed+"km";

	}

	//��Ÿ �ʿ��� �޼ҵ��
	public void sound() {
		System.out.println("�۸� " + name);
	}
	//��Ÿ �ʿ��� �޼ҵ��
	public void newYear() {
		this.speed += 5;
	}
}
//
//***************************
//���ϸ�: Dog.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: sound, newYear �޼ҵ� ����
//***************************

