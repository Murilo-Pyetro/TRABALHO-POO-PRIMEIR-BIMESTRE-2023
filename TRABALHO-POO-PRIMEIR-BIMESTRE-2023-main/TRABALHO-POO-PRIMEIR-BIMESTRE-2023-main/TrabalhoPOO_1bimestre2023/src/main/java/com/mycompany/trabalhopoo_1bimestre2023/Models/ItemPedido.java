/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;

/**
 *
 * @author guilh
 */
public class ItemPedido {
    
    private Livro itemLivro;
    private int qtdVendas;
    private double valorUni;
    private double valorTotal;
    private Livro qtd;
    

   

    public ItemPedido() {
    }

    public ItemPedido(Livro itemLivro, int qtdVendas, double valorUni, double valorTotal) {
        this.itemLivro = itemLivro;
        this.qtdVendas = qtdVendas;
        this.valorUni = valorUni;
        this.valorTotal = valorTotal;
    }
 
   
    
    
    public Livro getItemLivro() {
        return itemLivro;
    }

    public void setItemLivro(Livro itemLivro) {
        this.itemLivro = itemLivro;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public double getValorUni() {
        return valorUni;
    }

    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void addEstoque(int quantidade) {
        qtdVendas += quantidade;
    }

   

    public boolean verificarEstoque(int quantidade) {
        return qtdVendas >= quantidade;
    }

    public double calcularDesconto(double porcentagemDesconto) {
        return valorTotal * (1 - porcentagemDesconto / 100);
    }
    
    public double calcularValorTotal(int quantidadeVenda, double valorUnDesconto) {
        return (valorTotal - valorUnDesconto) * quantidadeVenda;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "itemLivro=" + itemLivro + ", qtdVendas=" + qtdVendas + ", valorUni=" + valorUni + ", valorTotal=" + valorTotal + '}';
    }
    
   
}
