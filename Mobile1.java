class Mobile1 {
    private String brand;
    private String model;
    private int storage;
    private float screenSize;
    private boolean is5G;

    public Mobile1() {
    }

    public Mobile1(String brand) {
        this.brand = brand;
    }

    public Mobile1(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Mobile1(String brand, String model, int storage) {
        this(brand, model);
        this.storage = storage;
    }

    public Mobile1(String brand, String model, int storage, float screenSize) {
        this(brand, model, storage);
        this.screenSize = screenSize;
    }

    public Mobile1(String brand, String model, int storage, float screenSize, boolean is5G) {
        this(brand, model, storage, screenSize);
        this.is5G = is5G;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public boolean is5G() {
        return is5G;
    }
}
