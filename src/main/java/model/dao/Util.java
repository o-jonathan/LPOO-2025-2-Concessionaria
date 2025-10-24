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
}
