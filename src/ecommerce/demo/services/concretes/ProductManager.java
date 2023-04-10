package ecommerce.demo.services.concretes;

import ecommerce.demo.dataAccess.abstracts.ProductDao;
import ecommerce.demo.entities.Product;
import ecommerce.demo.services.abstracts.ProductService;

import java.util.List;

public class ProductManager implements ProductService {

    private final ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }
    // Bağımlılık
    // Dependency Injection

    @Override
    public void add(Product product) {
        // Validation
        if(product.getPrice()<=0){
            System.out.println("Fiyat 0'dan küçük olamaz.");
            return;
        }
        // Business Rule
        // CCC => Cross Cutting Concerns
        productDao.add(product);
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }

    @Override
    public Product getById(int id) {
        return productDao.getById(id);
    }
}
