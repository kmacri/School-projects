/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.merrimack.fop2.jdbcsetup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author kmacr
 */
public class DataBaseProvider {
    
    private static Connection getMySQLConnection(String databaseName, String user, String password)
    {
        try
        {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, user, password);
        } catch (Exception exception)
        {
            System.out.println("Failed to connect to the database" + exception.getMessage());
            return null;
        }
    }
    
    public static boolean returnStatement(String databaseName, String user, String password)
    {
        try
        {
            //Get a connection   
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, user, password);
            
            //Get everything from meal table 
            Statement myStatement = myConnection.createStatement();
            String query = "SELECT * FROM Game";
            ResultSet myRelation = myStatement.executeQuery(query);
            
            //print them out 
            while (myRelation.next())
            {
              
                String gameName = myRelation.getString("gameName");
                int Id = myRelation.getInt("Id");
                System.out.println("Tuple Values:" + gameName + "," + Id);
                
           }
        }
        catch (Exception exception)
        {
            System.out.println("Epic Fail:" + exception.getMessage());
            return false;
        }
        return true;
    }
    
    //start part 2 
    
    public static void returnPreparedStatment(String databaseName, String user, String password)
    {
        try {
            
        
        Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, user, password);

        String query = "SELECT * FROM videoGameSystems WHERE ConsoleName = ?";
        PreparedStatement myPreparedStatement = myConnection.prepareStatement(query); 
        
        myPreparedStatement.setString(1, "Nintendo 64");
        ResultSet myRelation = myPreparedStatement.executeQuery(query);
        
        
        }
        catch (Exception exception)
        {
            System.out.println("Epic Fail:" + exception.getMessage());
        }
        
    }
    
    
    //Callable statment 
    
        public static void callableStatement(String databaseName, String user, String password){
            
            try{
                
                Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, user, password);

                CallableStatement myStoredProcedureCall = myConnection.prepareCall("{Call GetAllGames(?)}");
                myStoredProcedureCall.setString(1,"Switch");
                ResultSet myResults = myStoredProcedureCall.executeQuery();
                
                
            }
            catch (Exception exception)
            {
                System.out.println("Epic Fail:" + exception.getMessage());
            }
            
            
        }

    
    
    
} //END
