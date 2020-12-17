/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Categoria;


/**
 *
 * @author Usuario
 */
public class CategoriaControl {
    
    public boolean cadatrarCategoria (String categoriaNome){
        if (categoriaNome != null && categoriaNome.length() > 0){
        Categoria categoria = new Categoria(categoriaNome);
        categoria.cadastrarCategoria(categoriaNome);
        return true;  
        }
           
        return false;
    }
  
        
}
