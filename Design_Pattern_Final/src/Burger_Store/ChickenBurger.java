/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Burger_Store;

/**
 *
 * @author Rafiqul Jakir
 */
public class ChickenBurger implements Burger{

    @Override
    public int price() {
       return 150;
    }

    @Override
    public String description() {
        return "Simple Chicken Burger";
    }
    
}
