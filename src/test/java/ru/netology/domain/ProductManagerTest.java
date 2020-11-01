package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);
    private Product first = new Book(1,"книга1",300, "Пушкин");
    private Product second = new Smartphone(2,"смартфон1",5000, "Nokia");


    @Test
    void shouldFindNameExistBook() {
        manager.add(first);
        Product[] actual = manager.searchBy("книга1");
        Product[] expected = new Product[] {first};
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindAuthorExistBook() {
        manager.add(first);
        Product[] actual = manager.searchBy("Пушкин");
        Product[] expected = new Product[] {first};
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindNameNotExistBook() {
        manager.add(first);
        Product[] actual = manager.searchBy("книга2");
        Product[] expected = new Product[] {};
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldFindAuthorNotExistBook() {
        manager.add(first);
        Product[] actual = manager.searchBy("Бунин");
        Product[] expected = new Product[] {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindNameExistSmartphone() {
        manager.add(second);
        Product[] actual = manager.searchBy("смартфон1");
        Product[] expected = new Product[] {second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindMakerExistSmartphone() {
        manager.add(second);
        Product[] actual = manager.searchBy("Nokia");
        Product[] expected = new Product[] {second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindNameNotExistSmartphone() {
        manager.add(second);
        Product[] actual = manager.searchBy("смартфон2");
        Product[] expected = new Product[] {};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindMakerNotExistSmartphone() {
        manager.add(second);
        Product[] actual = manager.searchBy("Apple");
        Product[] expected = new Product[] {};
        assertArrayEquals(expected, actual);
    }
}