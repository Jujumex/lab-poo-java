package lab04;
import java.util.Scanner;

public class Maimen {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de números que você quer comparar: ");
        var quanum = sc.nextInt();
        System.out.print("Agora, informe um número: ");
        var numax = sc.nextDouble();
        var quamax = 1;

        for (int i = 1; i < quanum; i++) {
            System.out.print("Informe o próximo número: ");
            var num = sc.nextDouble();
                if (num > numax){
                    numax = num;
                    quamax = 1;
                }
                else if (num == numax){
                    quamax += 1;
                }
        }

        System.out.println("O maior número que você me forneceu foi " + numax );
        System.out.println("E ele foi lido " + quamax + " vez/vezes" );
    }
}