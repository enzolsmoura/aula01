package com.mycompany;

import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        JOptionPane.showMessageDialog(null, "O valor do número digitado é: " + n);
    }
}
