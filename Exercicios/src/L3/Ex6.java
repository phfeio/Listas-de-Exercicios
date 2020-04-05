/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Phelipe Feio
 */
public class Ex6 {
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        float cotacao = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor atual do dólar"));
        float valorDolar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite um valor em DÓLAR"));
              
        float valorReal = cotacao * valorDolar;
       
        JOptionPane.showMessageDialog(null,"Valor em R$ = " + df.format(valorReal));
       
       
    }
}  
        
    
