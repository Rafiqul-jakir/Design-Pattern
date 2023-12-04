
package Decorator;


public class CoffeeStore {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.description());
        
        Coffee milkCoffee = new AddMilk(simpleCoffee);
        System.out.println("Cost: " + milkCoffee.cost() + ", Description: " + milkCoffee.description());
    }
    
}
