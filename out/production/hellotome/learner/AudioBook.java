package learner;

public class AudioBook extends Book{
    private int runtime;

    AudioBook(){
        super();
    }
    AudioBook(String title, String author,int runtime){
        super(title,author);
        this.runtime = runtime;
    }
}
