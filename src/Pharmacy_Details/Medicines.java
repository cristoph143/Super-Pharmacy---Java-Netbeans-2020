package Pharmacy_Details;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joopb16
 */
public class Medicines {
    private String brandName;
    private String genericName;
    private int quantity;
    private float price;
    private float total;
    private float grandTotal;
    private float change;
    private float amount;
    private float mon;

    public float getMon() {
        return mon;
    }

    public void setMon(float mon) {
        this.mon = mon;
    }

    public float getAmount(float num) {
        return amount*num;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
    
    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public Medicines(String brandName, String genericName, int quantity, float price, float total, float grandTotal) {
        this.brandName = brandName;
        this.genericName = genericName;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
//        this.grandTotal = grandTotal;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getGenericName() {
        return genericName;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public float getTotal() {
        return total;
    }

//    public float getGrandTotal() {
//        return grandTotal;
//    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTotal(float total) {
        this.total = total;
    }

//    public void setGrandTotal(float grandTotal) {
//        this.grandTotal = grandTotal;
//    }
    
    @Override
    public String toString() {
        return brandName+ "\t\t" + genericName+ "\t\t" + quantity + "\t\t" + price + "\t\t" + total  ;
    }
//    public float toStrings(){
//        return  grandTotal;
//    }

    float getPrice(float addMon) {
        
        return addMon;
    }
    
}
