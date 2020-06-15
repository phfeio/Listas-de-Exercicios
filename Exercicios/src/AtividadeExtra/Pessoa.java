/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeExtra;

import java.util.Scanner;

/**
 *
 * @author Phelipe Feio
 */
public class Pessoa {

    private String nome;
    private int DataNascimento;
    private double altura;
    
     int anoNascimento = 0;
     int anoAtual = 0;

    void imprimirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Altura: " + getAltura());
    }

    public int calculaIdade() {
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: "+idade);
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(int DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
