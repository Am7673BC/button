package com.test.car.factory;

import com.test.car.buttons.Button;
import com.test.car.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();

}
