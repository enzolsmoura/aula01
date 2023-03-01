package com.mycompany;

import javax.swing.JOptionPane;

public class ex06 {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i < 10; i++) {
            String input;
            input = JOptionPane.showInputDialog("Digite um caractere:");
            if (input.length() == 0 || input.length() > 1) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Você deve digitar apenas um caractere.");
                i -= 1;
            } else {
                str += input;
            }
        }
        JOptionPane.showMessageDialog(null, str);
    }
}
