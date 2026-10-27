// NIM 1003260002 -> domain Toko, nilai dasar 32, productPrice 32000
public class Product0002 {
    private String name;
    private double productPrice;
    private int stock;

    public Product0002(String name, double productPrice, int stock) {
        setName(name);
        setProductPrice(productPrice);
        setStock(stock);
    }

    public String getName() {
        return name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        this.name = name;
    }

    public void setProductPrice(double productPrice) {
        if (productPrice <= 0) {
            throw new IllegalArgumentException("Harga produk harus lebih dari 0");
        }
        this.productPrice = productPrice;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif");
        }
        this.stock = stock;
    }

    public double calculateTotalPrice(int quantity) {
        if (quantity <= 0 || quantity > stock) {
            throw new IllegalArgumentException("Jumlah beli harus 1 sampai " + stock);
        }
        return productPrice * quantity;
    }

    @Override
    public String toString() {
        return String.format("%-12s | Rp%,10.0f | stok %3d", name, productPrice, stock);
    }
}
