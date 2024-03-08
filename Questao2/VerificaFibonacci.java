package org.example.Questao2;

public class VerificaFibonacci {

    public boolean verificar(int num){
        int a = 0;
        int b = 1;

        while (b < num){
            int temporario = a + b;
            a = b;
            b = temporario;
        }
        return b == num;
    }
}
