/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhopoo_1bimestre2023.Models;

/**
 *
 * @author 00210402
 */
public class FormPag {
   
    private int CformPg;
    private String DformPg;

    public FormPag() {
    }

    public FormPag(int CformPg, String DformPg) {
        this.CformPg = CformPg;
        this.DformPg = DformPg;
    }

    public int getCformPg() {
        return CformPg;
    }

    public void setCformPg(int CformPg) {
        this.CformPg = CformPg;
    }

    public String getDformPg() {
        return DformPg;
    }

    public void setDformPg(String DformPg) {
        this.DformPg = DformPg;
    }

    @Override
    public String toString() {
        return "FormPag{" + "CformPg=" + CformPg + ", DformPg=" + DformPg + '}';
    }
 
            
}