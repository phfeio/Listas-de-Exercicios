/*
 Dados três valores X, Y e Z, verificar se eles podem ser os comprimentos 
 dos lados de um triângulo, e se forem, verificar se é 
 um triângulo equilátero, isóscele ou escaleno. 
 Se eles não formarem um triângulo, escrever uma mensagem. 
 Antes da elaboração do algoritmo, torna-se necessário a 
 revisão de algumas propriedades e definições. 
 Propriedade – o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados. 
 Definição 1 - chama-se de triângulo equilátero o que tem os comprimentos dos três lados iguais; 
 Definição 2 - chama-se de triângulo isóscele o triângulo que tem os comprimentos de dois lados iguais; 
 Definição 3 - chama-se triângulo escaleno o triângulo que tem os comprimentos dos três lados diferentes.

 */
package L5;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex3 {

    public static void main(String[] args) {

        int opcao = 1;

        while (opcao == 1) {

            Scanner s = new Scanner(System.in);

            System.out.println("Informe o L1:");
            int lado1 = s.nextInt();
            System.out.println("Informe o L2:");
            int lado2 = s.nextInt();
            System.out.println("Informe o L3:");
            int lado3 = s.nextInt();

            if (lado1 == 0 || lado2 == 0 || lado3 == 0) {
                System.out.println("Não é um triângulo");
                //System.exit(0);

            } else if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triangulo Equilatero, possui os 3 Lados Iguais");

            } else if ((lado1 == lado2) || (lado1 == lado3)) {
                System.out.println("Triangulo Isosceles, possui os 2 Lados Iguais");
            } else if (lado1 != lado2 || lado2 != lado3 || lado3 != lado1) {
                System.out.println("Triângulo Escaleno, possui os 3 Lados Diferentes");
            }

            System.out.println("------------------------------------------------");

            System.out.println("Deseja continuar? 1 = Sim, 2 = Não");
            opcao = s.nextInt();
            System.out.println("------------------------------------------------");
        }
        System.out.println("Fim de Execução da Questão");
    }
}
