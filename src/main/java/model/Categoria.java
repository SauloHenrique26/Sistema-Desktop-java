/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.CategoriaDao;

/**
 *
 * @author Usuario
 */
public class Categoria {
    public String categoriaNome;

    public String getCategoriaNome() {
        return categoriaNome;
    }

    public void setCategoriaNome(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public Categoria(String categoriaNome) {
        this.categoriaNome = categoriaNome;
    }

    public void cadastrarCategoria(String categoriaNome) {
        
        CategoriaDao marcadao = new CategoriaDao();        
        marcadao.inserircategoria(categoriaNome);
       
    }
    

    
    
    };
    
    

