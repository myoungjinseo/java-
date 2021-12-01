package Hw10_1;

public class BookStore {

	private Book[] list; // 도서 목록

	private int numberOfBooks; // 등록 도서 수

	private final int MAX_NUMBER = 100; // 최대 도서 수

	public BookStore() {

		list = new Book[MAX_NUMBER]; // Book 객체를 저장할 수 있는 리스트를 만들어 둠

		numberOfBooks = 0; // 아직 Book 객체는 하나도 없음

	}

	// book을 도서 목록의 맨 끝에 저장

	public void register(Book book) {

		if (numberOfBooks == MAX_NUMBER) {

			System.out.println("등록 실패: 등록 가능한 도서 수를 초과했습니다.");

		}

		else {
				list[numberOfBooks] = book;		
				numberOfBooks += 1;
			
		}

	}

	// 도서 목록 전체를 출력

	public void printList() {

		for (int i = 0; i <numberOfBooks; i++) {
			System.out.println(list[i]);
		}

	}

	// 등록 도서 수를 리턴

	public int getNumberOfBooks() {

		return numberOfBooks;

	}

	// 모든 도서를 discountRate 비율 만큼 가격 인하

	public void discount(double discountRate) {
			for(int i = 0; i<numberOfBooks; i++) {
				int P = (int) (list[i].getPrice() * (1-discountRate));
				list[i].setPrice(P);
			}
	}

	// 제목이 title인 도서를 찾아 Book 객체의 참조값을 리턴, 찾지 못하면 null을 리턴

	public Book searchBook(String title) {

		for (int i = 0; i < numberOfBooks; i++) {
			if (title.equals(list[i].getTitle())) // 제목이 title인 도서이면
				return list[i]; // Book 객체의 참조값을 리턴
		}
		// 찾지 못한 경우
		return null;

	}
	/*

	* 파일명: BookStore.java
	* 작성자: 서명진
	* 작성일: 2021.11.3
	* 내용: Book 배열에 도서를 저장하고 관리하는 서점 클래스
	*/

}