


public class Book {
    private String title;
    private String author;

    public Book(String a, String b) {
        title = a;
        author = b;
    }
    public Book() {
        title = "Freakonomics";
        author ="StevenLevitt&StephenDubner";
    }
    public void settitle(String title){
        this.title = title;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String gettitle(String title){
        return title;
    }
    public String getauthor(String author) {
        return author;
    }
    public String toString(){
        return this.title+","+this.author;
    }
}
