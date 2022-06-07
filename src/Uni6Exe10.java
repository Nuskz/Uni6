import java.util.Scanner;

/*
Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor um valor maior que 0, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). 
Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;

“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. 
A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;

“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
“7 – Inverter valores”: desafio (ver abaixo);
“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.
Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.
Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado neste vídeo. 
Existem também outros vídeos que mostram a lógica de ordenação usando o "método bolha", no caso é só procurar por "Bubble Sort". 
Um deles é Bubble Sort | GeeksforGeeks. Um outro um pouco mais "divertido" procura mostrar a lógica usando uma coreografia de dança: 
Bubble sort with Hungarian, folk dance.

Desafio: adapte o código acima para ter mais uma opção no menu para também poder inverter os elementos dentro de um vetor. 
ssim o último elemento passa a ser o primeiro, o penúltimo passa ser o segundo, e assim sucessivamente para todos os elementos da lista. 
Mas lembre, não se deve considerar o vetor inteiro, mas somente os elementos que já foram adicionados no vetor. 
Como base use o código descrito em vetorInverter.java.
*/

public class Uni6Exe10Ter {

    Uni6Exe10Ter() {
        int[] vetor = new int[50];
        Scanner input = new Scanner(System.in);
        int acao = -1;

        while (acao != 8) {
            System.out.println(
                "\n-----------------------------" +
                "\n| 1: Incluir valor          |" +
                "\n| 2: Pesquisar valor        |" +
                "\n| 3: Alterar valor          |" +
                "\n| 4: Excluir valor          |" +
                "\n| 5: Mostrar valores        |" +
                "\n| 6: Ordenar valores        |" +
                "\n| 7: Inverter valores       |" +
                "\n| 8: Sair do sistema        |" +
                "\n-----------------------------"
            );
            acao = input.nextInt();
            
            switch (acao) {
                case 1: vetor = incluirValor(input, vetor);
                break;
                case 2: pesquisarValor(input, vetor);
                break;
                case 3: vetor = alterarValor(input, vetor);
                break;
                case 4: vetor = excluirValor(input, vetor);
                break;
                case 5: mostrarValores(vetor);
                break;
                case 6: vetor = ordenarValores(vetor);
                break;
                case 7: vetor = inverter(vetor);
                break;
            }
        }
        input.close();
    }
    
    public static void main(String[] args) {
        new Uni6Exe10Ter();
    }
    public int[] incluirValor(Scanner input, int[] vetor) {
        System.out.print("Informe um valor diferente de 0: ");
        int valor = input.nextInt();
        // System.out.println(vetor.length);
        // if (vetor.length < 50) {
            //     for (int i = 0; i < 50; i++){
                //         System.out.println(vetor[i]);
                //         // if (vetor[i] == null) {}
                //     }
                // } else {
                    // }
                    // return vetor;
        int index = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("O valor não foi incluído pois o vetor já está cheio");
        } else {
            System.out.println("O valor foi incluído com sucesso");
            vetor[index] = valor;
        }
        
        return vetor;
    }
    public void pesquisarValor (Scanner input , int[] vetor){
        System.out.print("Informe o valor que deseja pesquisar: ");
        int pesquisa = input.nextInt();

        int index = encontrar(vetor, pesquisa);
        if (index > -1) {
            System.out.println("O número está incluído no vetor");
        } else {
            System.out.println("Número não encontrado!");
        }
    }
    
    public int[] alterarValor (Scanner input , int[] vetor){
        System.out.print("Informe o número a ser substituído: ");
        int pesquisa = input.nextInt();
        System.out.print("Informe o substituto (diferente de 0): ");
        int novo = input.nextInt();

        int index = encontrar(vetor, pesquisa);
        if (index > -1) {
            vetor[index] = novo;
        } else {
            System.out.println("Número não encontrado!");
        }
        return vetor;
    }

    public int encontrar (int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
    public int[] excluirValor(Scanner input, int[] vetor) {
        System.out.print("Informe o número a ser apagado: ");
        int apagar = input.nextInt();

        int index = encontrar(vetor, apagar);
        if (index > -1) {
            for (int i = index; i < vetor.length; i++) {
                if (i == 49) {
                    break;
                }
                vetor[i] = vetor[i + 1];
            }
            System.out.println("O " + (index + 1) + "° item foi excluido");
        } else {
            System.out.println("Valor não existe");
        }

        return vetor;
    }
    public void mostrarValores(int[] valores) {
        String relatorio = "[";
        for (int valor: valores) {
            // if (valor != 0) {
                relatorio += valor + "; ";
            // }
        }
        relatorio += "]";
        System.out.println(relatorio);
    }

    public int[] ordenarValores(int[] valores) {
        boolean mudou = true;
        while (mudou) {
            mudou = false;
            for (int i = 0; i < valores.length; i++) {
                int proximoIndex = i + 1 < valores.length ? i + 1 : i;
                if (valores[i] > valores[proximoIndex]) {
                    mudou = true;
                    int valorMenor = valores[proximoIndex];
                    valores[proximoIndex] = valores[i];
                    valores[i] = valorMenor;
                }
            }
        }
        return valores;
    }

    public int[] inverter(int[] vetor) {
        int[] novoVetor = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            int valor = vetor[vetor.length - (i + 1)];
            novoVetor[i] = valor;
        }
        while (novoVetor[0] == 0) {
            for (int i = 0; i < novoVetor.length; i++) {
                int proximoIndex = i + 1 < novoVetor.length ? i + 1 : i;
                int valorMenor = novoVetor[proximoIndex];
                novoVetor[proximoIndex] = novoVetor[i];
                novoVetor[i] = valorMenor;
            }
        }
        return novoVetor;
    }
}