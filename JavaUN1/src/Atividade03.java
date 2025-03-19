/* Atividade 03
 * Faça um Programa que peça dois números e imprima a soma.
 * Variáveis: Int [valor1, valor2, soma]
 */
import java.util.Scanner;

public class Atividade03 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        Scanner scan = new Scanner(System.in);
        int valor1, valor2, soma;
        System.out.println("\nDigite dois valores inteiros");

        System.out.printf("\tDigite o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.printf("\tDigite o segundo valor: ");
        valor2 = scan.nextInt();

        soma = valor1 + valor2;
        System.out.println("\tA soma dos valores é: " + soma);
        scan.close();
    }
}
