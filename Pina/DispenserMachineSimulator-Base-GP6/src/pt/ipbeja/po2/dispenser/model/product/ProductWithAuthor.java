package pt.ipbeja.po2.dispenser.model.product;

import java.util.List;
import java.util.Objects;

public class ProductWithAuthor extends Product{

    private List<Author> authors;

    public ProductWithAuthor(String name, int price, List<Author> authors) {
        super(name, price);
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductWithAuthor that = (ProductWithAuthor) o;
        return authors.equals(that.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), authors);
    }

    @Override
    public String toString() {
        return "ProductWithAuthor{" +
                "authors=" + authors +
                '}';
    }
}
