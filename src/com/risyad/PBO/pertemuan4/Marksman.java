package com.risyad.PBO.pertemuan4;

public class Marksman extends Hero {
    public Marksman(String name, int damage) {
        super(name, "Marksman", damage);
    }

    public void attack() {
        System.out.println(name + " memiliki damage sebesar " + damage);
    }
}
