package pojo;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookname;
    private String author;
    private Double price;

    public Book() {
    }

    public Book(String bookname, String author, Double price) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
