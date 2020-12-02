package com.test.car;

import com.test.car.factory.GUIFactory;
import com.test.car.factory.MacOsFactory;
import com.test.car.factory.WindowsFactory;

public class DemoApplication {
    public static String WINDOWS_TYPE = "WINDOWS_TYPE";
    public static String MACOS_TYPE = "MACOS_TYPE";


    public Application ConfigureApplication(String type){
        Application app;
        GUIFactory factory;
        if (type.equals(WINDOWS_TYPE)){
            factory=new WindowsFactory();

        }else{
            factory= new MacOsFactory();
        }
        app = new Application(factory);
        return app;

    }
}
