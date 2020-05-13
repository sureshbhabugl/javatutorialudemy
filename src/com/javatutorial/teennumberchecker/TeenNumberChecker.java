package com.javatutorial.teennumberchecker;

public class TeenNumberChecker {

    public static boolean hasTeen(int teen1, int teen2, int teen3){
        return ((teen1>=13 && teen1<=19) || (teen2>=13 && teen2<=19) || (teen3>=13 && teen3<=19))? true:false;
    }

    public static boolean isTeen(int teen1){
        return ((teen1>=13 && teen1<=19))? true:false;
    }
}
