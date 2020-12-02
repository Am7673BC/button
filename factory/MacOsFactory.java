package com.test.car.factory;

import com.test.car.buttons.Button;
import com.test.car.buttons.MacOsButton;
import com.test.car.checkbox.Checkbox;
import com.test.car.checkbox.MacOsCheckBox;

import javax.crypto.Mac;

public class MacOsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOsCheckBox();
    }
}
