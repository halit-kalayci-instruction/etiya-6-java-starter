package interfaces;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductBusinessManager();

        productService.addProduct();
        productService.getById(1);
        // 100 satır
    }
}
