/*
In 1942, the Nazis started a new program as a way to win the war. The super soldier protocol.
The idea was to inject soldier with specialized serum that will enable the soldiers with different
kinds of new abilities. The red serum can increase a soldiers speed up to 60 times. The blue serum 
can increase a soldiers speed up to 80 times. The speed of an average human is 13 km/h.

Now develop the code from the above scenario using appropriate design pattern.
*/
package Decorator_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        Speed normalSpeed = new NormalSerum();
        System.out.println("NormalSerum Speed = " + normalSpeed.getSpeed());
        
        Speed RedSerumSpeed = new RedSerum(normalSpeed);
        System.out.println("Red Serum Speed = " + RedSerumSpeed.getSpeed());
        
        Speed BlueSerumSpeed = new BlueSerum(normalSpeed);
        System.out.println("Red Serum Speed = " + BlueSerumSpeed.getSpeed());
        
    }
    
}
