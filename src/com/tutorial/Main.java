package com.tutorial;

import static com.terminal.Console.log;;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Otong";
        log("Hero Name : " + hero1.getName());

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Ucup";
        hero2.defencePower = 100;
        hero2.display();
    }
}