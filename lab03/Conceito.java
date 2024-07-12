package lab03;

import java.util.Scanner;

public class Conceito {

    public static void main(String[] args){
        var sc = new Scanner(System.in);
        System.out.print("Digite sua nota: ");
        var nota = sc.nextFloat();

        if (nota > 100){
            System.out.println("Não posso informar seu conceito. Digite um valor válido.");}
        else if (nota > 90) {
            System.out.println("Conceito A");} 
        else if (nota > 80) {
            System.out.println("Conceito B");} 
        else if (nota > 70) {
            System.out.println("Conceito C");} 
        else if (nota > 60) {
            System.out.println("Conceito D");}
        else if (nota <= 60) {
            System.out.println("Conceito E");}
    }
}