/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Phelipe Feio
 */
public class Ex2 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Você deverá cadastrar uma senha ALFANUMÉRICA");
        
        //Definição da senha
        Scanner x = new Scanner(System.in);
        System.out.println("Informe sua senha:");
        String senha = x.next();
        
        
        //Definir repetição da senha correta
        Scanner y = new Scanner(System.in);
        System.out.println("Informe a senha novamente: ");
        String ReptSenha = y.next();
        
         
        if (senha.equals(ReptSenha)  ){
            JOptionPane.showMessageDialog(null, "Senha CORRETA!");
            
            System.out.println("Informe o que deseja fazer: ");
            System.out.println("1 - Adição com dois valores");
            System.out.println("2 - Divisão com dois valores");
            System.out.println("3 - SAIR");
            
            Scanner entrada = new Scanner(System.in);
            System.out.print("Informe a opção: ");
            int EscolhaNum = entrada.nextInt();
            
            switch(EscolhaNum){
                case 1:
                    System.out.println("***ADIÇÃO***");
                    Scanner Entrada01 = new Scanner(System.in);
                    System.out.println("Informe o Primeiro Número:");
                    double N1 = Entrada01.nextDouble();
                    
                    Scanner Entrada02 = new Scanner(System.in);
                    System.out.println("Informe o Segundo Número:");
                    double N2 = Entrada02.nextDouble();
                    
                    double soma =N1+N2;
                    
                    System.out.println("A soma dos valores é igual: "+soma);
                    break;
                    
                case 2:
                    System.out.println("***DIVISÃO***");
                    Scanner Entrada03 = new Scanner(System.in);
                    System.out.println("Informe o Primeiro Número:");
                    double N3 = Entrada03.nextDouble();
                    
                    Scanner Entrada04 = new Scanner(System.in);
                    System.out.println("Informe o Segundo Número:");
                    double N4 = Entrada04.nextDouble();
                    
                    double divisao = N3/N4;
                    
                    System.out.println("O valor da divisão de valores é: "+divisao);
                    break;
                case 3:
                    System.exit(0);
                    default:
                        System.out.println("Número Inválido");
            }
        }
    
        else{
            JOptionPane.showMessageDialog(null, "As Senhas Não conferem! O programa será fechado!");
            System.exit(0);
        }
    }
}
