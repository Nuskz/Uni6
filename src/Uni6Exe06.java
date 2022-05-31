import java.util.Scanner;



/**
 * Faça um programa que leia um valor N inteiro.
 * Com base neste valor, crie um vetor do tipo real.
 * Em seguida, solicite ao usuário informar essa quantidade N de valores reais
 * para popular o vetor.
 * Após ter preenchido o vetor, solicite que o usuário informe um outro valor
 * real.
 * Informe para o usuário se este valor informado se encontra cadastrado no
 * vetor.
 * Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso,
 * para encontrar o valor.
 */
public class Uni6Exe06 {
  public Uni6Exe06() {
    Scanner input = new Scanner(System.in);
    int quantidade = lerQuantidade(input);
    double[] valores = new double[quantidade];
    valores = lerValores(input, valores);
    double valor = lerProximoValor(input, valores);
    boolean confirmador = confirmarValores(valor, valores);
    escreverAoUsuario(confirmador, valor);
    input.close();
  }

  public static void main(String[] args) {
    new Uni6Exe06();
  }
  public int lerQuantidade (Scanner input){
    System.out.print("Informe a quantidade de valores: ");
    int quantidade = input.nextInt();
    return quantidade;
  }
  public double[] lerValores(Scanner input, double[] valores) {
    for (int i = 0; i < valores.length; i++) {
      System.out.print("\nInforme o " + (i + 1) + "° valor: ");
      valores[i] = input.nextDouble();
    }
    return valores;

  }

  public double lerProximoValor(Scanner input, double[] valores) {
    System.out.print("\nInforme mais um valor: ");
    double valor = input.nextDouble();
    
    return valor;
  }
  public boolean confirmarValores(double valor, double[] valores) {
    boolean confirmador = false;
    while (confirmador != true){
      int i = 0;
      if (valor == valores[i]){
        confirmador = true;
      } else confirmador = false;
      i++;
    }
    return confirmador;
  }
  public void escreverAoUsuario (boolean confirmador, double valor) {
    if (confirmador == true) {
      System.out.println("O valor " + valor + " está cadastrado");
    } else {
      System.out.println("O valor " + valor + " não está cadastrado");
    }
  }
}