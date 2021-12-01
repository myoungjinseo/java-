package Hw12_2;

public class Point implements Resettable{
	protected double x;		//x��ǥ
	protected double y;		//y��ǥ
	protected double X;		// x �� �̵� �Ÿ�
	protected double Y;		// y �� �̵� �Ÿ�

	//  x, y ��ǥ�� �Ű������� �Ͽ� �ʱ�ȭ �ϴ� ������
	public Point(double x, double y) {
		this.x =x;
		this.y =y;
	}
	// �̵� - x���̵���, y���̵����� �Ű������� �޾� ��ǥ �̵�
	public void move(double a,double b) {
		this.x +=a;
		this.y +=b;
		this.X +=a;
		this.Y +=b; 
	}
	// toString �������̵�
	@Override
	public String toString() {
		return "x�� ��ǥ: "+x + " y�� ��ǥ: "+y;
	}
	//��Ÿ �ʿ��� �޼ҵ�
	public void reset() {
		x -= X;
		y -= Y;
	}
	
}
//***************************
//���ϸ�: BankTest.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: move �޼ҵ� ����
//***************************
