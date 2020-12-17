/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.MarcaDao;

/**
 *
 * @author Usuario
 */
public class Marca {
    public String marcaNome;

    public String getMarcaNome() {
        return marcaNome;
    }

    public void setMarcaNome(String marcaNome) {
        this.marcaNome = marcaNome;
    }

    public Marca(String marcaNome) {
        this.marcaNome = marcaNome;
    }
    
    public void cadastrarMarca(String marcaNome){
        
        MarcaDao marcadao = new MarcaDao();        
        marcadao.inserirmarca(marcaNome);
        
       
    }

}
