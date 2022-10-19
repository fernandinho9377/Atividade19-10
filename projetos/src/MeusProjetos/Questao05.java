package MeusProjetos;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        System.out.println("Escreva a sua idade:");
        int idade = ler.nextInt();
        if(idade<16){
            System.out.println("Não poderá votar e nem dirigir!");
        }
        if(idade>=16 && idade<18){
            System.out.println("Poderá votar mas não poderá dirigir!");
        }
        if(idade>=18){
            System.out.println("Poderá votar e dirigir!");
        }
        
    }
}
