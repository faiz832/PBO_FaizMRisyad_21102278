package com.risyad.PBO.Pertemuan2;

import java.util.Scanner;
public class unguidedpass {
    public static void main(String[] args) {
        String username = "FaizR";
        String password = "2278";

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = input.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = input.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil silakan masuk");
        } else if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        } else {
            System.out.println("Username dan password Anda salah");
        }

        input.close();
    }
}
