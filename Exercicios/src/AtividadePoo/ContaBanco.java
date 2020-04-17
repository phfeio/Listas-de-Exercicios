/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadePoo;

/**
 *
 * @author Phelipe Feio
 */
public class ContaBanco {
    //Declaração de atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos, Métodos especiais e Construtor
    
    public void estadoAtual(){
        System.out.println("xxxxxxxxxxxxxxxxxxx");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Titular: "+this.getDono());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC") {
            
            this.setSaldo(150);
            
        } else if (t == "CP"){
            
            this.setSaldo(50);
            
        }
        System.out.println("Conta Aberta com SUCESSO!");
    }
    
    public void fecharConta(){
        
        if (this.getSaldo()>0) {
            
            System.out.println("Conta com R$"+this.getSaldo()
                    +" não pode ser ENCERRADA.");
            
            
        } else if (this.getSaldo()<0) {
            
            System.out.println("Conta com débito de: "+this.getSaldo());
                        
        }
        else{
            this.setStatus(false);
            System.out.println("Conta sem Pendências e ENCERRADA com Sucesso");
        }
        
    }
    
    public void depositar(float v){
                
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado para "+this.getDono());
        
        } else {
            System.out.println("Depósito não realizado");
        }
    }
    
    public void sacar(float v){
        
        if (this.getStatus()) {
            
            if (this.getSaldo() >= v ) {
                
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Saque realizado na conta de "+this.getDono()+
                        " saldo atual da conta R$"+this.getSaldo());
                
            } else {
                System.out.println("Saldo insuficiente para SAQUE!");
                }
            
            
        } else {
            System.out.println("Conta não ativa");
            
        }
        
        
    }
    
    public void pagarMensalidade(){
        int v = 0;
        
        if (this.getTipo() == "CC") {
            v=20;
            
        } else if (this.getTipo()== "CP"){
            v = 45;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade PAGA com SUCESSO, saldo atual R$"
                    +getSaldo());
        } else {
            System.out.println("Impossível fazer pagamento, conta FECHADA!");
            
        }
        
    }
    
    //Construtor da classe
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
