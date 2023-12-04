
package Adapter_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class Knife implements Tools{

    @Override
    public void rotate() {
        System.out.println("Knife is Roating....");
    }

    @Override
    public void smash() {
        System.out.println("Knife is Smashing....");
    }
    
}
