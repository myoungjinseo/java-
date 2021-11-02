import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		System.out.println("hw5_1:서명진");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("주민등록번호 앞자리 입력: ");
		int a = scan.nextInt(); // 주민등록번호 앞자리
		System.out.println("주민등록번호 뒷자리 입력: ");
		int b =	scan.nextInt(); 	//주민등록번호 뒷자리
	
		int year;
		int month;
		int day;
		
		year = (b < 3000000) ? 1900:2000;
		year = year + a/10000;
		month = a/100-a/10000*100;
		day = a-a/100*100;
		System.out.println(year);	
		System.out.println(month);
		System.out.println(day);
			//***************************
			// 파일명: BirthDate.java
			// 작성자: 서명진
			// 작성일: 9-30
			// 내용: [hw5_1] 생년월일
			//***************************
	}

}
