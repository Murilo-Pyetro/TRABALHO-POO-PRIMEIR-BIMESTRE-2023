/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhopoo_1bimestre2023;


import com.mycompany.trabalhopoo_1bimestre2023.Models.Loja;
import com.mycompany.trabalhopoo_1bimestre2023.Models.FormPag;
import com.mycompany.trabalhopoo_1bimestre2023.Models.Endereco;
import com.mycompany.trabalhopoo_1bimestre2023.Models.Cliente;
import com.mycompany.trabalhopoo_1bimestre2023.Models.Biblioteca;
import com.mycompany.trabalhopoo_1bimestre2023.Models.Livro;
import com.mycompany.trabalhopoo_1bimestre2023.Models.ItemPedido;
import com.mycompany.trabalhopoo_1bimestre2023.Models.Pedido;

import java.util.Scanner;

/**
 *
 * @author 00210402
 */
public class Main {

    public static void main(String[] args) {
        FormPag  dinheiro = new FormPag(1, "Dinheiro"); //Criando primeira forma de pagamento
        FormPag  pix = new FormPag(2, "Cartao");//Criando segunda forma de pagamento
        
        Endereco endereco1 = new Endereco("982002", "Rua da unipar", 666, "Casa",
                "PR", "Toledo", "Paraná", "Brasil"); //criando Endereco
        
        Cliente cliente1 = new Cliente(1, "Terror", "Bozin", endereco1);//Criando primeiro cliente
        
        Biblioteca biblioteca = new Biblioteca();
         Livro livro1 = new Livro(1, "Os reprovados de Poo", "Unipar", 
                 "soDeusSabe", "2023", 200, "Terror", 200.00, 4); //criando Livro 1
        
         
         
        Livro livro2 = new Livro(2, "Os paga sub ", "prati",
                "socorroDeus", "2022", 100, "Suspense", 100.00, 6);//criando Livro 2
        Livro livro3 = new Livro(3, "Socorro Deus ", "shopping",
                "vouReprovar", "2020", 59, "Ação", 50.00, 2);//criando Livro 3
        biblioteca.adicionarLivro(livro1);//adicionando Livro 1 na Biblioteca
        biblioteca.adicionarLivro(livro2);//adicionando Livro 2 na Biblioteca
        biblioteca.adicionarLivro(livro3);//adicionando Livro 3 na Biblioteca

        
         //Criando primeiro objeto Item pedido
        ItemPedido itemPedido = new ItemPedido(); //Criando primeiro pedido 
        itemPedido.setItemLivro(livro1);// setando no item livro, o livro que criei
        itemPedido.setQtdVendas(2);//setando na quantidade de vendas a quantidade que cliente comprou
        itemPedido.setValorUni(livro1.getPreco());
        
         livro1.removerEstoque(2); //Aqui estou removendo a quantidade de livros
        
        //Criando segundo objeto Item pedido
        ItemPedido itemPedido2 = new ItemPedido();
        itemPedido2 .setItemLivro(livro2);
        itemPedido2 .setQtdVendas(3);
        itemPedido2 .setValorUni(livro2.getPreco());
      
         livro2.removerEstoque(3);//Aqui estou removendo a quantidade de livros
       
        Pedido pedido = new Pedido();//Criando primeiro pedido
        pedido.setCliente(cliente1); //Setando no pedido o cliente 1
        pedido.setIdPedido(1);//Setando no pedido o ID do pedido
        pedido.getListaItens().add(itemPedido);
        pedido.getFormasPgto().add(pix);
        
  
        Loja unipar = new Loja();
        unipar.setId(1);
        unipar.setCNPJ("23323232");
        
        unipar.setNome("lojinha dos reprovados");
        unipar.getListapedido().add(pedido);
        
        
                
               
         System.out.println("Valor total da venda foi R$"+itemPedido.calcularValorTotal(3, 10));
         System.out.println("A forma de pagamento foi: "+pedido.getFormasPgto());
         System.out.println(unipar.toString());  
         
    }
}
  