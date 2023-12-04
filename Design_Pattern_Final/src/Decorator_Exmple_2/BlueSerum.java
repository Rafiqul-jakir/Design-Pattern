
package Decorator_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class BlueSerum implements Speed{
    private Speed speed;

    public BlueSerum(Speed speed) {
        this.speed = speed;
    }
    

    @Override
    public int getSpeed() {
        return speed.getSpeed()* 80;
    }
    
}
