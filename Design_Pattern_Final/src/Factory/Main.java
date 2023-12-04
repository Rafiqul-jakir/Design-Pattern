
package Factory;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        ProductFactory Factory_1 = new ChanachurFactory();
        ProductFactory Factory_2 = new JhalmuriFactroy();
        
        Product product_1 = Factory_1.CreateProduct();
        product_1.create();
        
        Product product_2 = Factory_2.CreateProduct();
        product_2.create();
    }
    
}
