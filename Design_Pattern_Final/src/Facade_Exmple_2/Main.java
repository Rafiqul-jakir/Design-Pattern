/*
Consider a restaurant that has two sections - snacks and dessert. The restaurant has a waiter.
You, as a client want access to different menus of different sections. You do not know what are 
the different menus they have. You just have access to the waiter who knows his restaurant well. 
Whichever menu you want, you tell the waiter and he takes it out of the respective restaurant 
section and hands it over to you. Here, the restaurant hides the complexities of the restaurant.

Now draw the class diagram and build the code using the appropriate design pattern.
*/

package Facade_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        Waiter Abul = new Waiter();
        Abul.serveDessertMenu();
    }
}
