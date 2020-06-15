/*
* Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura.
* Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma
* pessoa. Crie um método para calcular a idade da pessoa.
 */
package AtividadeExtra;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Q4 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        p1.setNome("Phelipe");
        p1.setDataNascimento(27);
        p1.setAltura(1.74);
        p1.imprimirDados();
        System.out.println("*************");

        System.out.println("Informe seu ano de nascimento");
        p1.anoNascimento = x.nextInt();
        System.out.println("Informe o ano atual");
        p1.anoAtual = x.nextInt();

        p1.calculaIdade();
    }
}
