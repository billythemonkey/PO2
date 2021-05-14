package pt.ipbeja.po2.dispenser.model.product;

import java.util.Objects;

public class Game extends Product{

    private String platform;

    public Game(String name, int price, String platform) {
        super(name, price);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Game game = (Game) o;
        return platform.equals(game.platform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), platform);
    }

    @Override
    public String toString() {
        return "Game{" +
                "platform='" + platform + '\'' +
                '}';
    }
}
