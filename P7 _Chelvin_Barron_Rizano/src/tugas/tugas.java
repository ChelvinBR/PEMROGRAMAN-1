package tugas;

import java.util.Scanner;

public class tugas {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai >= 75) {
            System.out.println("\n===== HASIL =====");
            System.out.println("Nama  : " + nama);
            System.out.println("Nilai : " + nilai);
            System.out.println("Status: LULUS");
        } else {
            System.out.println("\n===== HASIL =====");
            System.out.println("Nama  : " + nama);
            System.out.println("Nilai : " + nilai);
            System.out.println("Status: TIDAK LULUS");
        }

        input.close();
    }
    
}
