package Exercicios.aula4set;
import java.util.Scanner;

public class PrincipalColaborador {

    static void main() {

        Scanner leia = new Scanner(System.in);

        Colaborador[] colab = new Colaborador[n];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o id do colaborador: ");
            int id = leia.nextInt();

            System.out.println("Digite o nome do colaborador: ");
            String nome = leia.nextLine();

            System.out.println("Digite o salário do colaborador: ");
            double salario = leia.nextDouble();

            leia.nextLine();

            Colaborador colab = new Colaborador(id, nome, salario);
            colab[i] = colab;

            // Calcular média
            alunos[i].calcularMedia();

            // Calcular Situação
            alunos[i].obterSituacao();

            System.out.println("Aluno cadastrado com sucesso!");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(alunos[i].nome + " Média:  "
                    + alunos[i].media + " Situação: "
                    + alunos[i].situacao);
        }
    }
