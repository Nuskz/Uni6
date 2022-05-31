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

public class Uni6Exe04 {
    public Uni6Exe04() {
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] somaVetores = new int[10];
        vetor1 = lerVetor1(input, vetor1);
        vetor2 = lerVetor2(input, vetor2);
        somaVetores = somarVetores(vetor1, vetor2, somaVetores);
        escreverVetor1(vetor1);
        escreverVetor2(vetor2);
        escreverSomaVetores(somaVetores);
        input.close();
    }
    public static void main(String[] args) {
        new Uni6Exe04();
    }

    public int[] lerVetor1(Scanner input, int[] vetor1) {
        
        for (int i = 0; i < 10; i++){
            System.out.print("(Vetor 1) Informe o " + (i + 1) + "° valor: ");
            vetor1[i] = input.nextInt();
        } 
            
            return vetor1;
 
    }
    public int[] lerVetor2(Scanner input, int[] vetor2) {
        System.out.println("");
        for (int i = 0; i < 10; i++){
            System.out.print("(Vetor 2)Informe o " + (i + 1) + "° valor: ");
            vetor2[i] = input.nextInt();
            
        } 
        return vetor2;
    }
    public int[] somarVetores(int[] vetor1, int[] vetor2, int[]somaVetores) {
        
        for (int i = 0; i < somaVetores.length; i++) {
            somaVetores[i] = vetor1[i] + vetor2[i];

        }
        return somaVetores;
    }
    public void escreverVetor1 (int[] vetor1) {
        System.out.println("\n");
        System.out.print("Vetor 1: [ ");
        for (int i = 0; i < vetor1.length; i++){
            System.out.print(vetor1[i] + ", ");

        }
        System.out.print("]");
    }
    public void escreverVetor2 (int[] vetor2) {
        System.out.println("");
        System.out.print("Vetor 2: [ ");
        for (int i = 0; i < vetor2.length; i++){
            System.out.print(vetor2[i] + ", ");

        }
        System.out.print("]");
    }
    public void escreverSomaVetores(int[] somaVetores){
        System.out.println("");
        System.out.print("Soma dos Vetores: [ ");
        for (int i = 0; i < somaVetores.length; i++){
            System.out.print(somaVetores[i] + ", ");

        }
        System.out.print("]");
    }


}   
