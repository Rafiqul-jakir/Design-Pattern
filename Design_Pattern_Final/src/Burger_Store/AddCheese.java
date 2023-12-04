
package Burger_Store;

/**
 *
 * @author Rafiqul Jakir
 */
public class AddCheese implements Burger{
    private Burger burger;

    public AddCheese(Burger burger) {
        this.burger = burger;
    }
    

    @Override
    public int price() {
       return burger.price() + 10;
        
    }

    @Override
    public String description() {
        return burger.description() + " With Cheese";
    }
    
}
