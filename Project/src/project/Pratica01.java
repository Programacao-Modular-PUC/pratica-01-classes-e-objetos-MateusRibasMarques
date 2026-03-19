package project;

import java.util.Scanner;

public class Pratica01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do cateto 1: ");
        double c1 = sc.nextDouble();

        System.out.print("Digite o valor do cateto 2: ");
        double c2 = sc.nextDouble();

        
        TrianguloRetangulo t = new TrianguloRetangulo(c1, c2);

        
        double h = t.calcularHipotenusa();
        double area = t.calcularArea();

        
        System.out.println("Hipotenusa: " + h);
        System.out.println("Área: " + area); 

        sc.close();
    }
}