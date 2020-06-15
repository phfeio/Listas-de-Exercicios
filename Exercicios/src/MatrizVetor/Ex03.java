/** *****************************************************************************
 * Fazer um programa para ler uma quantidade N de alunos. Ler a nota de cada
 * um dos N alunos e calcular a média aritmética das notas. Contar quantos alunos
 * estão com a nota acima de 7.0. Obs.: Se nenhum aluno tirou nota acima de 5.0,
 * imprimir mensagem: Não há nenhum aluno com nota acima de 5.
 ****************************************************************************** */
package MatrizVetor;

/**
 *
 * @author Phelipe Feio
 */
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int NotasBoas = 0; //notas boas são consideradas quando a nota é maior que 7.
        boolean SalaFudida = true;//SalaF** quando ninguém tirou nota maior que 5.

        System.out.print("Digite a quantidade de alunos: ");
        int QuantidadeAlunos = entrada.nextInt();

        int[] notas = new int[QuantidadeAlunos];

        for (int x = 0; x < QuantidadeAlunos; x++) {
            System.out.print("Digite a nota do " + (x + 1) + "° Aluno: ");
            notas[x] = entrada.nextInt();

            if (notas[x] > 7) {
                NotasBoas++;
            }
            if (notas[x] > 5) {
                SalaFudida = false;
            }
        }

        if (SalaFudida == false) {
            System.out.println("Existem " + NotasBoas + " notas maiores que 7.");
        } else {
            System.out.println("Não há nenhum aluno com nota acima de 5.");
        }

    }
}
