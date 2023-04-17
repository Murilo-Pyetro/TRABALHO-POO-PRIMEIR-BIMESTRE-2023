/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Loja {
    private int id;
    private String CNPJ;
    private String Nome;
    private ArrayList<Pedido> listapedido;
    
    public Loja() {
        listapedido = new ArrayList<>();
    }

    public Loja(int id, String CNPJ, String Nome, ArrayList<Pedido> listapedido) {
        this.listapedido = new ArrayList<>();
        this.id = id;
        this.CNPJ = CNPJ;
        this.Nome = Nome;
        this.listapedido = listapedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Pedido> getListapedido() {
        return listapedido;
    }

    public void setListapedido(ArrayList<Pedido> listapedido) {
        this.listapedido = listapedido;
    }

    @Override
    public String toString() {
        return "Loja{" + "id=" + id + ", CNPJ=" + CNPJ + ", Nome=" + Nome + ", listapedido=" + listapedido + '}';
    }
 
    
}