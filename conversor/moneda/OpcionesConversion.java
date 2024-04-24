package com.alura.conversor.moneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {

    ConvertirMonedas monedas = new ConvertirMonedas();

    public void ConvertirMonedas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda que deseas convertir tu dinero ",  "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Dólar a Pesos", "De Pesos a Euro", "Salir"},
                "De Pesos a Dólar")).toString();

        switch (opcion) {
            case "De Pesos a Dólar":
                monedas.ConvertirPesosArgentinoDolares(valor);
                break;

            case "De Dólar a Pesos":
                monedas.ConvertirDolaresPesosArgentino(valor);
                break;

            case "De Pesos a Euro":
                monedas.ConvertirPesosArgentinoEuros(valor);
                break;

            case "Salir":
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
        }
    }
}
