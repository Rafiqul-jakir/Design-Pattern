
package Decorator;


public class AddMilk implements Coffee{
    private Coffee coffee;

    public AddMilk(Coffee coffee) {
        this.coffee = coffee;
    }
    

    @Override
    public double cost() {
        return coffee.cost() + 5.0;
    }

    @Override
    public String description() {
        return coffee.description() + "with Milk";
    }
    
    
}
