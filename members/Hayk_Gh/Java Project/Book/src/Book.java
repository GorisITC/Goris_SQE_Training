public class Book {
    public static void main(String[] args) {
        BookTitle title = new BookTitle();
        title.setName("Martin Eden");
        System.out.printf("Today i have read one chapter from " + title.getName() + ".");

        System.out.printf("\n");

        PubYear year1 = new PubYear();
        year1.setYear(1997);
        System.out.printf("The book was published at " + year1.getYear() + ".");

        System.out.printf("\n");

        Author author1 = new Author();
        author1.setAuthorname("Jack London");
        System.out.printf("The author of the book is " + author1.getAuthorname() + ".");

        System.out.printf("\n");

        Count count1 = new Count();
        count1.setPagecount(550);
        System.out.printf("Count of the pages is " + count1.getPagecount() + ".");

        System.out.printf("\n");

        Part part = new Part();
        part.setPart1(2);
        System.out.printf("The book has " + part.getPart1() + " parts in general.");
    }
}
