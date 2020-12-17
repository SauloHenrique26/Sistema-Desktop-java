
package control;

import model.Item;



public class ItemControl {
     public boolean cadastrarItem (String produto, Float valor, String codigo, String marca, String categoria){
        
         if (!(produto != null && produto.length() > 0)){
            
            return false;
           
        }else if(!(valor != null)){
            
            return false;            
            
                   
        }else if(!(codigo != null && codigo.length()> 0)){
            
            return false;
            
        }else{
        Item item = new Item();
        item.cadastrarItem(valor, produto, codigo,categoria,marca);   
        return true;
        }
        
    }
     
     public boolean saidaItem (String codigo){
        if (codigo != null && codigo.length() > 0){
        Item item = new Item();        
        item.saidaItem(codigo);
        return true;       
        }
           
        return false;
    }
     
     
}
