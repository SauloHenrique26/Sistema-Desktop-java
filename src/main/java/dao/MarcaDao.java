
package dao;

import control.JdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MarcaDao{
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
        
    public boolean inserirmarca (String marcaNome){
        
        
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();
        if (conn == null) {
			jdbcconnection.dbDisconnect();
			return false;
		}
        try {       
                       
			pstmt = conn.prepareStatement("INSERT INTO MARCA (MARCA) VALUES (?)");
			pstmt.setString(1, marcaNome);
                        pstmt.execute();
			jdbcconnection.dbDisconnect();
			return true;
    
        }catch (SQLException e){
    
        }
            return false;
    
    
    }
      
    public ArrayList<String> MarcasCB (){
        JdbcConnection abc = new JdbcConnection();
        conn = abc.dbConnect();   
        ArrayList<String> combomarcafill = new ArrayList<String>();
       
        try {
            String sql = "Select * from marca";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            
            while(rs.next()){
             String marca = rs.getString("marca");
             combomarcafill.add(marca);
             }
            
            
            return combomarcafill;
            
        }catch (SQLException e){
          
          return null;  
        }     
          
    }   

}
