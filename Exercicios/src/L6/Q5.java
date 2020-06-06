/*
 * Desenvolver um programa para ler as medidas dos lados de dois triângulos X e Y. 
 *Em seguida, mostrar valor
 *das áreas dos dois triângulos e dizer qual dos triângulos possui maior área. 
 *A fórmula para calcular a área do
 *triângulo a partir das medidas de seus lados a,b e c é a seguinte
 */
package L6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Q5 {

    public static void main(String[] args) {
        //entrada de dados
        double p, areaX, areaY;
        
        Scanner entrada = new Scanner(System.in);

        //Triangulo 1
        System.out.println("Informe o L1 do X");
        double Xa = entrada.nextDouble();
        System.out.println("Informe o L2 do X");
        double Xb = entrada.nextDouble();
        System.out.println("Informe o L3 do X");
        double Xc = entrada.nextDouble();
        
        //Triangulo 2
        System.out.println("Informe o L1 do Y");
        double Ya = entrada.nextDouble();
        System.out.println("Informe o L2 do Y");
        double Yb = entrada.nextDouble();
        System.out.println("Informe o L3 do Y");
        double Yc = entrada.nextDouble();

        //Área X
        p = (Xa + Xb + Xc) / 2.0;
        areaX = Math.sqrt(p * (p - Xa) * (p - Xb) * (p - Xc)); //Fórmula para raiz quadrada
        
        //Área Y
        p = (Ya + Yb + Yc) / 2.0;
        areaY = Math.sqrt(p * (p - Ya) * (p - Yb) * (p - Yc)); //Fórmula para raiz quadrada

        DecimalFormat df = new DecimalFormat("#,##.00");
        System.out.println("Área do Triangulo X: " + df.format(areaX));
        System.out.println("Área do Triangulo Y: " + df.format(areaY));

        if (areaX > areaY) {
            System.out.println("Triangulo X possui a maior área");

        } else {
            System.out.println("Triangulo Y possui a maior área");
        }
        entrada.close();
    }
}
