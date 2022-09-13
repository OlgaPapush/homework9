import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName;
    private  int YearOfRelease;

    public Book (String bookName, Author authorName, int yearOfRelease) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.YearOfRelease = yearOfRelease;
    }

     public String getBookName () { return bookName; }
    public Author getAuthorName () {return authorName; }
    public int getYearOfRelease () {return YearOfRelease; }

    public void setYearOfRelease (int yearOfRelease) { this.YearOfRelease = yearOfRelease;}

    @Override
    public int hashCode() {
        return Objects.hash (bookName,authorName,YearOfRelease);}

    @Override
    public boolean equals(Object o) {
        if (this == 0) return true;
        if (0 == null || getClass() != o.getClass()) return false;
        Book book - (bookName) o :
        return YearOfRelease == book.YearOfRelease && Objects.equals(bookName, book.bookName) && Objects.equals( authorName, book.authorName);
        public String toString () {
            return "Book{" +
                    "bookName='" + bookName+
                    "author='"+ authorName+
                    "yearOfRelease'" + YearOfRelease +
                    '}' ;
        }
    }
}










