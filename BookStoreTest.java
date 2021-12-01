package Hw10_1;

import java.util.Scanner;

public class BookStoreTest {

	public static void main(String[] args) {

		System.out.println("hw10_1: ������");

		// ���� ��ü�� �ϳ� �����ϰ� 6���� å�� ���

		BookStore store = new BookStore();

		store.register(new Book("C", 1999, 20000));

		store.register(new Book("C++", 2009, 23000));

		store.register(new Book("DB", 2012, 10000));

		store.register(new Book("Java", 2013, 15000));

		store.register(new Book("OS", 2014, 12000));

		store.register(new Book("Linux", 1998, 13000));

		store.printList();

		// ������ ��� ������ 10% ����

		store.discount(0.1);

		store.printList();

		// ����ڰ� ���ϴ� ������ ������ �˻�

		Scanner scan = new Scanner(System.in);

		System.out.print("�˻��� ���� ���� �Է�: ");

		String title = scan.nextLine();

		Book myBook = store.searchBook(title);

		if (myBook == null)

			System.out.println("������ " + title + "�� ������ ã�� �� �����ϴ�.");

		else

			System.out.println("ã�ҽ��ϴ�. " + myBook);

	}
	/*
	* ���ϸ�: BookStoreTest.java
	* �ۼ���: ������
	* �ۼ���: 2021.11.3
	* ����: Book Ŭ������ BookStore Ŭ������ �̿��Ͽ� ������ ������ ����ϰ� ��ȸ�ϴ� ���α׷�
	*/

}