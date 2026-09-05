package Exercicios.aula4set;

public class Colaborador {

    private int id;
    private String nome;
    private double salario;

    public Colaborador(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario = salario + (salario * (percentual / 100.0));
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Colaborador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void mostrarDados() {
        System.out.println(id + ", " + nome + ", " + salario);
    }

}
