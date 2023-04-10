package ecommerce.demo.dataAccess.abstracts;

import ecommerce.demo.entities.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    List<Product> getAll();
    Product getById(int id);
}
