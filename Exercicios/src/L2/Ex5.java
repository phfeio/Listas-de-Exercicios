/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2;

/**
 *
 * @author Phelipe Feio
 */
public class Ex5 {
    public static void main (String []args){
        
        double salario = 980.00;
        double cCredito = 38.00;
        double aluguel = 450.00;
        double veiculo = 400.00;
        double saldo = salario-cCredito-aluguel-veiculo ;
        
        System.out.println("*Salário: "+salario);
        System.out.println("Gastos:");
        System.out.println("*Cartão de Crédito: "+cCredito);
        System.out.println("*Aluguel: "+aluguel);
        System.out.println("*Veículo: "+veiculo);
        System.out.println("*Saldo Final: "+saldo);
        
        
    }
}
