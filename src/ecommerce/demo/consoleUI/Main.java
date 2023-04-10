package ecommerce.demo.consoleUI;

import ecommerce.demo.dataAccess.abstracts.ProductDao;
import ecommerce.demo.dataAccess.concretes.InMemoryProductDao;
import ecommerce.demo.dataAccess.concretes.SqlProductDao;
import ecommerce.demo.entities.Product;
import ecommerce.demo.services.abstracts.ProductService;
import ecommerce.demo.services.concretes.ProductManager;

public class Main {
    // Client
    public static void main(String[] args) {
        // Bir adet veritabanı gibi çalışacak sistem.
        // Bu veritabanın iş kurallarını uygulacak manager
        // Never Trust User Input
        Product product1 = new Product(1,"Oyuncak",300);
        Product product2 = new Product(2,"TV", 1500);
        Product product3 = new Product(3,"Telefon",-5);


        ProductDao sqlProductDao = new SqlProductDao();
        ProductDao inMemoryProductDao = new InMemoryProductDao();

        ProductService productService = new ProductManager(inMemoryProductDao);
        productService.add(product1);
        productService.add(product2);
        productService.add(product3);

        for (Product product: productService.getAll()){
            System.out.println(product.getId()  + "-" + product.getName());
        }
        // Validation, Business Rule
        // Services-Managers
    }
}
