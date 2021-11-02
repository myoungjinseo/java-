import java.util.Scanner;

public class if_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month =sc.nextInt();
		int days = 0;
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days=31;
			System.out.println("월의 날짜수는 "+days);
		} else if(month ==4 || month ==6 || month ==9 || month ==11) {
			days=30;
			System.out.println("월의 날짜수는 "+days);
		} else if(month ==2) {
			days=28;
			System.out.println("월의 날짜수는 "+days);
					
		}else {
			System.out.println("월이 잘못 입력되었습니다.");
		}

	}

}
