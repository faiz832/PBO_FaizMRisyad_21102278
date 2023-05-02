package com.risyad.PBO.pertemuan3;

public class diamondmlbb {
    private String packageName;
    private int benefit;
    private int price;

    public diamondmlbb(String packageName, int benefit, int price) {
        this.packageName = packageName;
        this.benefit = benefit;
        this.price = price;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getBenefit() {
        return benefit;
    }

    public void setBenefit(int benefit) {
        this.benefit = benefit;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


