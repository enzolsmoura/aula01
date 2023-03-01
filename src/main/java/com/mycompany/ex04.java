package com.mycompany;

import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        int dia, mes, ano;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano:"));
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || ano <= 0 || (mes == 2 && ano % 4 == 0 && dia > 29)
                || (mes == 2 && ano % 4 != 0 && dia > 28)
                || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)) {
            JOptionPane.showMessageDialog(null, String.format("Data inválida!"));

        } else {
            JOptionPane.showMessageDialog(null, String.format("A data digitada foi %02d/%02d/%04d", dia, mes, ano));
        }
    }
}
