package hw11_2;

public class StudentTset {

	public static void main(String[] args) {
		System.out.println("hw11_2: 서명진");
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
		s3.setSchoolName("강원대");
		s1.print();
		s2.print();
		s3.print();
		int sum = s1.price()+s2.price()+s3.price();
		System.out.println("등록금 합 = "+sum);

	}

}
//***************************
//파일명:  Student.java
//작성자: 서명진
//작성일: 2021.11.11
//내용: 모든 학생 등록금 계산 및 정보 출력
//***************************
