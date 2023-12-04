
package Abstrat_Factory;

/**
 *
 * @author Rafiqul Jakir
 */
public class Main {
    public static void main(String[] args) {
        GUIFactory windows = new WindowsFactory();
        Button windows_Button = windows.CreateButton();
        windows_Button.Click();
        
        CheckBox windows_CheckBox = windows.CreacteCheckBox();
        windows_CheckBox.check();
        
        
        GUIFactory Mac = new MacFactory();
        Button MacButton = Mac.CreateButton();
        MacButton.Click();
        
        CheckBox MacCheckBox = Mac.CreacteCheckBox();
        MacCheckBox.check();
        
                
    }
    
}
