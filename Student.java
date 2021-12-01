package hw11_2;

public class Student {
	protected String name;	// 이름
	protected int Credit ; 	// 신청학점수
	
	//이름 getter/setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//신청학점수 getter/setter 
	public void setCredit(int Credit) {
		this.Credit = Credit;
	}
	
	public int getCredit() {
		return Credit;
	}
	
	//등록금계산 - 등록금 액수를 리턴(신청학점수가 6 초과이면 300만원, 6 이하이면 1학점당 20만원)
	public int price() {
		int price;
		if(Credit>6) {
			price = 3000000;
		} else {
			price = Credit*200000;
		}
		return price;
	}
	
	//print() - 모든 속성(이름, 신청학점수)을 출력
	public void print() {
		System.out.println("이름 : " +name +" 학점: " + Credit);
				
	}
}
//***************************
//파일명:  Student.java
//작성자: 서명진
//작성일: 2021.11.11
//내용: 학생 등록금 계산 및 정보 출력
//***************************
