package MeusProjetos;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        /* 2. Escreva um programa que receba três inteiros e diga qual 
        deles é o maior e qual o menor.*/
        Scanner ler = new Scanner(System.in); 
        System.out.println("Escreva o primeiro número:");
        int num = ler.nextInt();
        System.out.println("Escreva o segundo número:");
        int num2 = ler.nextInt();
        System.out.println("Escreva o terceiro número:");
        int num3 = ler.nextInt();
        ler.close();

        if(num>num2 && num2>num3 && num3<num){
            System.out.println("O número "+num+" é o maior número e "+num3+ " é o menor número.");
        }
        if(num2>num3 && num3>num && num<num2){
            System.out.println("O número "+num2+" é o maior número e "+num+ " é o menor número.");
        }
        if(num3>num && num>num2 && num2<num3){
            System.out.println("O número "+num3+" é o maior número e "+num2+ " é o menor número.");
        }
        

    }
}
