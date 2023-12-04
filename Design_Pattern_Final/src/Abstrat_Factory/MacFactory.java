
package Abstrat_Factory;

/**
 *
 * @author Rafiqul Jakir
 */
public class MacFactory implements GUIFactory{

    @Override
    public Button CreateButton() {
       return new MacButton();
    }

    @Override
    public CheckBox CreacteCheckBox() {
        return new MacCheckBox();
    }
    
}
