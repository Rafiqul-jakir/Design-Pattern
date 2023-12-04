
package adapter;

public class Main {
    public static void main(String[] args) {
        NokiaLumia nokialumia = new NokiaLumia();
        nokialumia.Charger_Nokaia();
        
        Sumsung_S23_Ultra sumsungS23 = new Sumsung_S23_Ultra();
        sumsungS23.Charger_Sumsung();
        
        Adapter nokiaAdapter = new Adapter(nokialumia);
        nokiaAdapter.Charger_Sumsung();
        
        
        
    }
    
}
