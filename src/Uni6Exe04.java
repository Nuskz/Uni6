import java.util.Scanner;

/*
Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
Por exemplo: 
vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. 

Exiba, ao final, os três vetores na tela. 
Faça três métodos: 
um método para ler valores dos vetores, 
outro para somar e 
outro para escrever os vetores.
*/

public class Uni6Exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("(Vetor1) Informe o: " + (i + 1) + "° valor:");
            vetor1[i] = input.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("(Vetor2) Informe o: " + (i + 1) + "° valor:");
            vetor2[i] = input.nextInt();
        }
        System.out.println("Vetor 1: [ " );    

        int soma = 0;
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        input.close();
    }
}
