package Hw8_1;

public class CircleTest {
	public static void main(String[] args) {
		System.out.println("hw8_1: ������");
		
		//(1) �� ��ü�� �ΰ� ����(circle1, circle2��� �θ���)
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		
		//(2) circle1�� �������� 1.2, ��ǥ�� (3, 4)�� ����
		circle1.SetR(1.2);
		circle1.SetX(3);
		circle1.SetY(4);
		
		//(3) circle2�� �������� -1.2, ��ǥ�� (-3, -4)�� ����
		circle2.SetR(-1.2);
		circle2.SetX(-3);
		circle2.SetY(-4);
		
		//(4) circle1�� x������ 10, y������ 20��ŭ �̵�
		circle1.move(10,20);
		
		
		//(5) circle2�� x������ 10, y������ 20��ŭ �̵�
		circle2.move(10,20);
		
		
		//(6) circle1, circle2 ���� ������ ���� x, y��ǥ�� ������ ����� �˾Ƴ��� ���
		System.out.println("circle1�� ����: "+circle1.area(circle1.getR())+"\ncircle1�� x,y ��ǥ ("+circle1.getX()+","+circle1.getY()+")");
		System.out.println("circle2�� ����: "+circle2.area(circle2.getR())+"\ncircle2�� x,y ��ǥ ("+circle2.getX()+","+circle2.getY()+")");
		
		//***************************
		//���ϸ�: Circle.java
		//�ۼ���: ������
		//�ۼ���: 2021-10-18
		//����: ���� ���� �� ��ǥ�� �ҷ����� �޼ҵ� ���� �����غ��� ���: �� �������� move�޼ҵ尡 ��� �̵��� �����ϳ�, 
		//***************************
	}
	
}
