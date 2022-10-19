package MeusProjetos;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        /* 4. Escreva um programa que solicita a idade de uma pessoa e 
        verifica se ela pode dirigir (idade>=18). */
        Scanner ler = new Scanner(System.in); 
        System.out.println("Escreva a sua idade:");
        int idade = ler.nextInt();
        if(idade>=18){
            System.out.println("Parabéns com essa idade, estando habilitado, poderá dirigir!");
        }
        if(idade<18){
            System.out.println("Infelizmente você não poderá dirigir!");
        }
    }
}
