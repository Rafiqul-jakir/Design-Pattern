
package Decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public double cost() {
        return 10.5;
    }

    @Override
    public String description() {
        return "Simple COffe ";
    }
    
    
}
