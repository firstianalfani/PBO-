/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rini Angraeni
 */
import java.sql.*;
    
    public class KoneksiDBMS {
    String driverdbms = "com.mysql.jdbc.Driver";
    String database   = "jdbc:mysql://localhost/firstian06680";
    String user       = "root";
    String password   = "";  	

public KoneksiDBMS()  
  {
  }
    public Connection BukaCn() throws SQLException 
    {
        Connection condbms = null;
     	try 
     	{
            Class.forName(driverdbms);
            condbms =DriverManager.getConnection(database,user,password);
            return condbms;
        }
    	catch (SQLException se) 
    	{
            System.out.println("Ada kesalahan pada SQL !");
      	    return null;
    	}
        catch (Exception ex) 
        {
      	    System.out.println("Koneksi database tidak berhasil !");
      	    return null;
    	}
    }

}
