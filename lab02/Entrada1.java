package lab02;
public class Entrada1 {
    // Não execute no 'Run'. Execute no Terminal
    // java 02-argumentos/Argumentos1.java romulo
    public static void main(String[] args) {
        var numero0 = Integer.parseInt(args[0]);
        var numero1 = Integer.parseInt(args[1]);
        var soma = numero0 + numero1;

        System.out.println("A soma é " + soma);
    }
}
