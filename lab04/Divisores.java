package lab04;
import java.util.Scanner;

public class Divisores {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        var num1 = sc.nextDouble();
        var quant = 0;

        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0){
                quant += 1;
            }
        }

        System.out.println("A quantidade de divisores de " + num1 + " é " + quant );

    }
}