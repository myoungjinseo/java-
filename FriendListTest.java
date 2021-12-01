package hw21_1;


import java.util.InputMismatchException;
import java.util.Scanner;



public class FriendListTest {

           public static void main(String[] args) {

                     System.out.println("hw21_1: 서명진");

                     Scanner scan = new Scanner(System.in);
                     
 
                     FriendList friendList = new FriendList();
                     System.out.print("번호 입력: ");
                     
                     try {
                    	 int number = scan.nextInt();
                    	 String name = friendList.get(number);
                         System.out.println(number + "번에 등록된 친구는 " + name);
                     }
                     //
                     catch(InputMismatchException e) {

                    	 System.out.println("번호로 정수값을 입력해야 합니다.");
                     }                    
                     catch(ArrayIndexOutOfBoundsException e){

                    	 System.out.println("입력한 번호가 범위를 벗어났습니다.");
                     }
                                         
                   //***************************

                  // 파일명: FriendListTest.java

                  // 작성자: 서명진

                  // 작성일: 2021.12.01

                  // 내용: try- catch를 이용한 여러가지 예외 처리를 연습

                  //***************************

                                        
                     

           }

}