package MeusProjetos;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        /* 6. Escreva um programa para calcular O IMC (índice de massa corpórea) que indica o grau de obesidade de uma pessoa.
    Este índice é obtido pelo peso (em kg) dividido pelo quadrado da altura (em metros).
    Entradas peso e altura, saída resultado do IMC e Avaliação.
    A tabela a seguir apresenta as faixas deste índice:
    IMC = Avaliação
    menor que 20 = Abaixo do normal
    entre 20, 25 = Normal
    entre 25, 30 = Sobrepeso
    entre 30, 35 = Obesidade leve
    entre 35, 40 = Obesidade moderada
    maior que 40 = Obesidade mórbida */
    Scanner ler = new Scanner(System.in); 
    System.out.println("Escreva o seu peso (em kg):");
    float peso = ler.nextFloat();
    System.out.println("Escreva a sua altura (em m):");
    float altura = ler.nextFloat();
    float imc = peso/(altura*altura);
    ler.close();
    
    if(imc<20){
        System.out.println("Abaixo do normal");
    }
    if(imc>20 && imc<25){
        System.out.println("Normal");
    }
    if(imc>25 && imc<30){
        System.out.println("Sobrepeso");
    }
    if(imc>30 && imc<35){
        System.out.println("Obesidade leve");
    }
    if(imc>35 && imc<40){
        System.out.println("Obesidade moderada");
    }
    if(imc>30 && imc<35){
        System.out.println("Obesidade leve");
    }
    if(imc>40){
        System.out.println("Obesidade mórbida");
    }
    
    }
}
