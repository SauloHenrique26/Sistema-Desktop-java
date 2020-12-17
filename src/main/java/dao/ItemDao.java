/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import control.JdbcConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Item;

/**
 *
 * @author Saulo Brito
 */
public class ItemDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;
        
    public boolean inseriritem (Float valor, String produto,String codigo, String categoria, String marca){
        
        
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();
        if (conn == null) {
			jdbcconnection.dbDisconnect();
			return false;
		}
        int chkCat = this.CheckCategoria(categoria);
        int chkMar = this.CheckMarca(marca);
        if( chkCat == 0 || chkMar == 0){
            
            jdbcconnection.dbDisconnect();
            return false;
        
        }
        try {       
                       
			pstmt = conn.prepareStatement("INSERT INTO ITEM (VALOR, PRODUTO, CODIGO, CATEGORIA, MARCA, MOVIMENTO, UPDATED_AT) \n" +
                            "VALUES (?, ?, ?, ?, ?, 'E', SYSDATE )");
			pstmt.setFloat(1, valor);
                        pstmt.setString(2, produto);
                        pstmt.setString(3, codigo);
                        pstmt.setInt(4, chkCat);
                        pstmt.setInt(5, chkMar); 
                        pstmt.execute();
			jdbcconnection.dbDisconnect();
			return true;
    
        }catch (SQLException e){
            System.out.println(e);
            jdbcconnection.dbDisconnect();
            return false;
            
        }
            
    
    
    }
    
    public int CheckCategoria (String categoria){
        
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();
        int i=0;
        int saidacat = 0;
        if (conn == null) {
            jdbcconnection.dbDisconnect();
            return i;
        }
        try{
            
            pstmt = conn.prepareStatement("SELECT * FROM CATEGORIA WHERE CATEGORIA = (?) ");
            pstmt.setString(1,categoria);
            rs=pstmt.executeQuery();
            while(rs.next()){
             saidacat = rs.getInt("CATEGORIA_ID");
             }
           return saidacat;
             
        }catch(SQLException e){
             jdbcconnection.dbDisconnect();    
             return i;   
        }
    }
       
    public int CheckMarca (String marca){
        
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();
        int i=0;
        int saidamar = 0;
        if (conn == null) {
            jdbcconnection.dbDisconnect();
            return i;
        }
        try{
            
            pstmt = conn.prepareStatement("SELECT * FROM MARCA WHERE MARCA = (?) ");
            pstmt.setString(1,marca);
            rs=pstmt.executeQuery();
            while(rs.next()){
                saidamar = rs.getInt("MARCA_ID");
            }
            return saidamar;
            
            
         
             
        }catch(SQLException e){
             jdbcconnection.dbDisconnect();   
             return i;   
        }
        
            
       
     
    }
   
    public boolean saidaitem (String codigo){
        
        
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn = jdbcconnection.dbConnect();
        if (conn == null) {
			jdbcconnection.dbDisconnect();
			return false;
        }
        try {       
                       
			pstmt = conn.prepareStatement("UPDATE ITEM SET MOVIMENTO ='S' ,UPDATED_AT = (SYSDATE) WHERE codigo= (?) ");
			pstmt.setString(1, codigo);
                        pstmt.execute();
			jdbcconnection.dbDisconnect();
			return true;
    
        }catch (SQLException e){
            jdbcconnection.dbDisconnect();
            return false;
            
        }
            
    
    
    }
    
    public ArrayList<Item> TabelaEntradaCB (){
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn =jdbcconnection.dbConnect();   
        ArrayList tabelafill = new ArrayList<>();
       
        try {
            String sql = "SELECT  ITEM.PRODUTO, ITEM.VALOR, ITEM.CREATED_AT, \n" +
            "ITEM.CODIGO,CATEGORIA.CATEGORIA, MARCA.MARCA\n" +
            "FROM ITEM \n" +
            "INNER JOIN CATEGORIA\n" +
            "ON ITEM.CATEGORIA  = CATEGORIA.CATEGORIA_ID\n" +
            "INNER JOIN MARCA\n" +
            "ON ITEM.MARCA = MARCA.MARCA_ID\n" +
            "WHERE item.movimento = 'E'  ORDER BY item.produto";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            
            while(rs.next()){
                Item item = new Item();
             item.setProduto(rs.getString("produto")); 
             item.setValor(rs.getFloat("valor"));
             item.setCreatedAt(rs.getString("created_at"));
             item.setCodigo(rs.getString("codigo"));
             item.setCategoria(rs.getString("CATEGORIA"));
             item.setMarca(rs.getString("MARCA"));
             
             tabelafill.add(item);
             }
            
            System.out.println(tabelafill);
            return tabelafill;

        }catch (SQLException e){
            System.out.println(e);
            jdbcconnection.dbDisconnect();
          return null;  
        }     
          
    }   
     
     public ArrayList<Item> TabelaSaidaCB (){
        JdbcConnection jdbcconnection = new JdbcConnection();
        conn =jdbcconnection.dbConnect();   
        ArrayList tabelafill = new ArrayList<>();
       
        try {
            String sql = "SELECT  ITEM.PRODUTO, ITEM.VALOR, ITEM.UPDATED_AT, \n" +
            "ITEM.CODIGO,CATEGORIA.CATEGORIA, MARCA.MARCA\n" +
            "FROM ITEM \n" +
            "INNER JOIN CATEGORIA\n" +
            "ON ITEM.CATEGORIA  = CATEGORIA.CATEGORIA_ID\n" +
            "INNER JOIN MARCA\n" +
            "ON ITEM.MARCA = MARCA.MARCA_ID\n" +
            "WHERE item.movimento = 'S'  ORDER BY item.produto";
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();
            
            while(rs.next()){
                Item item = new Item();
             item.setProduto(rs.getString("produto")); 
             item.setValor(rs.getFloat("valor"));
             item.setCreatedAt(rs.getString("updated_at"));
             item.setCodigo(rs.getString("codigo"));
             item.setCategoria(rs.getString("CATEGORIA"));
             item.setMarca(rs.getString("MARCA"));
             
             tabelafill.add(item);
             }
            
            System.out.println(tabelafill);
            return tabelafill;

        }catch (SQLException e){
            System.out.println(e);
            jdbcconnection.dbDisconnect();
          return null;  
        }     
          
    } 
        
    
    
}
