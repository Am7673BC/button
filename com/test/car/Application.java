package com.test.car;

import com.test.car.buttons.Button;
import com.test.car.checkbox.Checkbox;
import com.test.car.factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        checkbox.paint();
        button.paint();
    }

}
