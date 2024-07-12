package lab02;

public class VolumeCubo {

    public static void main(String[] args) {
        var ares = Float.parseFloat(args[0]);
        if (ares <= 0) {
            System.out.println("Não posso calcular seu volume");
            System.out.println("");
        } 
        else {
            var vol = Math.pow(ares, 3);
            System.out.println("O volume do cubo é: " + vol);
        }

        var raio = Float.parseFloat(args[1]);
        var altura = Float.parseFloat(args[2]);

        if (raio > 0 && altura > 0) {
            var volu = Math.round(Math.PI * Math.pow(raio, 2) * altura);
            System.out.println("O volume do cilindro é: " + volu);
        }
        else {
            System.out.println("Não posso calcular seu volume");
            System.out.println("");
        }

        var ladoB = Float.parseFloat(args[3]);
        var alt = Float.parseFloat(args[4]);
        var volum = Math.round(Math.pow(ladoB, 2) * alt) / 3;

        System.out.println("O volume da pirâmide é: " + volum);
        
    }
}