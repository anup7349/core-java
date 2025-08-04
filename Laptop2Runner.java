class Laptop2Runner {
    public static void main(String[] args) {
        Laptop2[] laptops = new Laptop2[5];

        Laptop2 l1 = new Laptop2();
        l1.setBrand_name("Dell");
        l1.setProcessor("Intel i7");
        l1.setPrice(70000);

        Laptop2 l2 = new Laptop2();
        l2.setBrand_name("HP");
        l2.setProcessor("Intel i5");
        l2.setPrice(60000);

        Laptop2 l3 = new Laptop2();
        l3.setBrand_name("Lenovo");
        l3.setProcessor("AMD Ryzen 5");
        l3.setPrice(55000);

        Laptop2 l4 = new Laptop2();
        l4.setBrand_name("Asus");
        l4.setProcessor("Intel i9");
        l4.setPrice(95000);

        Laptop2 l5 = new Laptop2();
        l5.setBrand_name("Acer");
        l5.setProcessor("Intel i3");
        l5.setPrice(40000);

        for (int i = 0; i < laptops.length; i++) {
            if (i == 0) {
                laptops[i] = l1;
            } else if (i == 1) {
                laptops[i] = l2;
            } else if (i == 2) {
                laptops[i] = l3;
            } else if (i == 3) {
                laptops[i] = l4;
            } else if (i == 4) {
                laptops[i] = l5;
            }
        }

        for (int i = 0; i < laptops.length; i++) {
            Laptop2 lap = laptops[i];
            System.out.println(lap.getBrand_name());
            System.out.println(lap.getProcessor());
            System.out.println(lap.getPrice());
        }
    }
}
