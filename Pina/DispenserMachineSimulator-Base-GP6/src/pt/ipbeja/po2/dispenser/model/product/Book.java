package pt.ipbeja.po2.dispenser.model.product;

import java.util.List;
import java.util.Objects;

public class Book extends ProductWithAuthor{

    private String publisher;

    public Book(String name, int price, List<Author> authors, String publisher) {
        super(name, price, authors);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return publisher.equals(book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publisher);
    }

    @Override
    public String toString() {
        return super.toString() + " Book{" +
                "publisher='" + publisher + '\'' +
                '}';
    }
}
