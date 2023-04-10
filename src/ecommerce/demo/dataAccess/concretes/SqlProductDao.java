package ecommerce.demo.dataAccess.concretes;

import ecommerce.demo.dataAccess.abstracts.ProductDao;
import ecommerce.demo.entities.Product;

import java.util.List;

public class SqlProductDao implements ProductDao {
    @Override
    public void add(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public Product getById(int id) {
        return null;
    }
}
