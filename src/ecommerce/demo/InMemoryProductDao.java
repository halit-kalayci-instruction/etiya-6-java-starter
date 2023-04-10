package ecommerce.demo;

import java.util.ArrayList;
import java.util.List;

//InMemory Db
// VERİYE ERİŞMEK
// Çıplak class kalmasın!
public class InMemoryProductDao implements ProductDao {
    List<Product> products = new ArrayList<>();

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
