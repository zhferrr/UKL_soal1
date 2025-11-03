package com.mycompany.latukl.java;

import java.util.Scanner; // <-- kamu lupa import Scanner

/**
 *
 * @author ZHAFIR AKBAR ABQARY
 */
public class LatUKLJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Tentukan biaya per kg
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        // Hitung biaya berat
        double biayaBerat = berat * biayaPerKg;

        // Hitung biaya volume jika melebihi batas
        double biayaVolume = 0;
        if (volume > 100000) { // ubah batas volume agar lebih realistis (100 cm³ terlalu kecil)
            biayaVolume = 50000;
        }

        // Hitung total biaya
        double totalBiaya = biayaBerat + biayaVolume;

        // Tampilkan hasil
        System.out.println("\n=== Rincian Biaya Pengiriman ===");
        System.out.println("Volume paket : " + volume + " cm³");
        System.out.println("Biaya berat  : Rp " + biayaBerat);
        System.out.println("Biaya volume : Rp " + biayaVolume);
        System.out.println("------------------------------");
        System.out.println("Total biaya  : Rp " + totalBiaya);

        input.close();
    }
}
