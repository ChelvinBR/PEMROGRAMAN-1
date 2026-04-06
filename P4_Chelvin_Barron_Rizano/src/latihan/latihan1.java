package latihan;

import java.util.Scanner;

public class latihan1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            float kehadiran, realisasi, tugas, uts, uas;
            float nilaiAkhir;
    
            System.out.println("========= INPUT DATA =========");
    
            System.out.print("Masukkan jumlah kehadiran : ");
            kehadiran = input.nextFloat();
    
            System.out.print("Masukkan realisasi : ");
            realisasi = input.nextFloat();
    
            System.out.print("Masukkan nilai tugas : ");
            tugas = input.nextFloat();
    
            System.out.print("Masukkan nilai UTS : ");
            uts = input.nextFloat();
    
            System.out.print("Masukkan nilai UAS : ");
            uas = input.nextFloat();
    
            System.out.println("\n========= HASIL PERHITUNGAN =========");
    
            float nilaiKehadiran = 10 * (kehadiran / realisasi);
            float nilaiTugas = 0.2f * tugas;
            float nilaiUTS = 0.3f * uts;
            float nilaiUAS = 0.4f * uas;
    
            System.out.println("Nilai Kehadiran : " + nilaiKehadiran);
            System.out.println("Nilai Tugas     : " + nilaiTugas);
            System.out.println("Nilai UTS       : " + nilaiUTS);
            System.out.println("Nilai UAS       : " + nilaiUAS);
    
            nilaiAkhir = nilaiKehadiran + nilaiTugas + nilaiUTS + nilaiUAS;
    
            System.out.println("=====================================");
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
    
            input.close();
        }
    }
    