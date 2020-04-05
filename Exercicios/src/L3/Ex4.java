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
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        System.out.println("Informe o Nome do Cliente: ");
        String nome = x.next();
        
        Scanner y = new Scanner(System.in);
        System.out.println("Informe o Telefone: ");
        String tel = y.next();
        
        Scanner z = new Scanner(System.in);
        System.out.println("Informe o Endereço: ");
        String end = z.next();
        
        Scanner w = new Scanner(System.in);
        System.out.println("Informe o E-mail: ");
        String email = w.next();
        
        Scanner q = new Scanner(System.in);
        System.out.println("Informe o Salário: ");
        double salario = q.nextDouble();
        
        
        if (salario >= 985.47){
            System.out.println("***Cliente Apto ao Empréstimo***");
            
        }
        else{
            
            System.out.println("Cliente fora da margem!");
        }
    }
}
