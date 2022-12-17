package day25;

public class Book {
	public String title;
	public String author;
	public int pages;

	public Book() {
		System.out.println("inside empty constructor");
	}

	public Book(String title, String author, int pages) {
		System.out.println("inside constructor with 3 args");
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public void DisplayBook() {
		System.out.println(this.title);
		System.out.println(this.author);
		System.out.println(this.pages);
	}
}