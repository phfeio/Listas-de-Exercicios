/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex3 {
    public static void main(String[] args) {
                //Escolha
                System.out.println("Escolha a sua operação: ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Divisão");
                System.out.println("4 - Multiplicação");
                System.out.println("5 - Sair");
                
                Scanner entrada = new Scanner(System.in);
                System.out.println("Entre com um número entre 1 e 5:");
                int num = entrada.nextInt();
       
                //Sw Case
                switch (num) {
                 case 1:
                   System.out.println("Você escolheu a opção 1 Soma");
                   
                   Scanner ns1 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   double snumero1 = ns1.nextDouble();
                   
                   Scanner ns2 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   double snumero2 = ns2.nextDouble();
                   
                   double soma = snumero1 + snumero2;
                   
                   System.out.println("O resultado da soma é: " +soma);
                   break;
                   
                 case 2:
                   System.out.println("Você escolheu a opção 2 Subtração");
                   
                   Scanner nsub1 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   int subNum1 = nsub1.nextInt();
                   
                   Scanner nsub2 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   int subNum2 = nsub2.nextInt();
                   
                   int subtracao = subNum1 + subNum2;
                   
                   System.out.println("O resultado da Subtração é: " +subtracao);
                   break;
                 case 3:
                   System.out.println("Você escolheu a opção 3 Divisão");
                   
                   Scanner div1 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   double divNum1 = div1.nextDouble();
                   
                   Scanner div2 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   double divNum2 = div2.nextDouble();
                   
                   double div = divNum1 / divNum2;
                   
                   System.out.println("O resultado da Divisão é: " +div);
                   break;
                 case 4:
                   System.out.println("Você escolheu a opção 4 Multiplicação");
                   
                   Scanner m1 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   int mult1 = m1.nextInt();
                   
                   Scanner m2 = new Scanner (System.in);
                   System.out.println("Entre com um número: ");
                   int mult2 = m2.nextInt();
                   
                   int multiplicacao = mult1 * mult1;
                   break;
                 case 5:
                 System.exit(0);
                 default:
                   System.out.println("Número inválido"); 
                }  
  }
}
