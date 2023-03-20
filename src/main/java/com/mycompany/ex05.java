package com.mycompany;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        float peso, altura;
        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso (em kg):"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura (em metros):"));
        JOptionPane.showMessageDialog(null,
                String.format("Seus dados digitados foram: %.2f kg e %.2f m", peso, altura));
    }
}
