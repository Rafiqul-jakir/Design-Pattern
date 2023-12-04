
package Facade_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class Waiter {
    private DessertMenu dessertmenu;
    private SnacksMenu snacksmenu;

    public Waiter() {
        this.dessertmenu = new DessertMenu();
        this.snacksmenu = new SnacksMenu();
    }
    public void serveDessertMenu(){
        dessertmenu.getDessertMenu();
    }
    
    public void serveSnacksMenu(){
        snacksmenu.getSnackMenu();
    }
}
