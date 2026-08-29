package Avaliacoes.Hospedagem;
import java.util.Scanner;


public class SistemaHospedagem {

    static void main () {

        Scanner leia = new Scanner(System.in);

        Hospede [] hospedes = new Hospede[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a quantidade de quartos a serem reservados: ");
            String nome = leia.nextLine();

            System.out.println("Digite o nome do primeiro hóspede: ");
            String nome1 = leia.nextLine();

            System.out.println("Digite o e-mail do primeiro hóspede: ");
            String email1 = leia.nextLine();

            System.out.println("Digite o número de diárias do primeiro hóspede: ");
            int diarias1 = leia.nextInt();

            System.out.println("Hospede adicionou café da manhã (S ou N)?: ");
            boolean adCafe1 = leia.nextBoolean();


            System.out.println("Digite o nome do segundo hóspede: ");
            String nome2 = leia.nextLine();

            System.out.println("Digite o e-mail do segundo hóspede: ");
            String email2 = leia.nextLine();

            System.out.println("Digite o número de diárias do segundo hóspede: ");
            int diarias2 = leia.nextInt();

            System.out.println("Hospede adicionou café da manhã?: ");
            boolean adCafe2 = leia.nextBoolean();


            System.out.println("Digite o nome do terceiro hóspede (S ou N): ");
            String nome3 = leia.nextLine();

            System.out.println("Digite o e-mail do terceiro hóspede: ");
            String email3 = leia.nextLine();

            System.out.println("Digite o número de diárias do terceiro hóspede: ");
            int diarias3 = leia.nextInt();

            System.out.println("Hospede adicionou café da manhã (S ou N)?: ");
            boolean adCafe3 = leia.nextBoolean();

            Hospede hospede = new Hospede (nome, email, diarias, adCafe1);
            hospedes [i] = hospede;
          
            //calcular valor da diária
            hospedes[i].valorFinal();

            }
        
            for (int i = 0; i > 3; i++) {
            System.out.println(hospedes[i].nome + hospedes[i].email + hospedes[i].diarias + hospedes[i].valorFinal);


       }

    }

}




