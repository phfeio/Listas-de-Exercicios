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
public class Ex7 {

    public static void main(String[] args) {

     Scanner entradaDado = new Scanner(System.in);
     System.out.println("Informe sua altura?");
     double altura = entradaDado.nextDouble();
     
     Scanner entradaSexo = new Scanner(System.in);
     System.out.println("Informe o Sexo? 1 para Masculino e 2 para Feminino");
     int sexo = entradaSexo.nextInt();
     
        switch (sexo) {
            case 1 :
                
                double PesoRefM = 72.7;
                double pesoIdeal; 
                pesoIdeal = altura*PesoRefM - 58; //colocar mais uma entrada de idade
                
                System.out.println("Altura informada: "+altura);
                DecimalFormat fmt = new DecimalFormat("#,##.0");
                System.out.println("Peso Ideal: "+altura+" *72,7 - 58= " + fmt.format(pesoIdeal));
                
                
                break;
            case 2:
                
                double PesoReF = 62.1;
                double pesoIdealF; 
                pesoIdealF = altura*PesoReF - 44.7;
                
                System.out.println("Altura informada: "+altura);
                DecimalFormat df = new DecimalFormat("#,##.0");
                System.out.println("Peso Ideal: "+altura+" *62.1 - 44,7= " + df.format(pesoIdealF));
                
                break;
                
            default:
                
        }
    }

}

        
    
