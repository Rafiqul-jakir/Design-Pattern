
package Poxy;

/**
 *
 * @author Rafiqul Jakir
 */
public class SensitiveInformationProxy implements SensitiveInformation{
    private RealSensitiveInformation realSubject;
    private RealSensitiveInformation getRealSubject(){
        if(realSubject == null){
            realSubject = new RealSensitiveInformation();
        }
        return realSubject;
    }

    @Override
    public void access() {
        System.out.println("Proxy is controlling Access");
        getRealSubject().access();
    }
    
}
