package com.tutorial;

import com.terminal.Console;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Otong";
        Console.log("Hero Name : " + hero1.getName());

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Ucup";
        hero2.defencePower = 100;
        hero2.display();

        hero2.show();

        Console console = new Console();
        console.setIntConsole(18);
        int angka = console.getIntConsole();
        System.out.println(angka);
    }
}