import java.util.Scanner;

/*
 Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. 
 Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. 
 Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir).
*/
public class Uni6Exe08Ter {
    public Uni6Exe08Ter() {
        Scanner input = new Scanner(System.in);
        int quantidade = 0;
        quantidade = lerQuantidade(input, quantidade);
        double[] valores = new double[quantidade];
        int[] frequencia = new int[valores.length];
        valores = lerValores(input, valores);
        frequencia = compararValores(valores, frequencia);
        escreverValores(valores, frequencia);
        input.close();
    }

    public static void main(String[] args) {
        new Uni6Exe08Ter();
    }

    public int lerQuantidade(Scanner input, int quantidade) {
        System.out.print("Informe a quantidade de números (limite de 20): ");
        quantidade = input.nextInt();
        return quantidade;
    }

    public double[] lerValores(Scanner input, double[] valores) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o " + (i + 1) + "° valor: ");
            valores[i] = input.nextDouble();
        }
        return valores;
    }
    public int[] compararValores (double[] valores, int[] frequencia){
        
        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores.length; j++){
                if (valores[i] == valores [j]){
                    frequencia[i]++;
                }
            }
        }
        return frequencia;
    }
    public void escreverValores (double[] valores, int[] frequencia){
        
        System.out.println("Valor           Frequência");
        String valoresUsados = "";
        for(int i = 0; i < valores.length; i++){
            if (!valoresUsados.contains(valores[i] + "")) {
                valoresUsados += (valores[i] + ";"); 
                // System.out.println(valores[i] + "              " + frequencia[i]);
                System.out.println(valores[i] + "                   " + frequencia[i]);
            }
        }
    }
}

