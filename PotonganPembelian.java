package inputbranching;

import java.util.Scanner;

public class PotonganPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Total Pembelian Rp.: ");
        double totalPembelian = input.nextDouble();

        // Menentukan besarnya potongan
        double potongan;
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.2 * totalPembelian;
        }

        // Menghitung jumlah yang harus dibayarkan
        double jumlahBayar = totalPembelian - potongan;

        // Output
        System.out.println("Besarnya potongan Rp.: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp.: " + jumlahBayar);
    }
}