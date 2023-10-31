package com.xworks.business;

public class TubeLight extends Switch{
    @Override
    public void sOn(){
        System.out.println("the light is turned on");
    }
    @Override
    public void sOff(){
        System.out.println("the light is turned off");
    }
}
