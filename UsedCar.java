package Hw11_1;

//Car Ŭ������ ����ϵ�, ���꿬�� �Ӽ��� �߰��� ���Ѵ�.
class UsedCar extends Car{

	int year;		//���꿬��
	
	//���꿬���� ���� getter
	public int getYear() {

	      return year;

	   } 
	
	//����, ����, ���꿬���� �Ű������� �޾� �ʱ�ȭ �ϴ� ������
	public UsedCar(String color, int price, int year) {
		super(color,price);
		this.year = year;
	}
}
//***************************

//���ϸ�: UsedCar.java

//�ۼ���: ������

//�ۼ���: 2021-11-11

//����: UsedCar ������ �ۼ� �� Year�� ���� getter�����

//***************************