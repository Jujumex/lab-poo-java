package lab04;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        var num1 = sc.nextInt();
        System.out.print("Agora, informe um segundo número também inteiro: ");
        var num2 = sc.nextInt();
        var soma = 0;

        for (int i = num1; i <= num2; i++) {
            soma += i;
        }

        System.out.println("A soma dos números positivos entre os números que você forneceu (incluindo os próprios números) foi:  " + soma );

    }
}