package com.risyad.PBO.Pertemuan6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Masukkan Bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan Pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil +" (dibulatkan)");
        }
        //catch(ArithmeticException | InputMismatchException e){
        //  System.out.println("Error");
        //}
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        catch (InputMismatchException e){
            System.out.println("Error(masukkan angka)");
        }
        System.out.println("Done!");
    }
}
