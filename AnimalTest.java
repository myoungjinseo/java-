package Hw12_1;

public class AnimalTest {
	private static Animal[] arrayOfAnimals;
	
	public static void main(String[] args) {

		System.out.println("hw12_1: ������");
		//(1) ũ�Ⱑ 4�� Animal �迭�� �����ϰ�, ������ ���� Dog ��ü 2��, Person ��ü 2���� �����Ͽ� �迭�� ����
	    //new Dog("������", 13.5) 
	    // new Dog("������", 12.5)
	    //new Person("ȫ�浿", 20)
	    //new Person("�ڱ浿", 25)
		arrayOfAnimals = new Animal[4];
		arrayOfAnimals[0]= new Dog("������",13.5);
		arrayOfAnimals[1] =new Dog("������",12.5);
		arrayOfAnimals[2] = new Person("ȫ�浿",20);
		arrayOfAnimals[3] = new Person("�ڱ浿",25);
		
		//(2) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� ������ ���
		for(int i =0; i<arrayOfAnimals.length; i++) {
			System.out.println(arrayOfAnimals[i].toString());
		}
		//(3) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� sound() �޼ҵ带 ȣ��
		for(int i =0; i<arrayOfAnimals.length; i++) {
			arrayOfAnimals[i].sound();
		}
		//(4) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� newYear() �޼ҵ带 ȣ��
		System.out.println("------------1�� ��-----------");
		for(int i =0; i<arrayOfAnimals.length; i++) {	
			arrayOfAnimals[i].newYear();
		}
		//(5) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� ������ ���
		for(int i =0; i<arrayOfAnimals.length; i++) {
			System.out.println(arrayOfAnimals[i].toString());
		}
		//(6) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� newYear() �޼ҵ带 ȣ��
		System.out.println("------------2�� ��-----------");
		for(int i =0; i<arrayOfAnimals.length; i++) {
			arrayOfAnimals[i].newYear();
		}
		//(7) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� ������ ���
		for(int i =0; i<arrayOfAnimals.length; i++) {
			System.out.println(arrayOfAnimals[i].toString());
		}
		
	}

}
//***************************
//���ϸ�: animalTest.java
//�ۼ���: ������
//�ۼ���: 2021.11.19
//����: sound, newYear �޼ҵ� ����
//***************************
