/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;
/**
 *
 * @author guilh
 */
public class Livro {
     private int id;
    private String Titulo;
    private String editora;
    private String autor;
    private  String Anolancamento;
    private int Qtdpagina;
    private String genero;
    private double preco;
    private int qtd;

    public Livro() {
    }

    public Livro(int id, String Titulo, String editora, String autor, String Anolancamento, int Qtdpagina, String genero, double preco, int qtd) {
        this.id = id;
        this.Titulo = Titulo;
        this.editora = editora;
        this.autor = autor;
        this.Anolancamento = Anolancamento;
        this.Qtdpagina = Qtdpagina;
        this.genero = genero;
        this.preco = preco;
        this.qtd = qtd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnolancamento() {
        return Anolancamento;
    }

    public void setAnolancamento(String Anolancamento) {
        this.Anolancamento = Anolancamento;
    }

    public int getQtdpagina() {
        return Qtdpagina;
    }

    public void setQtdpagina(int Qtdpagina) {
        this.Qtdpagina = Qtdpagina;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
 
    
   
    public void removerEstoque(int quantidade) {
        qtd -= quantidade;
    }
    
    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", Titulo=" + Titulo + ", editora=" + editora + ", autor=" + autor + ", Anolancamento=" + Anolancamento + ", Qtdpagina=" + Qtdpagina + ", genero=" + genero + ", preco=" + preco + ", qtd=" + qtd + '}';
    }

}
