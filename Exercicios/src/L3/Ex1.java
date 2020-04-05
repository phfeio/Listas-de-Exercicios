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
public class Ex1 {
    public static void main(String[] args) {
        
        Scanner Nascimento = new Scanner (System.in);
        System.out.println("Informe seu ano de nascimento: ");
        int ano = Nascimento.nextInt();
        
        int idade = 2020 - ano;
        
        System.out.println("Sua idade é: "+idade);
                
        
    }
}
