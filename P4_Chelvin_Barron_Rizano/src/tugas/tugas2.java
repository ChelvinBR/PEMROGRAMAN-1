package tugas;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();

        System.out.print("Masukkan lebar: ");
        double l = input.nextDouble();

        double luas = p * l;
        double keliling = 2 * (p + l);

        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);

        input.close();
    }
}
