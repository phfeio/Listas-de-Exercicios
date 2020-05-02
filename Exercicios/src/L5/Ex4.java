/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe a sua Idade: ");
        int idade = entrada.nextInt();
        
        if (idade >= 18 && idade <=70) {
            System.out.println("Seu Voto é Obrigatório");
            
        } else if (idade == 16 || idade == 17 || idade > 70) {
            System.out.println("Seu Voto é facultativo");
        }
        else if (idade <= 16){
            System.out.println("Usuário NÃO deve votar!");
            
        }
        else{
            System.out.println("Idade fora da faixa de votação");
        }
    }
}
