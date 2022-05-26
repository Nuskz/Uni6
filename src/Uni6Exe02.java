import java.util.Scanner;

/**
 Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
 Imprima quais valores desses informados são maiores que a média dos valores. 
 Faça um método para ler os valores,
outro para calcular a média e outro para informar os valores maiores que a média.
 */
public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] valores = new double[12];
        double total = 0;
        
        for (int i = 0; i < 12; i++){
            System.out.println("Informe o " + (i + 1) + "° valor");
            double valor = input.nextDouble();
            total += valor;
            valores[i] = valor;
        }
        double media = total / valores.length;
        System.out.println("Média: " + media);
        for (double valor : valores){
            if (valor > media){
                System.out.println("Valor maior que a média:" + valor);
            }

        }
        input.close();
    }
}
