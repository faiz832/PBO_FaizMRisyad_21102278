package com.risyad.PBO.pertemuan3;

import java.util.Scanner;

public class TopUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        diamondmlbb[] packages = {
                new diamondmlbb("Warrior", 100, 10000),
                new diamondmlbb("Epic", 500, 50000),
                new diamondmlbb("Mythic", 1000, 100000)
        };

        System.out.println("FAIZ RISYAD DIAMOND STORE");
        System.out.println("Paket yang tersedia:");
        for (int i = 0; i < packages.length; i++) {
            System.out.printf("%d. Paket %s - Benefit: %d Diamond - Harga: Rp%d%n",
                    i+1, packages[i].getPackageName(), packages[i].getBenefit(),
                    packages[i].getPrice());
        }

        System.out.print("Masukkan nomor paket yang ingin kamu beli: ");
        int choice = input.nextInt();

        if (choice >= 1 && choice <= 3) {
            System.out.printf("Kamu membeli Paket %s seharga Rp%d dengan benefit %d Diamond. " +
                    "Terima kasih telah berbelanja!%n", packages[choice-1].getPackageName(),
                    packages[choice-1].getPrice(), packages[choice-1].getBenefit());
        } else {
            System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
        }

        System.out.println("Terima kasih telah menggunakan layanan topup diamond kami.");
    }
}