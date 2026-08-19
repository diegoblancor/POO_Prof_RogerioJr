package Exemplos;
import java.util.Random;
import java.util.Scanner;

public class jogoForca {
    static void main(){
        String [] listaPalavras = {"JAVA","COMPUTADOR","MONITOR","PYTHON", "DADOS"};
        
        Random aleatorio = new Random();
        int indice = aleatorio.nextInt(0, listaPalavras.length);
        String palavraAdivinhar = listaPalavras[indice];
        int maxTentativas = listaPalavras.length;
        int tentativas = 0;

        Scanner leia = new Scanner(System.in);






        StringBuilder palavra = new StringBuilder("----") ;

        while (tentativas < maxTentativas) {

            System.out.println("Palavra: " + palavra);
            System.out.println("Digite uma letra: ");
            char letra = leia.nextLine().toUpperCase().charAt(0);

            boolean letraAdivinhada = false;

            for (int i = 0; i < palavraAdivinhar.length(); i++){
                if (letra == palavraAdivinhar.charAt(i)) {
                    palavra.setCharAt(i, letra);
                    letraAdivinhada = true;
                }
            }

            if (!letraAdivinhada) {
                tentativas++;
                System.out.println("Letra incorreta!");
                System.out.println("Tentativas restantes: " + (maxTentativas - tentativas));
                break;
            }

            if (palavraAdivinhar.contentEquals(palavra)){
                System.out.println();


            }





        }







    }



    
}
