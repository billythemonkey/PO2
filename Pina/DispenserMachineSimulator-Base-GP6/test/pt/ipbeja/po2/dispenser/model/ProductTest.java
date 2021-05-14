package pt.ipbeja.po2.dispenser.model;

import org.junit.jupiter.api.Test;
import pt.ipbeja.po2.dispenser.model.product.Product;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author DiogoPM
 * @version 02/05/2019
 */

class ProductTest {

    @Test
    void productListTest() {

        List<Product> productList = new ArrayList<>();
        Product p = new Product("Bolachas", 50);
        productList.add(p);

        Product savedProduct = productList.get(0);
        assertEquals("Bolachas", savedProduct.getName());
        assertEquals(50, savedProduct.getPrice());
        assertEquals(p, savedProduct);

        Product copy = new Product("Bolachas", 50);
        assertEquals(p, copy);
        assertTrue(productList.contains(copy));

    }

}