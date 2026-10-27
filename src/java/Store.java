import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private final List<Product0002> products = new ArrayList<>();

    public Store(String storeName) {
        setStoreName(storeName);
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        if (storeName == null || storeName.isBlank()) {
            throw new IllegalArgumentException("Nama toko tidak boleh kosong");
        }
        this.storeName = storeName;
    }

    public void addProduct(Product0002 product) {
        if (product == null) {
            throw new IllegalArgumentException("Produk tidak boleh null");
        }
        products.add(product);
    }

    public double calculateInventoryValue() {
        double total = 0;
        for (Product0002 p : products) {
            total += p.getProductPrice() * p.getStock();
        }
        return total;
    }

    public void displayProducts() {
        System.out.println("Daftar produk " + storeName + ":");
        for (Product0002 p : products) {
            System.out.println("  " + p);
        }
    }
}
