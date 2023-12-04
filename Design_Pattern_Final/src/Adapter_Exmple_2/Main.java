
/*
Suppose, you have a flathead screwdriver, which is a type of screwdriver. 
Every screwdriver can unscrew bolts and can hammer in bolts. But you do not
have a flathead screwdriver around. You can a knife which is a type of tool.
You can rotate your knife and smash with you knife.
Now, develop the entire system with screw driver adapter so that you can use 
a knife as a flathead screwdriver (rotate method as unscrew and smash method as hammering).
*/
package Adapter_Exmple_2;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        Screwdriver scdvr = new FlatheadScrewdriver();
        scdvr.unscrew();
        
        Tools Churi = new Knife();
        Churi.rotate();
        
        Knife knife = new Knife();
        
        Adapter knifeAdapter = new Adapter(knife);
        knifeAdapter.hammer();
        knifeAdapter.unscrew();
        
    }
    
}
