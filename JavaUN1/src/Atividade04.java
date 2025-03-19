/* Atividade 04
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 * variáveis: Double [nota1, nota2, nota3, nota4, media]
 */

import java.util.Scanner;

public class Atividade04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        System.out.println("Digite 4 notas para calcular a média");

        System.out.printf("\n\tDigite a primeira nota: ");
        nota1 = scan.nextDouble();

        System.out.printf("\tDigite a segunda nota: ");
        nota2 = scan.nextDouble();

        System.out.printf("\tDigite a terceira nota: ");
        nota3 = scan.nextDouble();

        System.out.printf("\tDigite a quarta nota: ");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("\n\tA média das notas é: " + media);
        
        scan.close();
    }
}
