import java.text.DecimalFormat;
import java.util.Scanner;

/*
Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.
*/
public class Uni6Exe09 {
    public Uni6Exe09() {
        final int tamanho = 30;
        Scanner input = new Scanner(System.in);
        int[] notas = new int[tamanho];
        int[] idades = new int[tamanho];
        int[] sexos = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            sexos[i] = ler(input, "Cliente " + (i + 1) + " informe o seu sexo (1-Feminino, 2-Masculino): ");
            notas[i] = ler(input, "Cliente " + (i + 1) + " informe a sua nota para o filme (de 0 a 10): ");
            idades[i] = ler(input, "Cliente " + (i + 1) + " informe a sua idade: ");
            System.out.println();
        }

        double media = mediaCinema(notas);
        mediaHomens(notas, sexos);
        notaMulherMaisJovem(notas, sexos, idades);
        anciasNotaMaiorMedia(notas, sexos, idades, media);
        input.close();
    }

    public static void main(String[] args) {
        new Uni6Exe09();
    }

    public int ler(Scanner input, String mensagem) {
        System.out.print(mensagem);
        return input.nextInt();
    }

    public double mediaCinema(int[] notas) {
        double total = 0;
        for (int nota : notas) {
            total += nota;
        }
        DecimalFormat deci = new DecimalFormat("0.00");
        double media = total / notas.length;
        System.out.println("Média recebida pelo cinema: " + deci.format(media));
        return media;
    }
    public void mediaHomens (int[] notas, int[] sexos) {
        double total = 0;
        int qtdHomens = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 2) {
                qtdHomens++;
                total += notas[i];
            }
        }
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("Média dada pelos homens: " + deci.format(total / qtdHomens));
    }
    public void notaMulherMaisJovem(int[] notas, int sexos[], int[] idades) {
        int idadeMaisJovem = Integer.MAX_VALUE;
        int indexMulherMaisJovem = -1;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 1 && idades[i] < idadeMaisJovem) {
                idadeMaisJovem = idades[i];
                indexMulherMaisJovem = i;
            }
        }
        System.out.println("Nota dada pela mulher mais jovem: " + notas[indexMulherMaisJovem]);
    }

    public void anciasNotaMaiorMedia(int[] notas, int sexos[], int[] idades, double media) {
        int qtd = 0;
        for (int i = 0; i < notas.length; i++) {
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > media) {
                qtd++;
            } 
        }
        System.out.println("Quantidade de mulheres com mais 50 anos que deram nota acima da média: " + qtd);
    }
}
