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

        public String toString () {
            return "Book{" +
                    "bookName='" + bookName+
                    "author='"+ authorName+
                    "yearOfRelease'" + YearOfRelease +
                    '}' ;
        }
    }











