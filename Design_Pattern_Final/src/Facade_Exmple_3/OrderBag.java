
package Facade_Exmple_3;

/**
 *
 * @author Rafiqul Jakir
 */
public class OrderBag {
    private SmallBag smallbag;
    private MediumBag mediumbag;
    private LargeBag largebag;

    public OrderBag() {
        this.smallbag = new SmallBag();
        this.mediumbag = new MediumBag();
        this.largebag = new LargeBag();
    }
    public void orderSmallBag(){
        smallbag.pack();
    }
    
    public void orderMediumBag(){
        mediumbag.pack();
    }
    public void orderLargeBag(){
        largebag.pack();
    }
}
