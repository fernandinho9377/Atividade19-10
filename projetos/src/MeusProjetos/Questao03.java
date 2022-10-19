package MeusProjetos;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        /* 3. Escreva um programa que solicita a idade de uma pessoa e 
        verifica se ela pode votar (idade>=16). */
        Scanner ler = new Scanner(System.in); 
        System.out.println("Escreva a sua idade:");
        int idade = ler.nextInt();
        if(idade>=16){
            System.out.println("Parabéns você poderá votar!");
        }
        if(idade<16){
            System.out.println("Infelizmente você não pode votar!");
        }
    }
}
