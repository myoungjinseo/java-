package Hw9_1;

public class Television {
	public String model;
	public int price;
	
	//모델명의 getter와 setter
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	//가격의 getter와 setter
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 생성자1 - 매개변수가 없는 디폴트 생성자. 모델명은 "MyTV", 가격은 0으로 초기화 *****
	public Television() {
		this("MyTV",0);
	}
	
	////생성자2 - 모델명을 매개변수로 받아 초기화, 가격 0으로 초기화하되, 직접 필드값을 지정하지 말고 생성자3을 호출하여 초기화 *****
	public Television(String M) {
		this(M,0);
	}
	
	//생성자3 - 모델명과 가격을 매개변수로 받아 초기화 *****		setter를 넣을 공간이 없고 강의자료9장 9쪽과 비슷한 방식으로 구현
	public Television(String M ,int P) {
		setModel(M);
		setPrice(P);
	}
	
	public String toString() {
        return "모델명:" + model + " 가격:" + price;
    } 
	//***************************
	// 파일명: Television .java
	// 작성자: 서명진
	// 작성일: 2021-11-03
	// 내용: television의 가격 및 모델 입력 및 출력 생성자 
	//***************************
}
