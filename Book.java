package Hw10_1;

public class Book {

	private String title; // ����

	private int year; // ���࿬��

	private int price; // ����

	public Book(String title, int year, int price) {

		this.title = title;

		this.year = year;

		this.price = price;

	}

	public String getTitle() {

		return title;

	}

	public int getYear() {

		return year;

	}

	public void setPrice(int price) {

		this.price = price;

	}

	public int getPrice() {

		return price;

	}

	public String toString() {

		return title + " / " + year + "�� / " + price + "��";

	}
	/*
	* ���ϸ�: Book.java
	* �ۼ���: ������
	* �ۼ���: 2021.11.3
	* ����: ����, �߻�����, ���� ������ ���� ���� Ŭ����
	*/

	        

}