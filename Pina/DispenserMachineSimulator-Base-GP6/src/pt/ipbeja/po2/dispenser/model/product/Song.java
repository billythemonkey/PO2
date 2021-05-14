package pt.ipbeja.po2.dispenser.model.product;

import java.util.Objects;

public class Song {

    private String title;
    private int time;

    public Song(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return time == song.time && title.equals(song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, time);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", time=" + time +
                '}';
    }
}
