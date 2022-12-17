package day25;

public class Library {

	public static void main(String[] args) {
		// 1.Create 2 objects from Book class with all
		// properties assigned (any value)

		// 2.Print both object details
		Book book1 = new Book();
		book1.title = "Java";
		book1.author = "Moe";
		book1.pages = 3230;

		System.out.println(book1.title);
		System.out.println(book1.author);
		System.out.println(book1.pages);

		System.out.println();

		Book bookTwo = new Book("JavaTwo", "Prim", 1039);
		System.out.println(bookTwo.title);
		System.out.println(bookTwo.author);
		System.out.println(bookTwo.pages);

		System.out.println("--");

		book1.DisplayBook();
		System.out.println("--");
		bookTwo.DisplayBook();

	}
}
