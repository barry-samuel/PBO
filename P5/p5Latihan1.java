package com.pbo;

// Player
class Player {
    String name;
    double health;
    int level;
    // Object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// Senjata
class Weapon {
    double attackPower;
    String name;

    Weapon(String name, double attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// Armor
class Armor {
    double defencePower;
    String name;

    Armor(String name, double defencePower) {
        this.name = name;
        this.defencePower = defencePower;
    }

    void display() {
        System.out.println("Armor : " + this.name + " , defence : " + this.defencePower);
    }
}

public class p5Latihan1 {
    public static void main(String[] args) {
        // Membuat object player
        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("Otong", 50);

        // Membuat object weapon
        Weapon pedang = new Weapon("Pedang", 15);
        Weapon ketapel = new Weapon("Ketapel", 1);

        // Membuat object armor
        Armor bajuBesi = new Armor("Baju Besi", 10);
        Armor kaos = new Armor("Kaos", 0);

        // Player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // Player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    }
}
