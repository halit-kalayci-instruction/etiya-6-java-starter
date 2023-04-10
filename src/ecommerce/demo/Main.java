package ecommerce.demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Bir adet veritabanı gibi çalışacak sistem.
        // Bu veritabanın iş kurallarını uygulacak manager
        ProductDao inMemoryProductDao = new InMemoryProductDao();
        // Never Trust User Input
        Product product1 = new Product(1,"Oyuncak",300);
        Product product2 = new Product(2,"TV", 1500);
        Product product3 = new Product(3,"Telefon",3000);

        inMemoryProductDao.add(product1);
        inMemoryProductDao.add(product2);

        List<Product> productList = inMemoryProductDao.getAll();
        for(Product product: productList){
            System.out.println(product.getId() + "-" + product.getName());
        }

        inMemoryProductDao.add(product3);
        Product productToFind = inMemoryProductDao.getById(3);
        System.out.println("3 idsine sahip product: " + productToFind.getName());

        // Validation, Business Rule
        // Services-Managers
    }
}
