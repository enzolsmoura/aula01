package com.mycompany;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        String palavras[] = new String[3];
        String frase = "";
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = JOptionPane.showInputDialog("Digite uma palavra:");
            frase += palavras[i] + ' ';
        }
        frase = frase.substring(0, frase.length() - 1);
        JOptionPane.showMessageDialog(null, frase);
    }
}
