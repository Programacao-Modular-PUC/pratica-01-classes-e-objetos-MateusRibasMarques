package project;

import java.util.Scanner;

public class Pratica02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura (ex: 1.70): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        double imc = p.calcularIMC();

        System.out.println("\nIMC: " + imc);
        System.out.println("Classificação: " + p.informarObesidade());

        sc.close();
    }
}