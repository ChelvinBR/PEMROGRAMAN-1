package latihan;

import javax.swing.JOptionPane;

public class latihan1 {
    public static void main(String[] args) {

        String nama;

        nama = JOptionPane.showInputDialog("Ketik nama anda : ");

        String msg = "Hello " + nama + 
                     "\nLanjutkan belajarnya, pasti bisa jadi programmer Java!";

        JOptionPane.showMessageDialog(null, msg);
    }
}
