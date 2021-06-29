package project.entity;

public class ShowTable {
    private String itemId;
    private String itemName;
    private float qty;
    private float retailPrice;
    private float dis;
    private float promo;
    private float final_Price;


//    public ShowTable() {
//    }
//
//    public ShowTable(String itemId, String itemName, float qty, float retailPrice, float dis, float promo, float finalPrice) {
//        this.itemId = itemId;
//        this.itemName = itemName;
//        this.qty = qty;
//        this.retailPrice = retailPrice;
//        this.dis = dis;
//        this.promo = promo;
//        this.finalPrice = finalPrice;
//    }

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

    public float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(float retailPrice) {
        this.retailPrice = retailPrice;
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

    public float getFinal_Price() {
        return final_Price;
    }

    public void setFinal_Price(float finalPrice) {
        this.final_Price = final_Price;
    }
}
