
package Poxy;

/**
 *
 * @author Rafiqul Jakir
 */
public class RealSensitiveInformation implements SensitiveInformation{

    @Override
    public void access() {
        System.out.println("Accessing Sensetive information.....");
    }
    
    
}
