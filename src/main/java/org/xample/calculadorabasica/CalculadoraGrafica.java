package org.xample.calculadorabasica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGrafica extends JFrame {
    private JTextField campoNumero1, campoNumero2, campoResultado;
    private JButton botonSumar, botonRestar, botonMultiplicar, botonDividir;

    public CalculadoraGrafica() {
        setTitle("Calculadora Gráfica");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        campoNumero1 = new JTextField();
        campoNumero2 = new JTextField();
        campoResultado = new JTextField();
        campoResultado.setEditable(false);

        botonSumar = new JButton("+");
        botonRestar = new JButton("-");
        botonMultiplicar = new JButton("*");
        botonDividir = new JButton("/");

        add(new JLabel("Número 1:"));
        add(campoNumero1);
        add(new JLabel("Número 2:"));
        add(campoNumero2);
        add(new JLabel("Resultado:"));
        add(campoResultado);
        add(botonSumar);
        add(botonRestar);
        add(botonMultiplicar);
        add(botonDividir);

        // Listeners para botones
        ActionListener listener = (ActionEvent e) -> {
            try {
                double num1 = Double.parseDouble(campoNumero1.getText());
                double num2 = Double.parseDouble(campoNumero2.getText());
                double resultado = 0;
                
                if (e.getSource() == botonSumar) {
                    resultado = num1 + num2;
                } else if (e.getSource() == botonRestar) {
                    resultado = num1 - num2;
                } else if (e.getSource() == botonMultiplicar) {
                    resultado = num1 * num2;
                } else if (e.getSource() == botonDividir) {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        campoResultado.setText("Error: División por 0");
                        return;
                    }
                }
                
                campoResultado.setText(String.valueOf(resultado));
            } catch (NumberFormatException ex) {
                campoResultado.setText("Error: Entrada inválida");
            }
        };

        botonSumar.addActionListener(listener);
        botonRestar.addActionListener(listener);
        botonMultiplicar.addActionListener(listener);
        botonDividir.addActionListener(listener);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraGrafica calculadora = new CalculadoraGrafica();
            calculadora.setVisible(true);
        });
    }
}
