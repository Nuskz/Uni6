import java.util.Scanner;

/*
Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
Por exemplo: 
vetor1 = [1,2,3] 
vetor2 = [1,5,6] 
________________
vetor3 = [2,7,9]. 

Exiba, ao final, os três vetores na tela. 
Faça três métodos: 
um método para ler valores dos vetores, 
outro para somar e 
outro para escrever os vetores.
*/

public class Uni6Exe04Ter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];
        int cont = 1;
        for (int i = 0; i < vetor1.length; i++){
            System.out.print("\nInforme o valor " + (i+1) + " do vetor [1]: ");
            vetor1[i] = input.nextInt();
            
            //System.out.print("\nInforme o valor " + (i+1) + " do vetor [2]: ");
            //vetor2[i] = input.nextInt();
    
        }
        for (int i = 0; i < vetor1.length; i++){
            System.out.println("\n");
            System.out.println("Vetor[1]: [" + vetor1[i] + ", " + vetor1[i + 1] + ", " + vetor1[i + 2] + "]" );
            
            i+=2;
        }

        input.close();
    }
}
