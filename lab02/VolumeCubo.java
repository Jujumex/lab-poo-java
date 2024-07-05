package lab02;

public class VolumeCubo {

    public static void main(String[] args) {
        var lado = Float.parseFloat(args[0]);
        var volume = Math.pow(lado, 3);

        System.out.println("O volume do cubo é: " + volume);
    }
}