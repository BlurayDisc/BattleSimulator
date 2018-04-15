package com.soulfarmer.battlesimulator.entity.unit;

public class Warrior extends Unit {

    private double VIT_HP_MULTIPLIER = 5;

    private double VIT_ARMOUR_MULTIPLIER;

    private double STR_DMG_MULTIPLIER = 1.5;

    private double AGI_DMG_MULTIPLIER = 0.3;

    private double AGI_AS_MULTIPLIER = 0.07;

    public Warrior(String name) {

        super(name);
    }

    @Override
    public void calcHp() {

        this.hp = baseHp + (int) (Math.floor(vitality * VIT_HP_MULTIPLIER));
        this.currentHp = currentHp > 0 ? currentHp : hp;
    }

    @Override
    public void calcDamage() {

        this.damage = baseDamage + (int) (Math.floor(strength * STR_DMG_MULTIPLIER)) + (int) (Math.floor(agility * AGI_DMG_MULTIPLIER));
    }

    @Override
    public void calcAttackSpeed() {

        this.attackSpeed = baseAttackSpeed + (int) (Math.floor(agility * AGI_AS_MULTIPLIER));
    }

    @Override
    public void calcArmour() {

        this.armour = baseArmour + (int) (Math.floor(vitality * VIT_ARMOUR_MULTIPLIER));
    }

}
