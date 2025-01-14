package dojo.supermarket.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class FakeCatalogTest {
    FakeCatalog catalog;
    Product toothbrush, apples;

    @BeforeEach
    void setupCatalog(){
        catalog = new FakeCatalog();
        toothbrush = new Product("toothbrush", ProductUnit.Each);
        apples = new Product("apples", ProductUnit.Kilo);
        catalog.addProduct(toothbrush, 0.99);
        catalog.addProduct(apples, 1.99);
    }

    @Test
    void testAddProduct() {
        assertEquals(2, catalog.products.size());
        assertEquals(2, catalog.prices.size());

        assertSame(catalog.products.get("toothbrush"), toothbrush);
        assertSame(catalog.products.get("apples"), apples);

        assertEquals(catalog.prices.get("toothbrush"), 0.99);
        assertEquals(catalog.prices.get("apples"), 1.99);
    }

    @Test
    void testGetUnitPrice(){
        assertEquals(0.99, catalog.getUnitPrice(toothbrush));
        assertEquals(1.99, catalog.getUnitPrice(apples));
    }
}
