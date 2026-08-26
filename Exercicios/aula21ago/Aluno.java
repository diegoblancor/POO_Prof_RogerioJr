package Exercicios.aula21ago;

public class Aluno {

        String nome;
        double nota1;
        double nota2;
        double media;
        String situacao;

        public Aluno (String nome, double nota1, double nota2) {
            this.nome = nome;
            this.nota1= nota1;
            this.nota2= nota2;
        }

        public void obterSituacao () {
            this.media = (nota1 + nota2) / 2;
        }

        public void calcularMedia () {
            this.media = (nota1 + nota2) / 2;

            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media >= 3 && media < 7) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }


        }


    }

