/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

import java.text.ChoiceFormat;
import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex7 {
    public static void main(String[] args) {
        
        //h = altura
        
        System.out.println("1 - Para Homem");
        System.out.println("2 - Para Mulher");
        System.out.println("3 - Sair");
        
        Scanner sw = new Scanner(System.in);
        System.out.println("Informe um número");
        int opcao = sw.nextInt();
        
        switch (opcao){
            case 1:
                Scanner altura = new Scanner(System.in);
                System.out.println("Informe sua altura");
                double Hm = altura.nextDouble();
                
                double PesoH = 72.7*Hm;
                
                System.out.println("Seu peso ideal é: "+PesoH);
                break;
                
            case 2:
                Scanner alturaMlh = new Scanner(System.in);
                System.out.println("Informe sua altura");
                double Hml = alturaMlh.nextDouble();
                
                double PesoM = 62.1*Hml;
                
                System.out.println("Seu peso ideal é: "+PesoM);
                break;
            
            case 3:
                    System.exit(0);
                           
                default:
                    System.out.println("Número invalido");
                    
        }
            
        
        
        
        Scanner altura = new Scanner(System.in);
        System.out.println("Informe sua Altura");
        double h = altura.nextDouble();
        
        
        
        
        
        
    }
}
