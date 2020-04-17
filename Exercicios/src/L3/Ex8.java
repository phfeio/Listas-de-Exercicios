/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex8 {
    public static void main(String[] args) {
        
        Scanner entradaA = new Scanner(System.in);
        System.out.println("Informe uma temperatura em Graus Celsius");
        float c = entradaA.nextFloat();
        
        float f = (9*c+160)/5;
        
        System.out.println("Fórmula de Conversão: f = (9*C+160)/5");
        //DecimalFormat fmt = new DecimalFormat("#.##.0");
        System.out.println("Temperatura em Fahrenheit: " +f);
        
    }
}
