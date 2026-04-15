package latihan;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Pilihan (a. ayam, b. beruang): ");
        char pilihan = input.next().toLowerCase().charAt(0);

        String hasil;

        switch (pilihan) {
            case 'a':
                hasil = "Anda memilih hewan: Ayam";
                break;

            case 'b':
                hasil = "Anda memilih hewan: Beruang";
                break;

            default:
                hasil = "Pilihan tidak valid!";
                break;
        }

        System.out.println("\n===== HASIL =====");
        System.out.println(hasil);

        input.close();
    }
    
}
