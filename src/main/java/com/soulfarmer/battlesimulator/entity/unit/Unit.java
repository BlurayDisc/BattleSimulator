package com.soulfarmer.battlesimulator.entity.unit;

import java.util.List;

import com.soulfarmer.battlesimulator.entity.Item;

public abstract class Unit {

    private String name;

    protected int currentHp;

    private List<Item> items;

    /***************************************************************************
     * 
     * Stats
     * 
     **************************************************************************/

    protected int hp;

    protected int damage;

    protected int armour;

    protected double attackSpeed;

    /***************************************************************************
     * 
     * Attributes
     * 
     **************************************************************************/

    protected int vitality;

    protected int strength;

    protected int agility;

    protected int intelligence;

    /***************************************************************************
     * 
     * Base Stats
     * 
     **************************************************************************/

    protected int baseHp;

    protected int baseDamage;

    protected int baseArmour;

    protected double baseAttackSpeed;

    public Unit(String name) {

        this.name = name;
    }

    public void initialise() {

        calcHp();
        calcDamage();
        calcAttackSpeed();
        calcArmour();
    }

    public abstract void calcHp();

    public abstract void calcDamage();

    public abstract void calcAttackSpeed();

    public abstract void calcArmour();

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCurrentHp() {

        return currentHp;
    }

    public void setCurrentHp(int currentHp) {

        this.currentHp = currentHp;
    }

    public List<Item> getItems() {

        return items;
    }

    public void setItems(List<Item> items) {

        this.items = items;
    }

    public int getHp() {

        return hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public int getDamage() {

        return damage;
    }

    public void setDamage(int damage) {

        this.damage = damage;
    }

    public int getArmour() {

        return armour;
    }

    public void setArmour(int armour) {

        this.armour = armour;
    }

    public double getAttackSpeed() {

        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {

        this.attackSpeed = attackSpeed;
    }

    public int getVitality() {

        return vitality;
    }

    public void setVitality(int vitality) {

        this.vitality = vitality;
    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public int getAgility() {

        return agility;
    }

    public void setAgility(int agility) {

        this.agility = agility;
    }

    public int getIntelligence() {

        return intelligence;
    }

    public void setIntelligence(int intelligence) {

        this.intelligence = intelligence;
    }

    public int getBaseHp() {

        return baseHp;
    }

    public void setBaseHp(int baseHp) {

        this.baseHp = baseHp;
    }

    public int getBaseDamage() {

        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {

        this.baseDamage = baseDamage;
    }

    public int getBaseArmour() {

        return baseArmour;
    }

    public void setBaseArmour(int baseArmour) {

        this.baseArmour = baseArmour;
    }

    public double getBaseAttackSpeed() {

        return baseAttackSpeed;
    }

    public void setBaseAttackSpeed(double baseAttackSpeed) {

        this.baseAttackSpeed = baseAttackSpeed;
    }

    @Override
    public String toString() {

        return String.format("Unit [name=%s, currentHp=%s/%s]", name, currentHp, hp);
    }

}
