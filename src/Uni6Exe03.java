import java.util.Scanner;

/*
 Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
 Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares 
 sejam aumentados em 2%. Imprima o vetor resultante. 
 Faça um método para ler os valores, 
 outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.
*/
public class Uni6Exe03 {

    public Uni6Exe03() {
        Scanner input = new Scanner(System.in);
        double[] valores = new double[12];
        lerValores(input, valores);
        ajustarValores(valores);
        escreverValores(valores);
        input.close();
    }

    public double[] lerValores(Scanner input, double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o " + (i + 1) + "° valor:");
            valores[i] = input.nextDouble();

        }
        return valores;
    }

    public double[] ajustarValores(double[] valores) {
        double aumento = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
            if (valores[i] % 2 == 0) {
                aumento = valores[i] * 0.02;
                valores[i] += aumento;

            } else {
                aumento = valores[i] * 0.05;
                valores[i] += aumento;
            }
           
        }
        return valores;
    }
    public void escreverValores (double[] valores){
        System.out.println("Valores Atualizados: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);

        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}
