package tugas;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        // S1: Pilih menu
        System.out.println("===== MENU =====");
        System.out.println("1. Input Data Mahasiswa");
        System.out.print("Pilih menu: ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                int kehadiran;
                double nilaiAkhir;

                System.out.println("\n=== INPUT DATA ===");

                // VALIDASI KEHADIRAN
                while (true) {
                    System.out.print("Masukkan kehadiran : ");
                    kehadiran = input.nextInt();

                    if (kehadiran >= 75 && kehadiran <= 100) {
                        break;
                    } else {
                        System.out.println("Kehadiran tidak valid! Harus 75 - 100");
                    }
                }

                // INPUT NILAI AKHIR
                System.out.print("Masukkan nilai akhir: ");
                nilaiAkhir = input.nextDouble();

                // PENENTUAN STATUS
                String status;
                if (kehadiran >= 75 && nilaiAkhir >= 60) {
                    status = "LULUS";
                } else {
                    status = "TIDAK LULUS";
                }

                // FINAL STATE
                System.out.println("\n===== HASIL =====");
                System.out.println("Kehadiran: " + kehadiran + "%");
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Status: " + status);
                break;

            default:
                System.out.println("Menu tidak tersedia");
        }

        input.close();
    }
}
