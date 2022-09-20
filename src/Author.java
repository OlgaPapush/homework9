import java.util.Objects;

public class Author {

    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;}

        public String getAuthorName () {return authorName;}

        public int hashCode () {
        return Objects.hash(authorName);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return " Наш автор здесь:" + this.authorName;
    }

}