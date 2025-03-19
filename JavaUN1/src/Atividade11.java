
/* Atividade 11
 * Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 * Variáveis: int [vi1, vi2], double [vd1]
 */
import java.util.Scanner;

public class Atividade11 {

    private static void LimpaTela() {
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Tela limpa!");
        }
    }
    
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String Args[]) {
        // Variáveis:
        int vi1, vi2, opcao;
        double vd1;

        Scanner scan = new Scanner(System.in);
        System.out.println("\nPrograma de calculos matemáticos\n");

        System.out.printf("Digite o primeiro número inteiro: ");
        vi1 = scan.nextInt();

        System.out.printf("Digite o segundo número inteiro: ");
        vi2 = scan.nextInt();

        System.out.printf("Digite o número real: ");
        vd1 = scan.nextDouble();

        System.out.printf("\nEscolha uma opção: \n");

        System.out.println("\t1. O produto do dobro do primeiro com metade do segundo: ");
        System.out.println("\t2. A soma do triplo do primeiro com o terceiro: ");
        System.out.println("\t3. O terceiro elevado ao cubo: ");
        System.out.println("\t0. Encerrar programa");

        opcao = scan.nextInt();
        do {
            LimpaTela();
            switch (opcao) {
                case 1 -> {
                    System.out.println(
                            "O produto do dobro do primeiro com metade do segundo é: " + ((vi1 * 2) * (vi2 / 2)));
                }

                case 2 -> {
                    System.out.println("A soma do triplo do primeiro com o terceiro é: " + ((vi1 * 3) + vd1));
                }

                case 3 -> {
                    System.out.println("O terceiro elevado ao cubo é: " + Math.pow(vd1, 3));
                }

                case 0 -> {
                    System.out.println("Encerrando o programa...");
                }

                default -> {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }

            
            if (opcao != 0) {
                System.out.println(" ");
                System.out.println("\t1. O produto do dobro do primeiro com metade do segundo: ");
                System.out.println("\t2. A soma do triplo do primeiro com o terceiro: ");
                System.out.println("\t3. O terceiro elevado ao cubo: ");
                System.out.println("\t0. Encerrar programa");
                opcao = scan.nextInt();
            }
        } while (opcao != 0);

        System.out.println("Até a proxima!");
        scan.close();
    }
}
