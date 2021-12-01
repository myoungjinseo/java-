package hw20_2;

import java.util.Scanner;

public class PackagerTest {

	public static void main(String[] args) {
		System.out.println("hw20_2 서명진 \n");
		//반지름이 1.5인 원의 면적(파이값을 static 상수값 이용)
		System.out.println(Math.PI *Math.pow(1.5, 2));
		
		//3의 10승
		System.out.println(Math.pow(3, 10));
		
		//루트 8
		System.out.println(Math.sqrt(8));
		
		// 0.0 <= r < 1.0 범위의 랜덤넘버
		System.out.println(Math.random()+"\n");
		
		Scanner sc = new Scanner(System.in);
		
		//사용자로부터 주민등록번호(- 포함)를 한 줄의 문자열로 입력받음
		System.out.print("주민등록번호 입력(-포함) :");
		String a = sc.next();
		
		//주민등록번호 문자열로부터 앞부분 정수값으로 변환    
		String b = "";	
		for(int i=0; i<6;i++) {
			b += a.charAt(i);
		}
		int b1 = Integer.parseInt(b);
		System.out.println("앞자리 = "+b);
		
		//주민등록번호 문자열로부터 뒷부분 정수값으로 변환    
		String c = "";
		for(int i=7; i<14;i++) {
			c += a.charAt(i);
		}
		int c1 = Integer.parseInt(c);
		System.out.println("뒷자리 = "+c1);
		
		// 이 두 값을 더한 결과를 출력
		int sum = c1+b1;
		System.out.println("합 = "+sum);
	}

}

//***************************

//파일명: PackagerTest.java

//작성자: 서명진

//작성일: 2021.11.25

//내용: java.lang 패키지의 클래스들을 사용해봄.

//***************************
