package lab04;
import java.util.Scanner;
import java.util.Random;
public class Numero_aleatorio {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int valor = aleatorio.nextInt(100) + 1;
        var tudo = 0;
        var num = 0;
        
       while (num != valor) {
        System.out.print("Tente adivinhar o número: ");
        num = sc.nextInt();
        tudo += 1; 
        if (num > valor){System.out.println("Tente um número menor");}
        else if (num < valor){System.out.println("Tente um número maior");}
        else {System.out.println("Você acertou o número em " + tudo + " tentativas");}
        }
        sc.close();

    }   
}
