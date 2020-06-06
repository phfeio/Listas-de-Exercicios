/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Qpoo;

/**
 *
 * @author Phelipe Feio
 */
public class TestaConta {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        
        
        conta.setTitular("Phelipe");
        
        conta.titular = "Titular da conta";
        conta.numero = 123456 ;
        conta.saldo = 450.25 ;
        conta.dataAbertura = "21/05/2020";
        
        conta.status();
        
    }
}
