package lab03;

import java.util.Scanner;

public class Nota {
    
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        System.out.print("Digite o conceito: ");
        var nota = sc.next();
        switch (nota) {
            case "A" -> System.out.println("Logo, sua nota é que vale a 100");
            case "B" -> System.out.println("Logo, sua nota é que vale a 90");
            case "C" -> System.out.println("Logo, sua nota é que vale a 80");
            case "D" -> System.out.println("Logo, sua nota é que vale a 70");
            case "E" -> System.out.println("Logo, sua nota é que vale a 60");
        }
        sc.close();
    }
}