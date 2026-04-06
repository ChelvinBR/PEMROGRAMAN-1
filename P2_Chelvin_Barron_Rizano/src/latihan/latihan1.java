import java.util.Scanner;

public class latihan1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String Nama;
        Integer Nim;
        String Alamat;
        int Usia;
        String Ortu;
        String TempatLahir;
        String TanggalLahir;

        System.out.print("input Nama : ");
        Nama = input.nextLine();

        System.out.print("input Nim : ");
        Nim = input.nextInt();
        input.nextLine();

        System.out.print("input Alamat : ");
        Alamat = input.nextLine();

        System.out.print("input Usia : ");
        Usia = input.nextInt();
        input.nextLine();

        System.out.print("input Nama Orang Tua : ");
        Ortu = input.nextLine();

        System.out.print("input Tempat Lahir : ");
        TempatLahir = input.nextLine();

        System.out.print("input Tanggal Lahir : ");
        TanggalLahir = input.nextLine();

        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama : " + Nama);
        System.out.println("Nim : " + Nim);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);
        System.out.println("Orang Tua : " + Ortu);
        System.out.println("Tempat, Tanggal Lahir : " + TempatLahir + ", " + TanggalLahir);

        input.close();
    }
}