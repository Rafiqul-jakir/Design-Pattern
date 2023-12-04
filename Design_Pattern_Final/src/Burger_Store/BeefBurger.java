
package Burger_Store;

/**
 *
 * @author Rafiqul Jakir
 */
public class BeefBurger implements Burger{

    @Override
    public int price() {
        return 180;
    }

    @Override
    public String description() {
        return "Special Beep Burger";
    }
    
    
}
