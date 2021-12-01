package Hw10_1;

public class BookStore {

	private Book[] list; // ���� ���

	private int numberOfBooks; // ��� ���� ��

	private final int MAX_NUMBER = 100; // �ִ� ���� ��

	public BookStore() {

		list = new Book[MAX_NUMBER]; // Book ��ü�� ������ �� �ִ� ����Ʈ�� ����� ��

		numberOfBooks = 0; // ���� Book ��ü�� �ϳ��� ����

	}

	// book�� ���� ����� �� ���� ����

	public void register(Book book) {

		if (numberOfBooks == MAX_NUMBER) {

			System.out.println("��� ����: ��� ������ ���� ���� �ʰ��߽��ϴ�.");

		}

		else {
				list[numberOfBooks] = book;		
				numberOfBooks += 1;
			
		}

	}

	// ���� ��� ��ü�� ���

	public void printList() {

		for (int i = 0; i <numberOfBooks; i++) {
			System.out.println(list[i]);
		}

	}

	// ��� ���� ���� ����

	public int getNumberOfBooks() {

		return numberOfBooks;

	}

	// ��� ������ discountRate ���� ��ŭ ���� ����

	public void discount(double discountRate) {
			for(int i = 0; i<numberOfBooks; i++) {
				int P = (int) (list[i].getPrice() * (1-discountRate));
				list[i].setPrice(P);
			}
	}

	// ������ title�� ������ ã�� Book ��ü�� �������� ����, ã�� ���ϸ� null�� ����

	public Book searchBook(String title) {

		for (int i = 0; i < numberOfBooks; i++) {
			if (title.equals(list[i].getTitle())) // ������ title�� �����̸�
				return list[i]; // Book ��ü�� �������� ����
		}
		// ã�� ���� ���
		return null;

	}
	/*

	* ���ϸ�: BookStore.java
	* �ۼ���: ������
	* �ۼ���: 2021.11.3
	* ����: Book �迭�� ������ �����ϰ� �����ϴ� ���� Ŭ����
	*/

}