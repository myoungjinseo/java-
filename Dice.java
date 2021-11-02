package Hw8_2;

public class Dice {
	int diceFace;
	
	//주사위를 굴리는 메소드
	public int roll() {
		diceFace = (int)(Math.random() * 6) + 1; // 1부터 6 사이의 난수
		return diceFace; 
	}
	
	//주사위 값을 받아오는 메소드
	public int getDice() {
		 return diceFace;
		 
	}
	
	
	//***************************
	// 파일명: Dice.java
	// 작성자: 서명진
	// 작성일: 2021-10-18
	// 내용: 주사위를 굴리는 메소드와 값을 받아오는 메소드를 생성
	//***************************
	
}
