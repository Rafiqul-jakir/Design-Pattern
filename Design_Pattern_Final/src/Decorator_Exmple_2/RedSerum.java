
package Decorator_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class RedSerum implements Speed{
    private Speed speed;

    public RedSerum(Speed speed) {
        this.speed = speed;
    }
    

    @Override
    public int getSpeed() {
        return speed.getSpeed() * 60;
    }
    
}
