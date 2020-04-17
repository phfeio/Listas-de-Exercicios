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
public class TesteConta {
    public static void main(String[] args) {
        //Instanciar objeto
        ContaBanco clienteA = new ContaBanco();
        //Setar valores (SET) Primeira Conta
        clienteA.setNumConta(11111);
        clienteA.setDono("Tio Patinhas");
        //Realizar abertura de conta CC/CP
        clienteA.abrirConta("CC");
        clienteA.depositar(150);
        clienteA.pagarMensalidade();
        clienteA.sacar(180);
        clienteA.sacar(100);
        clienteA.fecharConta();
        //Chamada de método
        clienteA.estadoAtual();
        
        System.out.println("");
        
        //Segunda conta
        ContaBanco clienteB = new ContaBanco();
        //Setar valores (SET) Segunda Conta
        clienteB.setNumConta(22222);
        clienteB.setDono("Riquinho");
        //Realizar abertura de conta CC/CP
        clienteB.abrirConta("CP");
        clienteB.depositar(500);
        clienteB.pagarMensalidade();
        clienteB.sacar(5);
        clienteB.sacar(500);
        clienteB.fecharConta();
        //Chamada de método
        clienteB.estadoAtual();
        
        
    }
}
