import java.util.Scanner;

public class vetorJogos {    
    static void main() {

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite 1 para CADASTRAR um jogo");
    System.out.println("Digite 2 para LISTAR os jogos");
    System.out.println("Digite 3 para ATUALIZAR um jogo");
    System.out.println("Digite 4 para REMOVER um jogo");
    System.out.println("Digite 5 para SAIR");

    int opcao = leia.nextInt();
    switch (opcao) {
        case 1:
            System.out.println ("Cadastrar jogo");
            break;
        case 2:
            System.out.println ("Listar jogos");
            break;
        case 3:
            System.out.println ("Atualizar jogo");
            break;  
        case 4:
            System.out.println ("Remover jogo");
            break;
        case 5:
            System.out.println ("Sair");
            break;    
        default:
            System.out.println("Opcao invalida! Tente novamente.");
        return;
    
        }

    }

}


    
