package com.risyad.PBO.pertemuan4;

public class Hero {
   protected String name;
   protected String role;
   protected int damage;

   public Hero(String name, String role, int damage) {
      this.name = name;
      this.role = role;
      this.damage = damage;
   }

   public void attack() {
      System.out.println(name + " memiliki damage sebesar " + damage);
   }

   public String getName() {
      return name;
   }

   public String getRole() {
      return role;
   }

   public int getDamage() {
      return damage;
   }
}
