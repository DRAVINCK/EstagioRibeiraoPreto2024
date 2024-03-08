package org.example.Questao2;

import java.util.Scanner;

public class MainFibonacci {
    public static void main(String[] args) {

        VerificaFibonacci verifica = new VerificaFibonacci();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        if(verifica.verificar(numero)){
            System.out.println("O número " + numero + " pertence a sequência Fibonacci");
        } else System.out.println("O número " + numero + " não pertence a sequência Fibonacci");
    }

}
