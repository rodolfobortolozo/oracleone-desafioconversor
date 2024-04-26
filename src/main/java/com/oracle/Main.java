package com.oracle;

import com.oracle.services.ImpGetExchange;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ImpGetExchange exchange = new ImpGetExchange("https://v6.exchangerate-api.com/v6/bc1936ffbd6eff2023cddff8/latest/USD");

        String moeda = "";
            System.out.println("Digite o código da Moeda");
            moeda = scanner.nextLine();
            System.out.println("Digite o valor para converter:");
            Double vlrConvert = scanner.nextDouble();
            Double vlr = (Double) exchange.request().getConversion_rates().get(moeda);

            if (vlr != null) {
                System.out.println("Total Convertido " + vlr * vlrConvert);
            } else {
                System.out.println("Moeda não encontrada");
            }

    }

}

/*

Your API Key: bc1936ffbd6eff2023cddff8
Example Request: https://v6.exchangerate-api.com/v6/bc1936ffbd6eff2023cddff8/latest/USD

* */
