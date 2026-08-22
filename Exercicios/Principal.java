package Exercicios;

public class Principal {

    static void main(){

        //criação dos objetos -- instanciar objetos
        Produto p1 = new Produto();
        p1.nome = "Teclado";
        p1.preco = 150;
        p1.qtd = 10;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 50;
        p2.qtd = 4;

        double valorTotal = p1.calcularTotal() + p2.calcularTotal();


    }

}

//Scanner leia = new Scanner(System.in); -- temos uma classe Scanner do tipo leia
//Random aleatorio = new aleatorio; -- temos uma classe Random do tipo aleatório.