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

    public String isLocal() {
        if (local)
            return "Local";
        else
            return "International";
    }

    public void showBrand(){
        System.out.println("Brand Id: "+brand_Id);
        System.out.println("Brand Name: "+brand_Name);
        System.out.println("Brand Origin: "+isLocal()+"\n");
    }
}

