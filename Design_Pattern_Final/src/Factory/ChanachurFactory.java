
package Factory;

/**
 *
 * @author Rafiqul Jakir
 */
public class ChanachurFactory implements ProductFactory{

    @Override
    public Product CreateProduct() {
       return new Chanachur();
    }
    
}
