/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08_abstractfactory;
import java.util.Scanner;

/**
 *
 * @author Chris Canenguez
 */
public class DriverClass 
{
    private static Application configureApp()
    {
        Application app = null;
        OutfitFactory factory;
        
        Scanner scan = new Scanner(System.in); // Create scanner object.
        System.out.println("What kind of outfit do you desire? Please enter 'professional', 'casual' or 'party' here: ");
        String outfitType = scan.nextLine(); // Read user input.
        
        switch(outfitType)
        {
            case "professional":
                factory = new ProfessionalFactory();
                app = new Application(factory);
                break;
            case "casual":
                factory = new CasualFactory();
                app = new Application(factory);
                break;
            case "party":
                factory = new PartyFactory();
                app = new Application(factory);
                break;
        } // End switch.
        
        return app;
    } // End configureApp.
    
    public static void main(String[] args)
    {
        Application app = configureApp();
        app.revealOutfit();
    } // End main.
} // End DriverClass.
