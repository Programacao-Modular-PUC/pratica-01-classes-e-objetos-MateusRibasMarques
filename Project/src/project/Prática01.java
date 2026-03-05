/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package project;
import java.util.Scanner;
/**
 *
 * @author 1583479
 */
 
public class Prática01 {

        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o Sobrenome: ");
        String Sobrenome = sc.nextLine();
        
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        
         System.out.print("Digite a altur: ");
        float altura = sc.nextFloat();
        
         System.out.print("Digite o peso: ");
        float peso = sc.nextFloat();
        
   Pessoa p = new Pessoa();
    p.setName(nome);
    p.setSobreNome(Sobrenome);
    p.setIdade(idade);
    p.setAltura(altura);
    p.setPeso(peso);
    
    float imc = p.CalculaIMC(peso, altura);
    p.setImc(imc);

    System.out.println("\nNome: " + p.getName() + " " + Sobrenome);
    System.out.println("Idade: " + idade);
    System.out.println("IMC: " + imc);

    p.InformaObesidade(imc);
        
    }
}

  

    

