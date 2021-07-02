package project.entity;

public class Brands {
    private String brand_Id;
    private String brand_Name;
    private boolean local;

    public Brands(String brand_Id, String brand_Name, boolean local) {
        this.brand_Id = brand_Id;
        this.brand_Name = brand_Name;
        this.local = local;
    }

    public String getBrand_Id() {
        return brand_Id;
    }

    public String getBrand_Name() {
        return brand_Name;
    }

    public boolean isLocal() {
        return local;
    }
}
