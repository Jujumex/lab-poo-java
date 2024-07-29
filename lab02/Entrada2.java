package lab02;

public class Entrada2 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Entrada2.java 1 2
    public static void main(String args[]) {
        var num1 = Integer.parseInt(args[0]);
        var num2 = Integer.parseInt(args[1]);
        var soma = num1 + num2;
        System.out.println("A soma é " + soma );
    }
}
