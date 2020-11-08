package booklibrary;

public class bookarraylist {

	static boolean loop = true;

	public static void main(String[] args) {

     switchCase(menu() );
	}

	public static void switchCase(int val) {

		switch (val) {
		case 1:
			library.addBook();
			break;
		case 2:
			library.removeBookById();
			break;
		case 3:
			library.removeBookByName();
			break;
		case 4:
			library.showBookById();
			break;
		case 5:
			library.showAllBooks();
			break;
		case 6:
			library.updateBookName();
			break;
		case 7:
			library.numberOfBooks();
			break;
		case 0:
			loop = false;
			library.sc.close();
			break;
		default:
			System.out.println("Wrong Choice!");
		}

	}

	public static int menu() {
		System.out.println("\n\n1. Add book");
		System.out.println("2. Remove book by id");
		System.out.println("3. Remove book by name");
		System.out.println("4. Show book by id");
		System.out.println("5. Show all books");
		System.out.println("6. Update book name");
		System.out.println("7. Number of books in library");
		System.out.println("0. Exit");

		System.out.println("\nMake a choice");
		int choice = library.sc.nextInt();
		library.sc.nextLine();
		return choice;
	}

}
