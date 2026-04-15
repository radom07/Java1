public class Shop {

    private String name;
    private Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProducts() {
        System.out.println("All product in the shop:");
        for (Product product : products) {
            product.showProduct();
        }
    }


}
