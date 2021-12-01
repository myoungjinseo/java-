package hw21_1;


import java.util.InputMismatchException;
import java.util.Scanner;



public class FriendListTest {

           public static void main(String[] args) {

                     System.out.println("hw21_1: ������");

                     Scanner scan = new Scanner(System.in);
                     
 
                     FriendList friendList = new FriendList();
                     System.out.print("��ȣ �Է�: ");
                     
                     try {
                    	 int number = scan.nextInt();
                    	 String name = friendList.get(number);
                         System.out.println(number + "���� ��ϵ� ģ���� " + name);
                     }
                     //
                     catch(InputMismatchException e) {

                    	 System.out.println("��ȣ�� �������� �Է��ؾ� �մϴ�.");
                     }                    
                     catch(ArrayIndexOutOfBoundsException e){

                    	 System.out.println("�Է��� ��ȣ�� ������ ������ϴ�.");
                     }
                                         
                   //***************************

                  // ���ϸ�: FriendListTest.java

                  // �ۼ���: ������

                  // �ۼ���: 2021.12.01

                  // ����: try- catch�� �̿��� �������� ���� ó���� ����

                  //***************************

                                        
                     

           }

}