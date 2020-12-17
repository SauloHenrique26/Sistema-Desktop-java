

package dao;

import control.JdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CategoriaDao {
        private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
        
        public boolean inserircategoria(String categoriaNome){
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();
        if (conn == null){
            jdbcconnection.dbDisconnect();
        }
        try{
            pstmt=conn.prepareStatement("INSERT INTO CATEGORIA (CATEGORIA) VALUES (?)");
            pstmt.setString(1, categoriaNome);
            pstmt.execute();
            jdbcconnection.dbDisconnect();
            return true;
        }catch(SQLException e){
        
        }
        
        return false;
        
        }
        
        public ArrayList<String> CategoriaCB (){
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();   
        ArrayList<String> combocatfill = new ArrayList<String>();
       
        try {
            String sql = "Select * from categoria";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            
            while(rs.next()){
             String categoria = rs.getString("categoria");
             combocatfill.add(categoria);
             }
            
            System.out.println(combocatfill);
            return combocatfill;
            
            
        }catch (SQLException e){
          
          return null;  
        }     
          
    } 
        
    
}
