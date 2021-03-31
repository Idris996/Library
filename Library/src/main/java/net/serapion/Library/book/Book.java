package net.serapion.Library.book;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private Integer availableCopies;



    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date dateReserved = new Date();

    public Book() {
    }

    public Book(Long id, String title, String author, Integer availableCopies, @NotNull Date dateReserved) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
        this.dateReserved = dateReserved;
    }

    public Book(String title, String author, Integer availableCopies, @NotNull Date dateReserved) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
        this.dateReserved = dateReserved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }

    public Date getDateReserved() {
        return dateReserved;
    }

    public void setDateReserved(Date dateReserved) {
        this.dateReserved = dateReserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                availableCopies.equals(book.availableCopies) &&
                dateReserved.equals(book.dateReserved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, availableCopies, dateReserved);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", availableCopies=" + availableCopies +
                ", dateReserved=" + dateReserved +
                '}';
    }
}
