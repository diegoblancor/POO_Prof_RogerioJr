package Exercicios.aula21ago;

public class SistemaProcedural {

    public static void main(String[] args) {

        String[] nomes = {"Ana", "Bruno", "Carla"};
        double[] notas1 = {8.5, 5.5, 3.0};
        double[] notas2 = {7.0, 6.0, 4.5};
    }
        static double calcularMedia(double nota1, double nota2) {
            return (nota1 + nota2) / 2;
        }

        public static String verificarSituacao(double media) {
            if (media >= 7) {
                return "Aprovado";
            } else if (media > 5 && media < 7) {
                return "Recuperação";
            } else {
                return "Reprovado";
            }
        

            for (int i = 0; i < 3; i++) {
                double[] notas1;
                double[] notas2;
                double media = calcularMedia(notas1[i], notas2[i]);
                String situacao = verificarSituacao(media);

                Object[] nomes;
                System.out.printf("Aluno: | Media: | Situacao: ", nomes[i], media, situacao);
            }
        }
    }




