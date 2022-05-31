import java.util.Scanner;

/**
 * Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça
 * cada um respondeu um questionário
 * com 5 perguntas, como por exemplo:
 * 
 * Gosta de música sertaneja?
 * Gosta de futebol?
 * Gosta de seriados?
 * Gosta de redes sociais?
 * Gosta da Oktoberfest?
 * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice
 * de afinidade é medido da seguinte maneira:
 * 
 * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
 * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
 * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
 * Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as
 * respostas da moça.
 * Crie um método que possa ler tanto as respostas do rapaz como da moça, e
 * outro para calcular e retornar a afinidade.
 * Por fim, escreva a afinidade considerando os seguintes intervalos:
 * 
 * Afinidade Mensagem
 * 15 “Casem!
 * 10 a 14 “Vocês têm muita coisa em comum!”
 * 5 a 9 “Talvez não dê certo :(”
 * 0 a 4 “Vale um encontro.”
 * -1 a -9 “Melhor não perder tempo”
 * -10 “Vocês se odeiam!”
 */
public class Uni6Exe05 {
    public Uni6Exe05() {
        Scanner input = new Scanner(System.in);
        String respostaMoca[] = new String[5];
        String[] respostaRapaz = new String[5];
        String[] perguntas = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?", "Gosta da Oktoberfest?" };
        respostaRapaz = lerRespostasRapaz(input, perguntas, respostaRapaz);
        respostaMoca = lerRespostasMoca(input, perguntas, respostaMoca);
        int afinidade = calcularAfinidade(respostaRapaz, respostaMoca);
        escreverAfinidade(afinidade);
        input.close();
    }

    public static void main(String[] args) {
        new Uni6Exe05();

    }

    public String[] lerRespostasRapaz(Scanner input, String[] perguntas, String[] respostaRapaz) {
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostaRapaz[i] = input.next();
        }
        return respostaRapaz;
    }

    public String[] lerRespostasMoca(Scanner input, String[] perguntas, String[] respostaMoca) {
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostaMoca[i] = input.next();
        }
        return respostaMoca;
    }

    public int calcularAfinidade(String[] respostaRapaz, String[] respostaMoca) {
        int afinidade = 0;

        for (int i = 0; i < 5; i++) {
            if (respostaMoca[i].trim().equalsIgnoreCase(respostaRapaz[i])) {
                afinidade += 3;
            } else if (respostaMoca[i].trim().equalsIgnoreCase("Sim") && respostaRapaz[i].trim().equalsIgnoreCase("Não")
                    || respostaMoca[i].trim().equalsIgnoreCase("Não")
                            && respostaRapaz[i].trim().equalsIgnoreCase("Sim")) {
                afinidade -= 2;
            } else {
                afinidade++;
            }
        }
        return afinidade;
    }

    public void escreverAfinidade(int afinidade) {
        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade <= 14 && afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade <= 9 && afinidade >= 5) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade <= 4 && afinidade >= 0) {
            System.out.println("“Vale um encontro");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }
}