class Laptop1 {
    private String company;
    private String processor;
    private int ram;
    private int storage;
    private boolean hasTouchscreen;

    public Laptop1() {
    }

    public Laptop1(String company) {
        this.company = company;
    }

    public Laptop1(String company, String processor) {
        this(company);
        this.processor = processor;
    }

    public Laptop1(String company, String processor, int ram) {
        this(company, processor);
        this.ram = ram;
    }

    public Laptop1(String company, String processor, int ram, int storage) {
        this(company, processor, ram);
        this.storage = storage;
    }

    public Laptop1(String company, String processor, int ram, int storage, boolean hasTouchscreen) {
        this(company, processor, ram, storage);
        this.hasTouchscreen = hasTouchscreen;
    }

    public String getCompany() {
        return company;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean isHasTouchscreen() {
        return hasTouchscreen;
    }
}
