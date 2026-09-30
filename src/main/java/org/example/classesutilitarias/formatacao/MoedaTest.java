package org.example.classesutilitarias.formatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MoedaTest {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localEN = new Locale("en", "US");
        Locale localFR = new Locale("fr", "FR");
        Locale localDE = new Locale("de", "DE");

        NumberFormat[] nfa = new NumberFormat[3];

        nfa[0] = NumberFormat.getCurrencyInstance(localEN);
        nfa[1] = NumberFormat.getCurrencyInstance(localFR);
        nfa[2] = NumberFormat.getCurrencyInstance(localDE);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "$1000.5958.0595";
        try {
            System.out.println(nfa[0].parse(valorString));
        }catch (ParseException e){
            e.printStackTrace();
        }


    }
}
