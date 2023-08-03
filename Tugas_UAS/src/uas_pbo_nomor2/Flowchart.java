/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uas_pbo_nomor2;

    import java.util.Scanner;
/**
 *
 * @author Ade Eka Saputra
 * Nim : 22104410064
 */
public class Flowchart {

    public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil = 0;

        // Menampilkan menu pilihan
        System.out.println("Menu Pilihan:");
        System.out.println("1. a+b ");
        System.out.println("2. a-b ");
        System.out.print("Pilihan Anda (1/2): ");

        // Membaca pilihan dari pengguna
        Scanner scanner = new Scanner(System.in);
        int pilihan = scanner.nextInt();

        // Menggunakan switch-case untuk memproses pilihan
        switch (pilihan) {
            case 1:
                hasil = a + b;
                break;
            case 2:
                hasil = a - b;
                break;
            default:
                System.out.println("Pilihan Anda salah");
        }

        // Menampilkan hasil perhitungan jika pilihan valid
        if (pilihan == 1 || pilihan == 2) {
            System.out.println("Hasil: " + hasil);
        }
    }
}