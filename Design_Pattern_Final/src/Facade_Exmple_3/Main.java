/*
/*
Suppose you want to buy a bag from an online page named “abc” who has three types of bags.
You talk with the page moderator and order a bag. Page moderator notes customers information, 
process the order and handles all the works of billing and shipping. You have no idea about the 
complexities of the ordering system as they are hidden by the page providing page moderator. You 
just place order to page moderator and get your staff. 
Now develop the code from the given scenario using appropriate design patterns.
*/
*/
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
