package com.pbo;

// Inheritance adalah hubungan is-a
public class p6PengenalanInheritance {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "ucup";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Otong";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Michael";
        hero3.display();
    }
}
