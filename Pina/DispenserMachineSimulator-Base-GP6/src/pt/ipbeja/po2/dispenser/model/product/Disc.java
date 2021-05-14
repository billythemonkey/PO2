package pt.ipbeja.po2.dispenser.model.product;

import java.util.List;
import java.util.Objects;

public class Disc extends ProductWithAuthor{

    private int duration;

    public Disc(String name, int price, List<Author> authors, int duration) {
        super(name, price, authors);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Disc disc = (Disc) o;
        return duration == disc.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public String toString() {
        return "Disc{" +
                "duration=" + duration +
                '}';
    }
}
