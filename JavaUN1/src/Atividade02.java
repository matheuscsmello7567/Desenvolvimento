/* Atividade 02
 * Faça um Programa que peça um número e então mostre a
 * mensagem O número informado foi [número].
 * variáveis: Int [numero]
 */

import java.util.Scanner;

public class Atividade02 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        int numero;
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Informe um número inteiro");
        System.out.printf("\tDigite um número: ");

        numero = scan.nextInt();
        System.out.println("\n\tO número informado é: " + numero);
        
        scan.close();
    }
}
