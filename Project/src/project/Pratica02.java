package project;

import java.util.Scanner;

public class Pratica02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        TrianguloRetangulo t = new TrianguloRetangulo();
        
        System.out.print("Digite o cateto 1: ");
        float c1 = sc.nextFloat();
        
        System.out.print("Digite o cateto 2: ");
        float c2 = sc.nextFloat();
        
        t.setc1(c1);
        t.setc2(c2);
        
        float hipotenusa = t.CalculaHipotenusa();
        float area = t.CalculaArea();
        
        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Área do triângulo: " + area);
        
    }
}