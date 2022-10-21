/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08_abstractfactory;

/**
 *
 * @author Chris Canenguez
 */
public class ProfessionalFactory implements OutfitFactory
{
    @Override
    public Top showTop()
    {
        return new ProfessionalTop(); // Create professional top.
    } // End showTop.
    
    @Override
    public Pant showPant()
    {
        return new ProfessionalPant(); // Create professional pant.
    } // End showPant.
    
    @Override
    public Shoes showShoes()
    {
        return new ProfessionalShoes(); // Create professional shoes.
    } // End showShoes.
} // End ProfessionalFactory.
