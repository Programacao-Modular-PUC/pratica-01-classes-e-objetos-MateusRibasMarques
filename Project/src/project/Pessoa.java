/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author 1583479
 */
public class Pessoa{
      
       private String nome;
       private String sobreNome;
       private int idade;
       private float altura;
       private float peso;
       private float imc;
       
       public String getName() {
        return nome;
    }
          public String sobreNome() {
        return sobreNome;
    }
             public int idade() {
        return idade;
    }
                public float altura() {
        return altura;
    }
                   public float peso() {
        return peso;
    }
                      public float imc() {
        return imc;
    }
       
       public void setName(String name) {
        nome = name;
    }
         public void setSobreNome(String sobre) {
        sobreNome = sobre;
    }
          public void setIdade(int id) {
        idade = id;
    }
          public void setAltura(float h) {
        altura = h;
    }
          public void setPeso(float p) {
        peso = p;
    }
          public void setImc(float im) {
        imc = im;
    }
          
     public float CalculaIMC (float peso, float altura){  
         
         return peso/(altura * altura);
     } 
         
        public void InformaObesidade (float imc){  
         
            if(imc < 18.5){
            System.out.print("A baixo do peso");
         }else if(imc > 18.5 && imc <24.9){
           System.out.print("Peso normal");  
         }else if(imc >= 25 && imc <29.9){
             System.out.print("SobrePeso");
         }else if(imc >= 30 && imc <34.9){
             System.out.print("Obesdade Grau1");
         }else if(imc >= 35 && imc <39){
             System.out.print("Obesdade Grau2");
         }else{
             System.out.print("Obesdade Grau3");
         }
        }
}
