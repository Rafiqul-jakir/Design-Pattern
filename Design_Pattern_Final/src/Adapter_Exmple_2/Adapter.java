
package Adapter_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class Adapter implements Screwdriver{
    private Knife knife;

    public Adapter(Knife knife) {
        this.knife = knife;
    }
    

    @Override
    public void unscrew() {
        System.out.println("Unscrew with Knife");
        
       
    }

    @Override
    public void hammer() {
        System.out.println("Hammering with Knife");
        
    }
    
}
