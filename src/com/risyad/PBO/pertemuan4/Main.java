package com.risyad.PBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Hayabusa", "Assassin", 1000);
        Hero hero2 = new Marksman("Miya", 1200);

        System.out.println(hero1.getName() + " adalah hero " + hero1.getRole() + " dengan " + hero1.getDamage() + " damage");
        hero1.attack();

        System.out.println(hero2.getName() + " adalah hero " + hero2.getRole() + " dengan " + hero2.getDamage() + " damage");
        hero2.attack();

    }
}

