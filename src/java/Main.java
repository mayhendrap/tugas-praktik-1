public class Main {
    public static void main(String[] args) {
        Store store = new Store("Toko Maju Jaya");

        Product0002 p1 = new Product0002("Buku Tulis", 32000, 50);
        Product0002 p2 = new Product0002("Pensil", 50000, 20);

        store.addProduct(p1);
        store.addProduct(p2);

        store.displayProducts();

        System.out.printf("Beli 3 %s : Rp%,.0f%n", p1.getName(), p1.calculateTotalPrice(3));
        System.out.printf("Beli 5 %s : Rp%,.0f%n", p2.getName(), p2.calculateTotalPrice(5));

        System.out.printf("Nilai persediaan toko : Rp%,.0f%n", store.calculateInventoryValue());
    }
}
