package com.mycompany;

import javax.swing.JOptionPane;

public class ex07 {
    public static void main(String[] args) {
        String numero = "";
        for (int i = 0; i < 4; i++) {
            String input;
            char algarismo;
            input = JOptionPane.showInputDialog("Digite um número:");
            if (input.length() == 0 || input.length() > 1) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Você deve digitar apenas um número.");
                i -= 1;
            } else {
                algarismo = input.charAt(0);
                numero += algarismo;
            }
        }
        JOptionPane.showMessageDialog(null, numero);
    }
}
