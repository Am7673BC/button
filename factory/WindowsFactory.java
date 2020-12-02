package com.test.car.factory;

import com.test.car.buttons.Button;
import com.test.car.buttons.MacOsButton;
import com.test.car.buttons.WindowsButton;
import com.test.car.checkbox.Checkbox;
import com.test.car.checkbox.MacOsCheckBox;
import com.test.car.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
