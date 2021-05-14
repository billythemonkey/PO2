package pt.ipbeja.po2.dispenser.model.product;

import java.util.List;
import java.util.Objects;

public class CD extends Disc{

    List<Song> songs;

    public CD(String name, int price, List<Author> authors, int duration, List<Song> songs) {
        super(name, price, authors, duration);
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return songs.equals(cd.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), songs);
    }

    @Override
    public String toString() {
        return super.toString() +  " CD{" +
                "songs=" + songs +
                '}';
    }
}
