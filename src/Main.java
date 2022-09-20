public class Main {
    public static void main(String[] args) {


        // задание
        Book firstBook = new Book ("Garri Potter", AuthorName, 2000);
        Book secondBook = new Book ( " Pippi longscking", secondAuthorName, 1993);

        Author firstAuthor = new Author ( " Joanne Rowling" );
        Author secondAuthor = new Author ( " Astrid Lindgren" );

        System.out.println("Author" + firstAuthor.authorName() + "book" + firstBook.getBookName() + " " + firstBook.GetyearOfRelease() + " year");
        System.out.println("Author" + secondAuthor.authorName() + "book" + secondBook.getBookName() + " " + secondBook.GetyearOfRelease() + " year");

        System.out.println(firstBook);
        System.out.println(secondBook);
    }
}