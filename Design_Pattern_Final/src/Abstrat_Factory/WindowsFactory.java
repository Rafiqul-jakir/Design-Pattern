
package Abstrat_Factory;

/**
 *
 * @author Rafiqul Jakir
 */
public class WindowsFactory implements GUIFactory{

    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox CreacteCheckBox() {
       return new WindowsCheckBox();
    }
    
}
