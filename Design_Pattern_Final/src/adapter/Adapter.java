
package adapter;

public class Adapter implements SamsungCharger{
    NokiaLumia Charge_Lumia;

    public Adapter(NokiaLumia Charge_Lumia) {
        this.Charge_Lumia = Charge_Lumia;
    }

    @Override
    public void Charger_Sumsung() {
        Charge_Lumia.Charger_Nokaia();
    }
    
}
