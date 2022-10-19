package MeusProjetos;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        /*1. Escreva um programa que leia um número e escreva na tela se o número
         é menor, igual ou maior que zero*/
         Scanner ler = new Scanner(System.in);   
         System.out.println("Escreva um número");
         float n = ler.nextFloat();
         if(n>0){
            System.out.println("O número é maior que zero!");
         }
         if(n<0){
            System.out.println("O número é menor que zero!");
            
         }
         if(n==0){
            System.out.println("O número é igual a zero!");
         }
         ler.close();
   
    }
}





