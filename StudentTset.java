package hw11_2;

public class StudentTset {

	public static void main(String[] args) {
		System.out.println("hw11_2: ������");
		Student s1 = new Student();
		ForeignStudent s2 = new ForeignStudent();
		VisitingStudent s3 = new VisitingStudent();
		s1.setName("Kim");
		s1.setCredit(20);
		s2.setName("Jobs");
		s2.setCredit(5);
		s2.setCountry("USA");
		s3.setName("Lee");
		s3.setCredit(8);
		s3.setSchoolName("������");
		s1.print();
		s2.print();
		s3.print();
		int sum = s1.price()+s2.price()+s3.price();
		System.out.println("��ϱ� �� = "+sum);

	}

}
//***************************
//���ϸ�:  Student.java
//�ۼ���: ������
//�ۼ���: 2021.11.11
//����: ��� �л� ��ϱ� ��� �� ���� ���
//***************************
