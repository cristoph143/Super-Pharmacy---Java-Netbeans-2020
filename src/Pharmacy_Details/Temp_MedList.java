/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacy_Details;

/**
 *
 * @author User
 */
public class Temp_MedList {
    
    
    private String genericName;
    private String brandName;
    private float p;
    private int q;
    private float total;

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setTotal(float total, float p, int q) {
        this.total = p*q;
    }

    
    public float getTotal() {
        return total;
    }

    
    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public Temp_MedList(String genericName, String brandName, float p, int q, float total) {
        this.genericName = genericName;
        this.brandName = brandName;
        this.p = p;
        this.q = q;
        this.total=p*q;
    }
}
