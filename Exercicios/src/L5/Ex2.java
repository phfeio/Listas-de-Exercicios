/*
Desenvolva um programa de JAVA que calcule e apresente 
o valor do volume de uma lata de óleo, utilizando a 
fórmula V = 3,14159 * raio² * altura²   
 */
package L5;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex2 {
    public static void main(String[] args) {
        
        double v=3.14159;
        double volume;
        
        Scanner entradaRaio = new Scanner(System.in);
        System.out.println("Informe o Raio da lata: ");
        double raio = entradaRaio.nextDouble();
        
        Scanner entradaAltura = new Scanner(System.in);
        System.out.println("Infome a altura: ");
        double altura = entradaAltura.nextDouble();
        
        volume = v* (raio*2)*(altura*2);
        
        System.out.println("O volume da lata será: "+volume);
    }
}
