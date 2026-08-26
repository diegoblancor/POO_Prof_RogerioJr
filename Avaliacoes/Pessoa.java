package Avaliacoes;

public class Pessoa {

    String nome;
    double altura;
    double idade;
    double peso;
    double IMC;
    String situacao;

    public Pessoa (String nome, double altura, double idade, double peso){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;

    public void calcularIMC() {
        this.IMC = peso / (altura * altura);
        }

    public void obterMaioridade() {

        if (idade >= 18) {
            situacao = "É MAIOR de idade.";
        } else {
            situacao = "É MENOR de idade.";
        }

        }

    }

}
//Sequência correta para criar um código: classe; construtor; método; toString.

