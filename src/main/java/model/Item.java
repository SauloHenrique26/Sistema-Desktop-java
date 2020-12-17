/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.ItemDao;

/**
 *
 * @author Usuario
 */
public class Item {
    public Float valor ;
    public String produto;
    private String createdAt;
    private String updateAt;
    private String movimento;
    public String codigo;
    public String categoria;
    public String marca;

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getMovimento() {
        return movimento;
    }

    public void setMovimento(String movimento) {
        this.movimento = movimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Item(Float valor, String produto, String createdAt, String updateAt, String movimento, String codigo, String categoria, String marca) {
        this.valor = valor;
        this.produto = produto;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.movimento = movimento;
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
    }


   

    public Item() {
    }


    
  
    
    public void cadastrarItem(Float valor, String produto, String codigo, String categoria, String marca){
        
        ItemDao itemdao = new ItemDao(); 
        itemdao.inseriritem(valor, produto, codigo,categoria, marca); 
        
    }
    
    public void saidaItem(String codigo){
        ItemDao itemdao = new ItemDao();
        itemdao.saidaitem(codigo);
        
    }
}
