package aula2;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Inserção de Informações.
        System.out.println("Insira seu peso aqui: ");
        double peso = leitor.nextDouble();
        System.out.println("Insira sua altura: ");
        double altura = leitor.nextDouble();
        //Calculo.
        double imc;
        imc = peso / (altura * altura);
        System.out.println(imc);

        if (imc < 18.6){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.println("Peso ideal, parabéns");
        } else if (imc >= 25.0 && imc < 29.9 ) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 30.0 && imc < 34.9){
            System.out.println("Obesidade grau 2(severa)");
        } else if (imc >= 35.0 && imc < 39.9){
            System.out.println("Obesidade 3(mórbida");
        }
    }
}