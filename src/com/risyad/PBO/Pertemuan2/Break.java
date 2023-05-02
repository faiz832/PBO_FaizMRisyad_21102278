package com.risyad.PBO.Pertemuan2;

public class Break {
    public static void main(String[] args){
        int p = 1;
        while (p<=100){
            System.out.println("Looping...("+p+")");
            p+=10;
            if(p==51){
                System.out.println("dahlah!");
                break;
            }
        }
    }
}
