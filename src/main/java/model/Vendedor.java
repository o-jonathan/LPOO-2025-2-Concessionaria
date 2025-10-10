/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.*;

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
    
    @Column(name = "vend_salario", columnDefinition = "numeric(12,2)")
    private double salario;
    
    @Column(name = "vend_comissao", columnDefinition = "numeric(5,2)")
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
