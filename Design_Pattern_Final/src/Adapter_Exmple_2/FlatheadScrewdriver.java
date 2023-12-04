
package Adapter_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class FlatheadScrewdriver implements Screwdriver{

    @Override
    public void unscrew() {
        System.out.println("Flathead Screwdriver unscrewing...");
    }

    @Override
    public void hammer() {
        System.out.println("Flathead Screwdriver Hammering...");
    }
    
}
