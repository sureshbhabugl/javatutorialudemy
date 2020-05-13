package com.javatutorial.barkingdog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
            boolean action=false;

            if(hourOfDay<0||hourOfDay>23){
                action=false;
            }else if((hourOfDay<8 && barking) ||(hourOfDay>22 && barking)){
                action=true;
            }
            return action;

    }
}
