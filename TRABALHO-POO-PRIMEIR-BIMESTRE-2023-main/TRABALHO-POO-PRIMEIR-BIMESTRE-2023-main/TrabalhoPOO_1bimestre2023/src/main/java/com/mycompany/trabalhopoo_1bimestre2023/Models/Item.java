/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;

/**
 *
 * @author 00210402
 */
public class Item {
    
    private int id;
    private double vlPReco;
    private int qtdEstoque;

    public Item() {
    }

    public Item(int id, double vlPReco, int qtdEstoque) {
        this.id = id;
        this.vlPReco = vlPReco;
        this.qtdEstoque = qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getVlPReco() {
        return vlPReco;
    }

    public void setVlPReco(double vlPReco) {
        this.vlPReco = vlPReco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "id=" + id + ", Valor R$ =" + vlPReco + ", qtdEstoque=" + qtdEstoque + '}';
    }

  
    
}
