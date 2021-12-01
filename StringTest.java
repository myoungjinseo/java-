package hw20_1;

public class StringTest {

	public static void main(java.lang.String[] args) {
		 System.out.println("hw20_1 서명진");
		 char[] arr = new char[26];
	        String s1 = new String();		
	        StringBuffer sb1 = new StringBuffer();
	        
	        //(1) 위의 작업에서 문자열을 저장하기 위해 String를 이용하고, 반복문 수행에 걸린 시간을 잰  후 출력
	        long t1 = System.nanoTime();		//t1 = String 시작 시간
	        for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=0; j<i+1; j++) {
	            // ASCII Code를 char로 형변환하여 배열에 담기
	            arr[i] = (char)(97+i);
	            s1 += arr[i];
	            }
	        }
	        long t2 = System.nanoTime();	////t2 = String 끝난 시간
	        long time = t2 -t1;	//time = String 총시간
	        System.out.println("nanoTime 기준 String의 총 시간: "+time);
	        System.out.println(s1);
	        
	        //위의 작업에서 문자열을 저장하기 위해 StringBuffer를 이용하고, 반복문 수행에 걸린 시간을 잰 후 출력
	        long t3 = System.nanoTime();		////t3 = StringBuffer 시작 시간
	        for(int i=0;i<arr.length;i++)
	        {
	        	for(int j=0; j<i+1; j++) {
	            // ASCII Code를 char로 형변환하여 배열에 담기
	            arr[i] = (char)(97+i);
	            
	            sb1.append(arr[i]);
	            }
	            
	        }
	        long t4 = System.nanoTime();		//t4 = StringBuffer 끝난 시간
	        long time2 = t4 -t3;				//time2 = StringBuffer 총 시간
	        System.out.println("nanoTime 기준 StringBuffer의 총 시간: "+time2);
	        System.out.println(sb1);
	}

}


//***************************

//파일명: StringTest.java

//작성자: 서명진

//작성일: 2021.11.25

//내용: java.lang 패키지의 StringBuffer, System 클래스를 익힌다.

//***************************

