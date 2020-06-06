/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class TesteTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Instancie objetos
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Entre com os lados do Triangulo X");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("Entre com os lados do Triangulo Y");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        DecimalFormat df = new DecimalFormat("#,##.00");
        System.out.println("Área do X: " +df.format(areaX));
        System.out.println("Área do Y: " +df.format(areaY));

        if (areaX > areaY) {
            System.out.println("Área do Triangulo X é MAIOR");
        } else {
            System.out.println("Área do Triangulo Y é MAIOR");

        }

    }
}
