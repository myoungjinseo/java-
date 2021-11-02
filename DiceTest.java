package Hw8_2;

public class DiceTest {

	public static void main(String[] args) {
		System.out.println("hw8_2: 서명진");
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int sum;
		//(1) 주사위 객체를 두개 생성
		dice1.roll();
		dice2.roll();
		
		//(2) 두 주사위의 현재 면과 두 면의 합을 출력
		sum= dice1.getDice()+dice2.getDice();
		System.out.println("주사위A = "+dice1.getDice()+" 주사위B = "+dice2.getDice()+" 합 = "+sum);
		System.out.println("주사위 두개를 던집니다.");
		
		//(3) 두 주사위를 굴려서 각각 몇 면이 나왔는지와 두 면의 합을 출력
		do{
			dice1.roll();
			dice2.roll();
			sum= dice1.getDice()+dice2.getDice();
			System.out.println("주사위A = "+dice1.getDice()+" 주사위B = "+dice2.getDice()+" 합 = "+sum);
		}while(dice1.getDice()+dice2.getDice()!=7); //(4) 두 주사위 면의 합이 7이 나올 때까지 단계(3)을 반복
	}
		
	
	}
	//***************************
	//파일명: DiceTest .java
	//작성자: 서명진
	//작성일: 2021-10-18
	//내용: 두 주사위가 7이 나올때까지 주사위를 굴리는 프로그램 작성
	//***************************


