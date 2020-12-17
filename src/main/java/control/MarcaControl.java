
package control;
import model.Marca;


public class MarcaControl {
    public boolean cadastrarMarca (String marcaNome){
        if (marcaNome != null && marcaNome.length() > 0){
        Marca marca = new Marca(marcaNome);        
        marca.cadastrarMarca(marcaNome);
        return true;       
        }
           
        return false;
    }
    

    
}

