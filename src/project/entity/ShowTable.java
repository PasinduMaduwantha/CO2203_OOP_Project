package project.entity;

public class ShowTable {
    private String itemId;
    private String itemName;
    private float qty;
    private float rPrice;
    private float dis;
    private float promo;
    private float fPrice;


    public ShowTable() {
    }

    public ShowTable(String itemId, String itemName, float qty, float rPrice, float dis, float promo, float fPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.qty = qty;
        this.rPrice = rPrice;
        this.dis = dis;
        this.promo = promo;
        this.fPrice = fPrice;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public float getrPrice() {
        return rPrice;
    }

    public void setrPrice(float rPrice) {
        this.rPrice = rPrice;
    }

    public float getDis() {
        return dis;
    }

    public void setDis(float dis) {
        this.dis = dis;
    }

    public float getPromo() {
        return promo;
    }

    public void setPromo(float promo) {
        this.promo = promo;
    }

    public float getfPrice() {
        return fPrice;
    }

    public void setfPrice(float fPrice) {
        this.fPrice = fPrice;
    }
}
