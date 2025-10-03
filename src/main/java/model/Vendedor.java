/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author vanessalagomachado
 */
@Entity
public class Vendedor extends Pessoa{
    
    @Id
    @Column(name = "ven_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private double salario;
    private double comissao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
    
    public String exibirDados(){
        String aux = super.exibirDados()+"\n";
        aux += "Salário: " + salario + "\n";
        aux += "Comissão: " + comissao + "\n";
    
        return aux;
    }
    
}
