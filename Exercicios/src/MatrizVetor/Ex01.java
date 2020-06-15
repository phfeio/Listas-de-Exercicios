/** ******************************************************************************
 * Dada uma seqüência de n números (vetor de inteiros), imprimi-la na ordem inversa que
 * foi realizada a leitura.
 ****************************************************************************** */
package MatrizVetor;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int num = entrada.nextInt();

        int[] Numeros = new int[num];

        for (int x = 0; x < num; x++) {
            System.out.print("Digite o " + (x + 1) + "° Número: ");
            Numeros[x] = entrada.nextInt();
        }

        System.out.println("Na ordem inversa, temos: ");

        for (int y = num - 1; y >= 0; y--) {
            System.out.print(Numeros[y] + "--");
        }

    }
}
