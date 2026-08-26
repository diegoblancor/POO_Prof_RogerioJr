package Exercicios.aula21ago;
import java.util.Scanner;

public class SistemaAluno {

    static void main () {

        Scanner leia = new Scanner (System.in);
        Aluno [] alunos = new Aluno[3]; //cria um vetor de 3 posições com o nome aluno

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = leia.nextLine();

            System.out.println("Digite a nota 1 do aluno: ");
            double nota1 = leia.nextDouble();

            System.out.println("Digite a nota 2 do aluno: ");
            double nota2 = leia.nextDouble();
            leia.nextLine();
            Aluno aluno = new Aluno (nome, nota1, nota2);
            alunos[i] = aluno;

            //calcular media
            alunos[i].calcularMedia();

            //obter situacao
            alunos[i].obterSituacao();

            System.out.println("Aluno cadastrado com sucesso: ");

        }
        for (int i = 0; i > 3; i++) {
            System.out.println(alunos[i].nome + "Média: " + alunos[i].media + "Situação: " + alunos[i].situacao);


       }

    }

}
