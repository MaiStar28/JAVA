package cau2;

public class Book extends Document{
    private String numberOfPage;
    private String author;

    public String getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(String numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
