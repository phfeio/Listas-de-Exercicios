/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2;
import javax.swing.JOptionPane;
/**
 *
 * @author Phelipe Feio
 */
public class Ex4 {
    public static void main (String [] args){
        
        double n1;
        double n2;
        double media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
        
        media=(n1+n2)/2;        
        
        
        if(media>=6){
            JOptionPane.showMessageDialog(null,"Aluno APROVADO!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Aluno REPROVADO!");
        }
    }
}
