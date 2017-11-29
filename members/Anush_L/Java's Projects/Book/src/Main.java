
public class Main {
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Java 8: The Complete Reference Ninth Edition");
		book.setAuthor("Shildt G.");
		book.setGenre("Education");
		book.setPubYear(2015);
		book.setPages(965);
		book.setPrice(55);
		book.setCount(10);
		System.out.println("Title _ " + book.getTitle());
		System.out.println("Author _ " + book.getAuthor());
		System.out.println("Genre _ " + book.getGenre());
		System.out.println("PubYear _ " + book.getPubYear());
		System.out.println("Pages _ " + book.getPages());
		System.out.println("Price in $ _ " + book.getPrice());
		System.out.println("Count _ " + book.getCount());
	}
}
