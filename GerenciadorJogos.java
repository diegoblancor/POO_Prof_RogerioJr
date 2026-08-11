import java.util.Scanner;

public class GerenciadorJogos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        final int LIMITE = 100;
        String[] jogos = new String[LIMITE];
        int totalJogos = 0;

        int opcao;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Atualizar jogo");
            System.out.println("4 - Remover jogo");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção");

            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogo: ");
                    String nomeJogo = leia.nextLine();
                    boolean jogoExiste = false;

                    for (int i = 0; i < totalJogos; i++) {
                        if (jogos[i].equals(nomeJogo)) {
                            jogoExiste = true;
                        }
                    }

                    if (jogoExiste) {
                        System.out.println("Esse jogo já está cadastrado!");
                    } else {
                        jogos[totalJogos] = nomeJogo;
                        totalJogos++;
                        System.out.println("Jogo cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (totalJogos == 0) {
                        System.out.println("Nenhum jogo cadastrado.");
                    } else {
                        System.out.println("\n--- Lista de jogos ---");
                        for (int i = 0; i < totalJogos; i++) {
                            System.out.println((i + 1) + " - " + jogos[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do jogo que deseja atualizar: ");
                    String nomeAntigo = leia.nextLine();

                    int posEncontrada = -1;

                    for (int i = 0; i < totalJogos; i++) {
                        if (jogos[i].equals(nomeAntigo)) {
                            posEncontrada = i;
                        }
                    }

                    if (posEncontrada == -1) {
                        System.out.println("Jogo não encontrado!");
                    } else {
                        System.out.print("Digite o novo nome do jogo: ");
                        String nomeNovo = leia.nextLine();
                        jogos[posEncontrada] = nomeNovo;
                        System.out.println("Jogo atualizado com sucesso!");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do jogo que deseja remover: ");
                    String nomeRemover = leia.nextLine();

                    int posRemover = -1;

                    for (int i = 0; i < totalJogos; i++) {
                        if (jogos[i].equals(nomeRemover)) {
                            posRemover = i;
                        }
                    }

                    if (posRemover == -1) {
                        System.out.println("Jogo não encontrado!");
                    } else {
                        for (int i = posRemover; i < totalJogos - 1; i++) {
                            jogos[i] = jogos[i + 1];
                        }
                        totalJogos--;
                        System.out.println("Jogo removido com sucesso!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
    }
}