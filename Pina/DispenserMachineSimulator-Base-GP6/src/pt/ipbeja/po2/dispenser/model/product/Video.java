package pt.ipbeja.po2.dispenser.model.product;

import java.util.List;
import java.util.Objects;

public class Video extends Disc{

    private String director;

    public Video(String name, int price, List<Author> authors, int duration, String director) {
        super(name, price, authors, duration);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Video video = (Video) o;
        return director.equals(video.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), director);
    }

    @Override
    public String toString() {
        return super.toString() + " Video{" +
                "director='" + director + '\'' +
                '}';
    }
}
