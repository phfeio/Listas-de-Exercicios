/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L6;

/**
 *
 * @author Phelipe Feio
 */
public class TestaQ1 {
    public static void main(String[] args) {
        //Instanciar objetos
        Cliente c1 = new Cliente();
        c1.nome = "Phelipe Luiz Dias Feio";
        c1.codigo = 10203040;
        //c1.statusCliente();
        
        System.out.println("******");
        
        Cliente c2 = new Cliente();
        c2.nome = "Phelipe C2";
        c2.codigo = 505050 ;
        //c2.statusCliente();
        
        Ccredito cred1 = new Ccredito();
        cred1.num = 123456 ;
        cred1.data = "28/05/2020";
        cred1.statusCredito();
        
        Ccredito cred2 = new Ccredito();
        cred2.num = 78910;
        cred2.data = "28/05/2020";
        cred2.statusCredito();
        
        
    }
}
