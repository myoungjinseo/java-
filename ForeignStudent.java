package hw11_2;

class ForeignStudent extends Student{
	protected String country;		//국적
	
	//국적의 getter/setter 
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	//print() 재정의 - 모든 속성(이름, 신청학점수, 국적)을 출력
	public void print() {

		System.out.println("이름 : " +name +" 학점: " +Credit+ " 국적 : "+country);			
	}
	
}


//***************************
//파일명:  Student.java
//작성자: 서명진
//작성일: 2021.11.11
//내용: 외국인학생 등록금 계산 및 정보 출력
//***************************