package org.example.classesutilitarias.resourcebundle;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("menssagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("ola"));
    }
}
