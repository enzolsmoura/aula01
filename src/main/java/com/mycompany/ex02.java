package com.mycompany;

import javax.swing.JOptionPane;

public class ex02 {
    public static void main(String[] args) {
        String palavras[] = new String[3];
        String frase = "";
        for (int i = 0; i < palavras.length; i++) {
            palavras[2 - i] = JOptionPane.showInputDialog("Digite uma palavra:");
            frase += palavras[2 - i] + ' ';
        }
        frase = frase.substring(0, frase.length() - 1);
        JOptionPane.showMessageDialog(null, frase);
    }
}
