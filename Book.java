package Hw10_1;

public class Book {

	private String title; // 제목

	private int year; // 발행연도

	private int price; // 가격

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

		return title + " / " + year + "년 / " + price + "원";

	}
	/*
	* 파일명: Book.java
	* 작성자: 서명진
	* 작성일: 2021.11.3
	* 내용: 제목, 발생연도, 가격 정보를 갖는 도서 클래스
	*/

	        

}