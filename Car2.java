package Hw7_1;

class Car2{
	String color; //����
	int speed;	//���� �ӵ�
	int gear;	//���� ���
	
	void print(){		//�������
		System.out.println("���� ������ ����");		//���� ���뿡�� ������ �������� ���� �־����ϴ�.
		System.out.println("("+color+", "+speed+", "+gear+")");			
	}
	void speedUp(int a) {		//�ӵ�����
		for (int i=0; i<a; i++) {		//a =�ݺ��� ��
			speed +=1;	
		}	
	}
	void speedDown(int a) {		//�ӵ�����
		for (int i=0; i<a; i++) {	//a =�ݺ��� ��
			speed -=1;	
			if(speed ==0) {
				
				return ;
			}
		}
		
	}
	void changeGear(int a) {	//����
		gear =a; // a=�ٲܱ��
	}
	
	//***************************
		// ���ϸ�: Car.java
		// �ۼ���: ������
		// �ۼ���: 2021-10-11
		// ����:car Ŭ����
		//***************************
}