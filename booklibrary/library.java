package booklibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class library {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<book> books = new ArrayList<>();

	public static void addBook() {
		System.out.println("Enter name for book:");
		String name = sc.nextLine();

		System.out.println("Enter name for Author:");
		String author = sc.nextLine();

		book book = new book(name, author);
		books.add(book);
		System.out.println("Book is created");
	}

	public static void showBookById() {
		System.out.println("Enter ID for Book:");
		int bookId = sc.nextInt();
		sc.nextLine();

		for (book book : books) {

			if (book.getId() == bookId) {
				System.out.println(book);
			}
		}

	}

	public static void removeBookByName() {

		System.out.println("Enter name for book");
		String name = sc.nextLine();

		for (int i = books.size() - 1; i >= 0; i--) {

			if (books.get(i).getName().equalsIgnoreCase(name)) {
				books.remove(books.get(i));

			}

		}
	}

	public static int numberOfBooks() {

		return books.size();

	}

	public static void removeBookById() {

		System.out.println("Enter Id for book");
		int id = sc.nextInt();
		sc.nextLine();

		for (int i = books.size() - 1; i >= 0; i--) {

			if (books.get(i).getId() == id) {
				books.remove(books.get(i));

			}

		}

	}

	public static void updateBookName() {

		System.out.println("Enter Id for book:");
		int id = sc.nextInt();
		sc.nextLine();
		for (book book : books) {

			if (book.getId() == id) {
				System.out.println("Enter name for book:");
				String name = sc.nextLine();
				book.setName(name);
				System.out.println("Book is updated");

			}

		}

	}

	public static void showAllBooks() {

		System.out.println(books);

	}

}
