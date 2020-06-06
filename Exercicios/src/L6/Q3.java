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
public class Q3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int num1 = x.nextInt();
        
        Scanner y = new Scanner(System.in);
        System.out.println("Digite o segundo valor");
        int num2 = y.nextInt();
        
        int soma = num1 + num2 ;
        
        System.out.println("Soma dos valores: "+soma);       
        
    }
}
