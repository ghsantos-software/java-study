package org.example.classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage+ " ");
        }

        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry+ " ");
        }
    }

    public static void NumberFormat(){
        Locale localeDefault = Locale.getDefault();
        Locale localEN = new Locale("en", "US");
        Locale localFR = new Locale("fr", "FR");
        Locale localDE = new Locale("de", "DE");

        NumberFormat[] nfa = new NumberFormat[3];

        nfa[0] = NumberFormat.getInstance(localEN);
        nfa[1] = NumberFormat.getInstance(localFR);
        nfa[2] = NumberFormat.getInstance(localDE);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}
