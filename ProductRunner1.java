public class ProductRunner1 {
    public static void main(String[] args) {
        Product[] cart = new Product[5];

        Product p1 = new Product();
        p1.setProductName("Laptop");
        p1.setProductCode(1001);
        p1.setProductPrice(55000.99);
        cart[0] = p1;

        Product p2 = new Product();
        p2.setProductName("Smartphone");
        p2.setProductCode(1002);
        p2.setProductPrice(24999.50);
        cart[1] = p2;

        Product p3 = new Product();
        p3.setProductName("Headphones");
        p3.setProductCode(1003);
        p3.setProductPrice(1999.00);
        cart[2] = p3;

        Product p4 = new Product();
        p4.setProductName("Keyboard");
        p4.setProductCode(1004);
        p4.setProductPrice(799.49);
        cart[3] = p4;

        Product p5 = new Product();
        p5.setProductName("Monitor");
        p5.setProductCode(1005);
        p5.setProductPrice(10499.99);
        cart[4] = p5;

        for (int i = 0; i < cart.length; i++) {
            Product item = cart[i];
            System.out.println("Product Name: " + item.getProductName());
            System.out.println("Product Code: " + item.getProductCode());
            System.out.println("Price: ₹" + item.getProductPrice());
            System.out.println("-------------------------");
        }
    }
}