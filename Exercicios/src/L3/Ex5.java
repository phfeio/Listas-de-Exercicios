/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

/**
 *
 * @author Phelipe Feio
 */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        
        Scanner nome = new Scanner(System.in);
        System.out.println("Nome do aluno:");
        String nomeAluno = nome.next();
        
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        double nota1 = entrada1.nextDouble();
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite sua segunda nota");
        double nota2 = entrada2.nextDouble();
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Digite sua terceira nota");
        double nota3 = entrada3.nextDouble();
        
        Scanner entrada4 = new Scanner(System.in);
        System.out.println("Digite sua terceira nota");
        double nota4 = entrada4.nextDouble();
        
        System.out.println("Nome: "+nomeAluno);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.println("Nota 4: "+nota4);
    }
}
