package lab03;

import java.util.Scanner;

public class Quatro {
    
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Informe o primeiro número da sua operação: ");
        var num1 = sc.nextDouble();
        System.out.print("Informe o segundo número da sua operação: ");
        var num2 = sc.nextDouble();
        
        
        System.out.println("Temos quatro operações: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha o número correspondente a operação que você quer: ");
        var opera = sc.nextInt();
        

        if (opera == 1){
            var res1 = (num1 + num2);
            System.out.println(num1 + " + " + num2 + " = " + res1);
        } else if (opera == 2){
            var res2 = (num1 - num2);
            System.out.println(num1 + " - " + num2 + " = " + res2);
        } else if (opera == 3){
            var res3 = (num1 * num2);
            System.out.println(num1 + " x " + num2 + " = " + res3);
        } else if (opera == 4){
            var res4 = (num1 / num2);
            System.out.println(num1 + " / " + num2 + " = " + res4);
        } else{
            System.out.println("Erro. Tente de novo!");
        }

    }
}