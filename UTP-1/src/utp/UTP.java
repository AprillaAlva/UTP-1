package utp;

import java.util.Scanner;

public class UTP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float px, pl, dx, hs1, hs2, hs3;
        String user, pass;
        int menu, hpx = 14300, hpl = 10000, hdx = 18250;

        System.out.println("===========================================");
        System.out.println("       Selamat Datang,Silahkan Login      ");
        System.out.println("===========================================");
        System.out.print("Username : ");
        user = sc.nextLine();
        System.out.print("Password : ");
        pass = sc.nextLine();

        if (user.equals("aprilla alva rifki") && pass.equals("2311016210003")) {
            System.out.println("===========================================");
            System.out.println("Login Berhasil, Selamat Datang di Pertamina");
            System.out.println("===========================================");

            System.out.println("\n                Daftar BBM                 ");
            System.out.println("===========================================");
            System.out.print("1. Pertamax \n2. Pertalite \n3. DEX \nPilih Jenis BBM : ");
            menu = sc.nextInt();
            System.out.println("===========================================");

            switch (menu) {
                case 1:
                    System.out.println("Pertamax \nHarga per Liter RP 14.300");
                    System.out.println("===========================================");
                    System.out.print("Input Jumlah BBM (Dalam Liter) : ");
                    px = sc.nextFloat();
                    System.out.println("===========================================");
                    if (px > 0.0) {
                        hs1 = hpx * px;
                        System.out.println("Total Harga Adalah RP " + hs1);
                    } else {
                        System.err.println("Inputan Tidak Valid");
                    }
                    break;

                case 2:
                    System.out.println("Pertalite \nHarga per Liter RP 10.000");
                    System.out.println("===========================================");
                    System.out.print("Input Jumlah BBM (Dalam Liter) : ");
                    pl = sc.nextFloat();
                    System.out.println("===========================================");
                    if (pl > 0.0) {
                        hs2 = hpl * pl;
                        System.out.println("Total Harga Adalah RP " + hs2);
                    } else {
                        System.err.println("Inputan Tidak Valid");
                    }
                    break;

                case 3:
                    System.out.println("DEX \nHarga per Liter RP 18.250");
                    System.out.println("===========================================");
                    System.out.print("Input Jumlah BBM (Dalam Liter) : ");
                    dx = sc.nextFloat();
                    System.out.println("===========================================");
                    if (dx > 0.0) {
                        hs3 = hdx * dx;
                        System.out.println("Total Harga Adalah RP " + hs3);
                    } else {
                        System.err.println("Inputan Tidak Valid");
                    }
                    break;

                default:
                    System.err.println("Pilihan Tidak Tersedia");
            }

        } else {
            System.err.println("Login Gagal, Username atau Password Salah");
        }

    }
}
