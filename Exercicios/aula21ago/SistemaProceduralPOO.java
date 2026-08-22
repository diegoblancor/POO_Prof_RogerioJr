package Exercicios.aula21ago;

public class SistemaProceduralPOO {

    static class Aluno {
        String nome;
        double nota1, nota2;

        Aluno(String nome, double nota1, double nota2) {
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
        }
    }

    public static void main(String[] args) {
        Aluno[] alunos = {
                new Aluno("Ana", 8.5, 7.0),
                new Aluno("Bruno", 5.5, 6.0),
                new Aluno("Carla", 3.0, 4.5)
        };

        for (int i = 0; i < 3; i++) {
            double media = (alunos[i].nota1 + alunos[i].nota2) / 2;
            String situacao;

            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media > 5 && media < 7) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }

            System.out.printf("Aluno: | Media: | Situacao: ", alunos[i].nome, media, situacao);
        }
    }
}