
package Poxy;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        RealSensitiveInformation realSubject = new RealSensitiveInformation();
        realSubject.access();
        
        SensitiveInformationProxy proxy = new SensitiveInformationProxy();
        proxy.access();
    }
    
}
