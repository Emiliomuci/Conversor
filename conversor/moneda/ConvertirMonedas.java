package com.alura.conversor.moneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

    public void ConvertirPesosArgentinoDolares(double valor) {
        double monedaDolar = valor / 137.68;
        monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
    }

    public void ConvertirDolaresPesosArgentino(double valor) {
        double monedaDolar = 137.68 * valor;
        monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
    }

    public void ConvertirPesosArgentinoEuros(double valor) {
        double monedaEuro = valor / 137.20;
        monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
    }
}
