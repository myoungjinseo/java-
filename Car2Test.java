package Hw7_1;

public class Car2Test {
	public static void main(String[] args) {
		Car2 mycar = new Car2();
		//myCar�� ������ red, �ӵ��� 0, �� 1�� ����
		mycar.color="red";
		mycar.speed = 0;
		mycar.gear=1;
		mycar.print();
		mycar.speedUp(20);		//myCar�� �ӵ����� �޼ҵ带 20�� ȣ��
		mycar.print();
		mycar.changeGear(2);	//myCar�� ���� �޼ҵ带 ȣ���Ͽ� �� 2�� ����	
		mycar.print();
		mycar.speedUp(20);		//myCar�� �ӵ����� �޼ҵ带 20�� ȣ��
		mycar.print();
		mycar.speedDown(50);	//myCar�� �ӵ����� �޼ҵ带 50�� ȣ��	
		mycar.print();
	}
	
	
	//***************************
	// ���ϸ�: Car2.java
	// �ۼ���: ������
	// �ۼ���: 2021-10-11  => 10-12 ����
	// ����: mycar ��ü ���� �� �������
	//***************************
	
	

}