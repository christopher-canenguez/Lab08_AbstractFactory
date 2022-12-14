/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08_abstractfactory;

/**
 *
 * @author Chris Canenguez
 */
public class CasualFactory implements OutfitFactory
{
    @Override
    public Top showTop()
    {
        return new CasualTop(); // Create casual top.
    } // End showTop.
    
    @Override
    public Pant showPant()
    {
        return new CasualPant(); // Create casual pant.
    } // End showPant.
    
    @Override
    public Shoes showShoes()
    {
        return new CasualShoes(); // Create casual shoes.
    } // End showShoes.
} // End CasualFactory.
