
/*
 Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. 
 Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
 Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. 
 Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. 
 Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
 Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]

Faça um programa que leia um valor N inteiro limitado a 20 posições. 

Com base neste valor, crie um vetor do tipo inteiro. 
Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. 
Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. 
Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]
 */
import java.util.Scanner;

public class Uni6Exe07Ter {
    public Uni6Exe07Ter() {
        Scanner input = new Scanner(System.in);
        int quantidade = lerQuantidade(input);
        int[] vetor = new int[quantidade];
        int[] vetorOrdem = new int [vetor.length];
        vetor = lerVetor(input, vetor);

        input.close();
    }

    public static void main(String[] args) {
        new Uni6Exe07Ter();
    }

    public int lerQuantidade(Scanner input) {
        System.out.print("Digite a quantidade de elementos(Limite de 20): ");
        int quantidade = input.nextInt();
        return quantidade;

    }

    public int[] lerVetor(Scanner input, int[] vetor) {
        int i = 0;
        while (i < vetor.length) {
            System.out.print("\nInforme o " + (i + 1) + " ° valor: ");
            int num = input.nextInt();
             
            boolean igual = false;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == num) {
                    igual = true;
                }
            }
            if (igual) {
                System.out.print("O valor: " + vetor[i] + " já foi informado, insira um diferente: ");
                i--;
            } else {
                vetor[i] = num;
                i++;
            }

        }
        return vetor;
    }
    public int[] organizarVetor (int[] vetor) {





        return null;
    }

}
