package com.alura.conversor.principal;

import javax.swing.JOptionPane;

import com.alura.conversor.moneda.ConvertirMonedas;

public class Principal {

    public static void main(String[] args) {

        ConvertirMonedas conversion = new ConvertirMonedas();

        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Pesos a Dólar", "De Dólar a Pesos", "Salir" },
                    "De Pesos a Dólar").toString();

            switch (opciones) {
                case "De Pesos a Dólar":
                    String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de pesos a convertir a dólares:");
                    double valorRecibido = Double.parseDouble(input);
                    conversion.ConvertirPesosArgentinoDolares(valorRecibido);
                    break;

                case "De Dólar a Pesos":
                    String input2 = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dólares a convertir a pesos:");
                    double valorRecibido2 = Double.parseDouble(input2);
                    conversion.ConvertirDolaresPesosArgentino(valorRecibido2);
                    break;

                case "Salir":
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    return;
            }
        }
    }
}
