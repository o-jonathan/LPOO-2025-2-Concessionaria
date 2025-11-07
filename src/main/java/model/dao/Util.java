/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import javax.swing.JOptionPane;

/**
 *
 * @author 20241PF.CC0020
 */
public class Util {
    public static boolean validaAno(int ano){
        if (ano > 1885 && ano <= 2026) {
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null, "Data inválida! Informe uma data entre [1885-2026]");
            return false;
        }
    }
    
    public static boolean validarCPF(String cpf) {
        if (cpf == null) return false;

        String apenasDigitos = cpf.replaceAll("\\D", "");
        if (apenasDigitos.length() != 11) return false;

        if (apenasDigitos.matches("(\\d)\\1{10}")) return false;

        try {
            int[] d = new int[11];
            for (int i = 0; i < 11; i++) d[i] = Integer.parseInt(apenasDigitos.substring(i, i+1));

            int soma = 0;
            for (int i = 0; i < 9; i++) soma += d[i] * (10 - i);
            int resto = soma % 11;
            int dv1 = (resto < 2) ? 0 : 11 - resto;
            if (d[9] != dv1) return false;

            soma = 0;
            for (int i = 0; i < 10; i++) soma += d[i] * (11 - i);
            resto = soma % 11;
            int dv2 = (resto < 2) ? 0 : 11 - resto;
            return d[10] == dv2;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
