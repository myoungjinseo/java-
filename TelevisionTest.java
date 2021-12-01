package Hw9_1;

public class TelevisionTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: 서명진");
		//		텔레비젼 객체 tv1을 생성 - 생성자1 호출하도록
		Television tv1 = new Television ();
		System.out.println(tv1.toString());

		//		텔레비젼 객체 tv2를 생성 - 적당한 매개변수를 주어 생성자2 호출하도록
		Television tv2 = new Television ("TV24");
		System.out.println(tv2.toString());
		
		//		텔레비젼 객체 tv3을 생성 - 적당한 매개변수를 주어 생성자3 호출하도록
		Television tv3 = new Television ("TV32",340000);
		System.out.println(tv3.toString());
	}
	
	//***************************
		// 파일명: Television .java
		// 작성자: 서명진
		// 작성일: 2021-11-03
		// 내용: television의 가격 및 모델 입력 및 출력 생성자 구현 
		//***************************
}
