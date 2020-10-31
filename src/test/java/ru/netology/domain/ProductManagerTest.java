package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductManager manager = new ProductManager();
    private Product first = new Book(1,"книга1",300, "Пушкин");
    private Product second = new Book(2,"книга2",400, "Бунин");
    private Product third = new Smartphone(3,"смартфон1",5000, "Nokia");
    private Product fourth = new Smartphone(4,"смартфон2",10000, "Apple");

    @Test
    void shouldFindExistBook() {
    manager.add(first);
    Product[] actual = manager.searchBy("книга1");
    Product[] expected = new Product[] {first};
    assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindNotExistBook() {
    }
    @Test
    void shouldFindExistSmartphone() {
    }
    @Test
    void shouldFindNotExistSmartphone() {
    }
}