package Hw8_1;

public class Circle {
	//������, x��ǥ, y��ǥ(�� �� ��� �Ǽ�)
	double r;
	double x;
	double y;
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	public double getR() {
		return r;
	}
	
	public void SetX(double X){
		x  =X;
	}
	
	public void SetY(double Y){
		y  =Y;
	}
	
	public void SetR(double R){
		if(R <0) {
			r  =1.0;
		} else {
			r = R ;
		}	
	}
	
	//������ ����Ͽ� ����(���̰��� 3.14�� �� ��). 
	public double area(double R) {
		return  R * R * 3.14;
	}
	
	// a =x�� �̵��Ÿ�   b= y�� �̵��Ÿ�  �Դϴ�.
	// return ���� getX , getY �� �־����ϴ�.
	public void move(double a ,double b) {
		x += a;
		y += b;
		
		
	}
	
	
	
	//***************************
		//���ϸ�: Circle.java
		//�ۼ���: ������
		//�ۼ���: 2021-10-18
		//����: getter�� setter�� �̿��� �޼ҵ� ����
		//***************************
}
