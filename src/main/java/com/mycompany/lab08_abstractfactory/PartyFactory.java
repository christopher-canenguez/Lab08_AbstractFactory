/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08_abstractfactory;

/**
 *
 * @author Chris Canenguez
 */
public class PartyFactory implements OutfitFactory
{
    @Override
    public Top showTop()
    {
        return new PartyTop();
    } // End showTop.
    
    @Override
    public Pant showPant()
    {
        return new PartyPant();
    } // End showPant.
    
    @Override
    public Shoes showShoes()
    {
        return new PartyShoes();
    } // End showShoes.
} // End PartyFactory.
