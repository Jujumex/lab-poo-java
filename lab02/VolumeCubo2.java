import java.util.Scanner;

public class VolumeCubo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Informe a aresta de seu cubo: ");
        float ares = sc.nextInt();
        var vol = Math.pow(ares, 3);
        System.out.println("O volume do cubo é: " + vol + " u.v.");
        System.out.println("");

        System.out.print("Informe o raio de seu cilindro: ");
        float raio = sc.nextFloat();
        System.out.print("Informe a altura de seu cilindro: ");
        float altura = sc.nextFloat();
        var volu = Math.round(Math.PI * Math.pow(raio, 2) * altura);
        System.out.println("O volume do cilindro é: " + volu + " u.v.");
        System.out.println("");

        System.out.print("Informe o lado da base de sua pirâmide: ");
        float ladoB = sc.nextFloat();
        System.out.print("Informe a altura de sua pirâmide: ");
        float alt = sc.nextFloat();
        var volum = Math.round(Math.pow(ladoB, 2) * alt) / 3;
        System.out.println("O volume da pirâmide é: " + volum + " u.v.");
        System.out.println("");

    }

}