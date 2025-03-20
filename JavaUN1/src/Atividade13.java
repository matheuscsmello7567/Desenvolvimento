/* Atividade 13
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal
 * utilizando as seguintes fórmulas:
 * . Para homens: (72.7*h) - 58
 * a. Para mulheres: (62.1*h) - 44.7 (h = altura)
 * b. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso.
 * Variáveis: double[peso, altura];
 */
import java.util.Scanner;

public class Atividade13 {

    public static void calculaPesoMasc(double height){
        double peso;
        peso = (72.7 * height) - 58;
        System.out.printf("O seu peso ideal é: %.1f", peso);
    }

    public static void calculaPesoFem(double height){
        double peso;
        peso = (62.1 * height) - 44.7;
        System.out.printf("O seu peso ideal é: %.1f", peso);
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String[] Args){
        double altura;
        int opcao;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calculo de peso ideal");
        System.out.printf("\n\tDigite a sua altura: ");
        altura = scan.nextDouble();

        System.out.printf("\tEscolha o seu gênero: ");
        System.out.println("\n\t1. Masculino ");
        System.out.println("\t2. Feminino ");

        opcao = scan.nextInt();
        switch (opcao){
            case 1 -> {
                calculaPesoMasc(altura);
            }
            case 2 -> {
                calculaPesoFem(altura);
            }
        }

        scan.close();
    }

}
