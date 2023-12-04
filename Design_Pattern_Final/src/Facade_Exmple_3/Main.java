
package Facade_Exmple_3;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        OrderBag smallBag = new OrderBag();
        smallBag.orderSmallBag();
        
        OrderBag mediumBag = new OrderBag();
        mediumBag.orderMediumBag();
        
        OrderBag largeBag = new OrderBag();
        largeBag.orderLargeBag();
    }
    
}
