package Hw12_3;

//Dog ��ü�� AlarmClock ��ü�� �ϳ����� �����ϰ� �̿��ϴ� ����̹� Ŭ����
public class Driver {
public static void main(String[] args) {
	System.out.println("hw12_3: ������");
	//// Speakable �������̽��� �����ϴ� ���� Ŭ����
	Speakable Dog = new Speakable() {
		public void speak() {
			   System.out.println("�۸�");
			}
   };
   //// Speakable �������̽��� �����ϴ� ���� Ŭ����
   Speakable AlarmClock = new Speakable() {
	   private int number = 5;
	   public void speak() {
	      for(int i=0; i<number; i++)
	         System.out.print("��");
	      System.out.println();
	      number = number + 3;
	   }
  };
   Dog.speak();
   AlarmClock.speak();
   AlarmClock.speak();
}
}

//***************************
//���ϸ�: Driver.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: ���� Ŭ���� ����
//***************************



