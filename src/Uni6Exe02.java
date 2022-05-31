import java.util.Scanner;

/**
 * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
 * 12 posições do tipo real.
 * Imprima quais valores desses informados são maiores que a média dos valores.
 * Faça um método para ler os valores,
 * outro para calcular a média e outro para informar os valores maiores que a
 * média.
 */
public class Uni6Exe02 {
    
    public Uni6Exe02() {
        Scanner input = new Scanner(System.in);
        double[] valores = new double[12];
        
        lerValores(input, valores);
        double media = calcularMedia(valores, input);
        escreverMedia(media, valores);
        input.close();
    }
    public static void main(String[] args) {
        new Uni6Exe02();
    }
    
    public double[] lerValores(Scanner input, double[] valores) {

        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor");
            double valor = input.nextDouble();
            valores[i] = valor;
        }
        return valores;
    }

    public double calcularMedia(double[] valores, Scanner input) {
        double total = 0;

        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }
        return total / valores.length;

    }

    public void escreverMedia(double media, double[] valores) {
        System.out.println("Média: " + media);
        for (double valor : valores) {
            if (valor > media) {
                System.out.println("Valor maior que a média:" + valor);
            }
        }
    }

}
