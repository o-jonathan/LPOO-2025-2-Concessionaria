/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author vanessalagomachado
 */
@Entity
@Table(name = "vendas")
public class Venda implements Serializable{
    
    @Id
    @Column(name = "vendas_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private LocalDateTime dataVenda;
    private double valorVenda;
    private FormaContrato formaContrato;
    private FormaPgto formaPgto;
    
    @OneToMany
    private Cliente cliente;
    
    @OneToMany
    private Vendedor vendedor;
    
    @OneToOne
    private Veiculo veiculo;

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public FormaContrato getFormaContrato() {
        return formaContrato;
    }

    public void setFormaContrato(FormaContrato formaContrato) {
        this.formaContrato = formaContrato;
    }

    public FormaPgto getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(FormaPgto formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Venda: { veiculo"+veiculo.getPlaca()+", cliente: "+cliente.getNome()+", vendedor: "+vendedor.getNome()+"}";
    }
    
    
}
