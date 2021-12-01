package hw11_2;

public class VisitingStudent extends Student{
	protected String schoolName;	//소속학교명
	
	//소속학교명의 getter/setter
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getschoolName() {
		return schoolName;
	}
	
	// 등록금계산 재정의 - 신청학점 1학점당 10만원
	public int price() {
		 
		
		return Credit*100000;
	}
	
	//print() 재정의 - 모든 속성(이름, 신청학점수, 소속학교명)을 출력
	public void print() {
		System.out.println("이름 : " +name +" 학점: " +Credit+ " 소속학교 : "+schoolName);
					
	}
	
}

//***************************
//파일명:  Student.java
//작성자: 서명진
//작성일: 2021.11.11
//내용: 교환학생 등록금 계산 및 정보 출력
//***************************
