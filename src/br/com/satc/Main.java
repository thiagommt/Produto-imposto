package br.com.satc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double imposto;
        double valorsim;
        System.out.println("Qual o valor do produto:");
        float valor = entrada.nextFloat();
        System.out.println("Qual o país de fabricação:");
        String pais;
        pais = entrada.next();
        int produto;
        produto = entrada.nextInt();

        if (pais.toUpperCase().equals("BRASIL"));
        {

            if (valor < 999) {
                imposto = valor * 0.01;
                valorsim = imposto - valor;
                System.out.println("O valor do imposto é de R$" + imposto);
                System.out.println("O valor do produto sem imposto é de R$" + valorsim);
            } else {
            }
            if (valor >= 1000) {
                imposto = valor * 0.015;
                valorsim = imposto - valor;
                System.out.println("O valor do imposto é de R$" + imposto);
                System.out.println("O valor do produto sem imposto é de R$" + valorsim);
            } else {
             
        }

    }

}
}
