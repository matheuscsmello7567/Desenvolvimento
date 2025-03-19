/* Atividade 12
 * Tendo como dados de entrada a altura de uma pessoa, construa um
 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
 * (72.7 * altura) - 58
 * Variáveis: double [peso, altura]; 
 */
import java.util.Scanner;

public class Atividade12 {

    public static void calculaPesoMasc(double height){
        double peso;
        peso = (72.7 * height) - 58;        
        System.out.printf("O seu peso ideal é: %.1f", peso);
    }
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String Args[]){
        double height;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calcule o seu peso ideal!");
        System.out.printf("\n\tDigite a sua altura: ");

        height = scan.nextDouble();
        calculaPesoMasc(height);

        scan.close();
    }
}


