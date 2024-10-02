package inputbranching;

import java.util.Scanner;

public class HitungIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Berat Badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Tinggi Badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kriteria
        String kriteria;
        
        if (imt < 18.5) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        // Output
        System.out.println("IMT: " + imt);
        System.out.println("Kriteria: " + kriteria);
    }
}