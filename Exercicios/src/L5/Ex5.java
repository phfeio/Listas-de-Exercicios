/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do salário mínimo");
        double salario = entrada.nextDouble();
        
        System.out.println("Informe o seu Salário");
        double salarioUsuario = entrada.nextDouble();
        
        double qtdadeSalario;
        qtdadeSalario = salarioUsuario/salario;
        
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Quantidade de Salário Mínimos: "+df.format(qtdadeSalario));
        
        
        
        
    }
}
