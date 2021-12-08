package hw22_1;

import java.util.HashSet;

public class questionBank {
	public static void main(String args[]) {
		System.out.println("hw22_1: 서명진");
		String[] questionBank = new String[] {"파란색이 영어로 무엇인가?","빨간색이 영어로 무엇인가?","사과는 영어로 무엇인가?","한국의 수도는?","일본의 수도는?",
				"1+2는?","9-3은?","99-33은?","3*2는?","12/3은?"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i= 0;i<5; i++) {
			int index = (int)(Math.random()*10);
			
			if(set.contains(questionBank[index])) {				
				i--;
			}
			else {
				set.add(questionBank[index]);
				System.out.println("\n"+(i+1)+") "+questionBank[index]);
			}
		}
		
	}
}
//***************************

//파일명: questionBank.java

//작성자: 서명진

//작성일: 2021.12.08

//내용: 자바 컬렉션 라이브러리 사용 연습

//***************************