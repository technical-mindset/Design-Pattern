package com.DesignPattern.FactoryMethod;

public class OS_Factory {
public static OS getOS(String os){
    if (os != null) {
        if (os.equalsIgnoreCase("IPHONE")) {
            return new IOS();
        }
        else if (os.equalsIgnoreCase("ANDROID")) {
            return new Android();
        }
        else if (os.equalsIgnoreCase("WINDOWS")) {
            return new Windows();
        }
        else if (os.equalsIgnoreCase("LINUX")) {
            return new Linux();
        }
    }
    return null;
}
}
