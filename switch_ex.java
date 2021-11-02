import java.util.Scanner;

public class switch_ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month =sc.nextInt();
		int days = 0;
		switch(month) {
		case 1: case 3:	case 5: case 7:
		case 8: case 10: case 12:
			days=31;
			break;
		case 4: case 6: case 9: case 11:
			days =30;
			break;
		case 2: 
			days=28;
		default:
			System.out.println("월이 잘못 입력되었습니다.");
			break;
		}
		System.out.println("월의 날짜수는 "+days);
	}

}
