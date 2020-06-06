/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Q4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor? ");
        int valor = entrada.nextInt();

        if (valor>0 && valor<=100) {
            System.out.println("Valor: "+valor);
            System.out.println("Valor "+valor+" está dentro do range");
        } else {
            System.out.println("O Valor "+valor+" está fora do range");
        }

    }

}
