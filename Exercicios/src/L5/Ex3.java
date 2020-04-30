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

    int lado1, lado2, lado3;
    int opcao = 1;

    while (opcao == 1) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o lado 1:");
        lado1 = s.nextInt();
        System.out.println("------------------------------------------------");
        System.out.println("Entre com lado 2:");
        lado2 = s.nextInt();
        System.out.println("------------------------------------------------");
        System.out.println("Entre com lado 3:");
        lado3 = s.nextInt();
        System.out.println("------------------------------------------------");

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triangulo Equilatero");
            } else if ((lado1 == lado2) || (lado1 == lado3)) {
                System.out.println("Triangulo Isosceles");
            } else
                System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Não é um triangulo!");
        }
        System.out.println("------------------------------------------------");
        System.out.println("Deseja continuar? 1 = sim, 2 = não");
        opcao = s.nextInt();
        System.out.println("------------------------------------------------");
    }
    System.out.println("Tchau!");
   }
}


