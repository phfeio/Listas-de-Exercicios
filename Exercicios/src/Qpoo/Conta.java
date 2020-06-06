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
public class Conta {
    
    String titular;
    int numero;
    double saldo;
    String dataAbertura;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    public void status(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
        System.out.println("Data: "+this.dataAbertura);
    }
    
    
    public void sacar(){
        
    }
    
    public void depositar(){
        
    }
    
    public  void consultarSaldo(){
        
    }
}
