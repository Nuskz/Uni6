import java.util.Scanner;

/*
Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro.
 Escreva na ordem inversa em que foram lidos. 
 Faça um método para ler e outro para escrever.
*/
public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "° número: ");
            numeros[i] = input.nextInt();
        } 
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        input.close();   
    }
}
