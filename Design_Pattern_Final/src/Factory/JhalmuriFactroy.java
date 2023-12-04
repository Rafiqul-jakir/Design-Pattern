
package Factory;

/**
 *
 * @author Rafiqul Jakir
 */
public class JhalmuriFactroy implements ProductFactory{

    @Override
    public Product CreateProduct() {
      return new Jhalmuri();
    }
    
}
