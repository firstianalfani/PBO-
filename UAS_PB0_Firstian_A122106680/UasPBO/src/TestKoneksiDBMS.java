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

public class TestKoneksiDBMS {
    public static void main(String[] args){
        try	
	{
	   KoneksiDBMS CnFilm = new KoneksiDBMS();
	   Connection con = CnFilm.BukaCn();
		     	          	   		
            if (con != null) {
                System.out.println("Koneksi Berhasil !");
			
            } else {
				
                System.out.println("Koneksi Tidak Berhasil !");
            }
            //con.close();
        }
	catch(SQLException e) 
	{
                System.err.println("Kesalahan perintah SQL : " + e.getMessage());		   	
	}
    }

}
