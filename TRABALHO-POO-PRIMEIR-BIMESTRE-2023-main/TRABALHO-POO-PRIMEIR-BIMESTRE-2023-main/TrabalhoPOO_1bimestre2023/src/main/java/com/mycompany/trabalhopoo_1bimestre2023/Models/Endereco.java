/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;

/**
 *
 * @author 00210402
 */
public class Endereco {
    private String cep;
    private String nmRua;
    private int nrCasa;
    private String dsComplemento;
    private String sgUF;
    private String nmCidade;
    private String estado;
    private String Pais;

    
    public Endereco(){
        
    }
    public Endereco(String cep, String nmRua, int nrCasa, String dsComplemento, String sgUF, String nmCidade, String estado, String Pais) {
        this.cep = cep;
        this.nmRua = nmRua;
        this.nrCasa = nrCasa;
        this.dsComplemento = dsComplemento;
        this.sgUF = sgUF;
        this.nmCidade = nmCidade;
        this.estado = estado;
        this.Pais = Pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public int getNrCasa() {
        return nrCasa;
    }

    public void setNrCasa(int nrCasa) {
        this.nrCasa = nrCasa;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getSgUF() {
        return sgUF;
    }

    public void setSgUF(String sgUF) {
        this.sgUF = sgUF;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep=" + cep + ", nmRua=" + nmRua + ", nrCasa=" + nrCasa + ", dsComplemento=" + dsComplemento + ", sgUF=" + sgUF + ", nmCidade=" + nmCidade + ", estado=" + estado + ", Pais=" + Pais + '}';
    }

  
}