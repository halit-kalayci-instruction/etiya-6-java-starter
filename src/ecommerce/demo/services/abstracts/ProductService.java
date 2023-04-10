package ecommerce.demo.services.abstracts;

import ecommerce.demo.entities.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
    Product getById(int id);
}
