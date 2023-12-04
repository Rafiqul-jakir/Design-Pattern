
/*
Suppose you have a burger store where you sell two types of burgers - chicken burgers and beef burger. 
Customers can add extra cheese if they want with any type of burger.
Now develop the code using the appropriate design pattern.
*/
package Burger_Store;

import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author Rafiqul Jakir
 */
public class Burger_Store {
    public static void main(String[] args) {
        Burger chickenBurger = new ChickenBurger();
        System.out.println("Price: " +chickenBurger.price()+ ", Description: " + chickenBurger.description());
        
        Burger beepBurger = new BeefBurger();
        System.out.println("Price: " +beepBurger.price()+ ", Description: " + beepBurger.description());
        
        Burger ExtraChickenCheese = new AddCheese(chickenBurger);
        System.out.println("Price: " +ExtraChickenCheese.price()+ ", Description: " + ExtraChickenCheese.description());
        
        Burger ExtreBeepCheese = new AddCheese(beepBurger);
        System.out.println("Price: " +ExtreBeepCheese.price()+ ", Description: " + ExtreBeepCheese.description());
        
        
    }
}
