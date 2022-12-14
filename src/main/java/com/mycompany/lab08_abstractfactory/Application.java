/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08_abstractfactory;

/**
 *
 * @author Chris Canenguez.
 */
public class Application 
{
    // Outfit features.
    private Pant pant;
    private Top top;
    private Shoes shoes;
    
    public Application(OutfitFactory factory)
    {
        // Get outfit type based on family.
        pant = factory.showPant();
        top = factory.showTop();
        shoes = factory.showShoes();
    } // End Application.
    
    public void revealOutfit()
    {
        // Display outfit type.
        pant.typeOfPant();
        top.typeOfTop();
        shoes.typeOfShoes();
    } // End revealOutfit.
} // End Application.
