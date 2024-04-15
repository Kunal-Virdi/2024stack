package learner;

public class Book {
    private String title;
    private String author;
    private int pageCount;

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    Book(){}
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    Book(String title, String author,int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    public String toString() {
        return String.format(this.title + " by " + this.author);
    }
}
