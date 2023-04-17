/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;

/**
 *
 * @author 00210402
 */
public class Cliente extends Pessoa{
    
    private int id;
    private String GostoGenero;

   public Cliente(){
       
   }

    public Cliente(int id, String GostoGenero, String nome, Endereco endereco) {
        super(nome, endereco);
        this.id = id;
        this.GostoGenero = GostoGenero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGostoGenero() {
        return GostoGenero;
    }

    public void setGostoGenero(String GostoGenero) {
        this.GostoGenero = GostoGenero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", GostoGenero=" + GostoGenero + '}';
    }

   
    
}