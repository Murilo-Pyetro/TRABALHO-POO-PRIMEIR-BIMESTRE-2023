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
public class Pedido {
    
    
    private int idPedido;
    private Cliente cliente;
    private ArrayList<ItemPedido> listaItens;
    private ArrayList<FormPag> formasPgto;

      public Pedido() {
       listaItens = new ArrayList<ItemPedido>();
       formasPgto = new ArrayList<FormPag>();
    
    }

    public Pedido(int idPedido, Cliente cliente, ArrayList<ItemPedido> listaItens, ArrayList<FormPag> formasPgto) {
        this.listaItens = new ArrayList<>();
        this.formasPgto= new ArrayList<>();
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.listaItens = listaItens;
        this.formasPgto = formasPgto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    public ArrayList<FormPag> getFormasPgto() {
        return formasPgto;
    }

    public void setFormasPgto(ArrayList<FormPag> formasPgto) {
        this.formasPgto = formasPgto;
    }
    
    
 
    
    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", cliente=" + cliente + ", listaItens=" + listaItens + ", formasPgto=" + formasPgto + '}';
    }
    
    
}
