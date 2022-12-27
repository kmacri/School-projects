/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.merrimack.fop2.jdbcsetup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


/**
 *
 * @author kmacr
 */


/* Question One */
public class dataBaseManager {
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
    
    public static void main(String[] args){
        
    
        Scanner newScanner = new Scanner(System.in);
        // This should be validated
        System.out.println("Enter your username");
        String user = newScanner.nextLine();
        System.out.println("Enter your Password");
        String password = newScanner.nextLine();
        
        String mealPlanning = "mealPlanning";
        String arcadeGames = "arcadeGames";
        String videoGameSystems = "videoGameSystems";
        
        Connection mealPlanningConnection = getMySQLConnection(mealPlanning, user, password);
        Connection arcadeConnection = getMySQLConnection(arcadeGames, user, password);
        Connection videoGameConnection = getMySQLConnection(videoGameSystems, user, password); 

            
        }    
    
    
} //end all 
