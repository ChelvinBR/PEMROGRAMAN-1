package latihan;

import java.text.*;
import java.util.*;

public class latihan2 {
    public static void main(String args[]) {

        double Angka = 83243463.342245;
        double AngkaPecahan = 0.902235643;

        NumberFormat NumberFormatterGERMANY =
                NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat CurrFormatterGERMANY =
                NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat PercentFormatterGERMANY =
                NumberFormat.getPercentInstance(Locale.GERMANY);

        String NumberStrGERMANY = NumberFormatterGERMANY.format(Angka);
        String CurrStrGERMANY = CurrFormatterGERMANY.format(Angka);
        String PercentStrGERMANY =
                PercentFormatterGERMANY.format(AngkaPecahan);

        System.out.println("Format Angka     : " + NumberStrGERMANY);
        System.out.println("Format Mata Uang : " + CurrStrGERMANY);
        System.out.println("Format Persen    : " + PercentStrGERMANY);
    }
}
