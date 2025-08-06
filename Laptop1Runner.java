class Laptop1Runner {
    public static void main(String[] args) {
        Laptop1[] laptops = new Laptop1[5];

        laptops[0] = new Laptop1("HP", "Intel i5", 16, 512, true);
        laptops[1] = new Laptop1("Dell", "Intel i7", 8, 256, false);
        laptops[2] = new Laptop1("Asus", "Ryzen 5", 16, 512, true);
        laptops[3] = new Laptop1("Lenovo", "Intel i3", 4, 128, false);
        laptops[4] = new Laptop1("Apple", "M1", 8, 256, true);

        for (int i = 0; i < laptops.length; i++) {
            System.out.println("Company: " + laptops[i].getCompany());
            System.out.println("Processor: " + laptops[i].getProcessor());
            System.out.println("RAM: " + laptops[i].getRam() + " GB");
            System.out.println("Storage: " + laptops[i].getStorage() + " GB");
            System.out.println("Touchscreen: " + laptops[i].isHasTouchscreen());
            
        }
    }
}
