package Hw11_1;

public class UsedCarTest {

	public static void main(String[] args) {
			
		System.out.println("hw11_1: ������");
		//(1) Car ��ü�� �����ϵ�, ����, ������ ���� "blue", 2000000�� �ʱ�ȭ �ϵ��� �����Ѵ�.
		Car car1 = new Car("blue",2000000);
		
		//(2) ���� �ڵ��� ��ü���� ����� ����, ������ �˾Ƴ��� ����Ѵ�.
		System.out.println("car1�� ���� : "+car1.getColor()+", ���� : "+car1.getPrice());
		
		//(3) UsedCar ��ü�� �����ϵ�, ����, ����, ���꿬���� ���� "red", 1000000, 2004�� �ʱ�ȭ �ϵ��� �����Ѵ�.
		UsedCar car2 = new UsedCar("red",1000000,2004);
		
		
		//(4) ���� �߰��� ��ü���� ����� ����, ����, ���꿬���� �˾Ƴ��� ����Ѵ�.
		System.out.println("car2�� ���� : "+ car2.getColor()+", ���� : "+car2.getPrice()+", ���꿬�� : "+car2.getYear());

	}

}

//***************************

//���ϸ�: UsedCarTest.java

//�ۼ���: ������

//�ۼ���: 2021-11-11

//����: Car ��ü ������ UsedCar ��ü ���� �� ���(Ȯ��)

//***************************
