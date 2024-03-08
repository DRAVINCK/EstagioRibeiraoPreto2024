package org.example.Questao5;

import static org.example.Questao5.Inversor.inverterString;

public class MainInversor {
    public static void main(String[] args) {

        String str = "Lucas Teixeira";

        String strInvertida = inverterString(str);

        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);



    }
}
