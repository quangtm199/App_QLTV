/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Book;

/**
 *
 * @author Microsoft Windows
 */
public class DBConnection {
    public static Connection getConnection(){
         Connection conection =null;
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433; databaseName=QLNV";
            String user="sa";
            String pass="123456";
            conection=DriverManager.getConnection(url, user, pass);
            System.out.println("ket noi thanh cong");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conection;
    }
    public static void closeConnection(Connection con){
        if(con!=null){try {
            con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
}}
 
    
    
        public static void main(String[] args){
            System.out.println(getConnection());}
    
}
