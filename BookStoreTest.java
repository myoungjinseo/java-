package Hw10_1;

import java.util.Scanner;

public class BookStoreTest {

	public static void main(String[] args) {

		System.out.println("hw10_1: 서명진");

		// 서점 객체를 하나 생성하고 6권의 책을 등록

		BookStore store = new BookStore();

		store.register(new Book("C", 1999, 20000));

		store.register(new Book("C++", 2009, 23000));

		store.register(new Book("DB", 2012, 10000));

		store.register(new Book("Java", 2013, 15000));

		store.register(new Book("OS", 2014, 12000));

		store.register(new Book("Linux", 1998, 13000));

		store.printList();

		// 서점의 모든 도서를 10% 할인

		store.discount(0.1);

		store.printList();

		// 사용자가 원하는 제목의 도서를 검색

		Scanner scan = new Scanner(System.in);

		System.out.print("검색할 도서 제목 입력: ");

		String title = scan.nextLine();

		Book myBook = store.searchBook(title);

		if (myBook == null)

			System.out.println("제목이 " + title + "인 도서는 찾을 수 없습니다.");

		else

			System.out.println("찾았습니다. " + myBook);

	}
	/*
	* 파일명: BookStoreTest.java
	* 작성자: 서명진
	* 작성일: 2021.11.3
	* 내용: Book 클래스와 BookStore 클래스를 이용하여 서점에 도서를 등록하고 조회하는 프로그램
	*/

}