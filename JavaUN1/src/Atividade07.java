/* Atividade 07
 * Faça um Programa que calcule a área de um quadrado, em seguida
 * mostre o dobro desta área para o usuário.
 * Variáveis: Double [lado, area]
 */

import java.util.Scanner;

public class Atividade07{

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        double lado, area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculo da área de um quadrado");

        System.out.printf("\n\tDigite o valor do lado do quadrado: ");
        lado = scan.nextDouble();
        area = Math.pow(lado, 2);

        System.out.println("\tA área do quadrado é: " + area);
        System.out.println("\tO dobro da área é: " + (area * 2));
        scan.close();
    }

}