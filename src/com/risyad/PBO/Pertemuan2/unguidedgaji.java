package com.risyad.PBO.Pertemuan2;
import java.util.Scanner;
public class unguidedgaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");

        System.out.print("Masukkan gaji Anda: ");
        double gaji = input.nextDouble();

        System.out.print("Masukkan tunjangan Anda: ");
        double tunjangan = input.nextDouble();

        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * 0.0765; // pajak 7.65%
        double gajiBersih = gajiKotor - pajakNegara;

        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih + ".");

        input.close();
    }
}
