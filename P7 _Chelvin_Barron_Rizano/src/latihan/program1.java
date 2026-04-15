package latihan;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "";

        System.out.print("Masukkan Pilihan (1. Teknik Informatika) : ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {

            System.out.println("Jurusan Informatika");

            System.out.print("Masukkan nama: ");
            nama = input.nextLine();

            System.out.println("\n=======Data======");
            System.out.println("Jurusan Informatika");
            System.out.println("Nama : " + nama);

        } else {
            System.out.println("Pilihan tidak valid");
        }

        input.close();
    }
    
}
