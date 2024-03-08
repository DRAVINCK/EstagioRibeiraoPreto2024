package org.example.Questao5;

public class Inversor {
    public static String inverterString(String str) {

        char[] caracteres = str.toCharArray();


        for (int i = 0; i < caracteres.length / 2; i++) {
            char temporario = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temporario;
        }


        String strInvertida = new String(caracteres);


        return strInvertida;
    }
}
