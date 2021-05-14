package pt.ipbeja.po2.dispenser.model.product;

import java.util.Objects;

public class Camera extends Product{

    private String brand;

    public Camera(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camera camera = (Camera) o;
        return brand.equals(camera.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand);
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
