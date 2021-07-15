package com.terminal;

public class Console {
    private int intConsole;

    public Console(){
        this.intConsole = 0;
    }

    public static void log(String message){
        System.out.println(message);
    }

    public void setIntConsole(int value){
        this.intConsole = value;
    }

    public int getIntConsole(){
        return this.intConsole;
    }

}