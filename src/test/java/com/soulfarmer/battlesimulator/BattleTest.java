package com.soulfarmer.battlesimulator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.soulfarmer.battlesimulator.entity.unit.Monster;
import com.soulfarmer.battlesimulator.entity.unit.Warrior;

@RunWith(BlockJUnit4ClassRunner.class)
public class BattleTest {

    private Warrior player;

    private Monster monster;

    @Before
    public void prepare() {

        player = new Warrior("Warrior");
        player.setBaseHp(10);
        player.setBaseDamage(1);
        player.setBaseAttackSpeed(3);
        player.setBaseArmour(0);
        player.setVitality(3);
        player.setStrength(3);
        player.setAgility(1);
        player.setIntelligence(1);
        player.initialise();

        monster = new Monster("Chicken");
        monster.setHp(10);
        monster.setCurrentHp(10);
        monster.setDamage(1);
        monster.setAttackSpeed(1.0);
        monster.setArmour(0);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void test_battle() {

        Battle battle = new Battle(player, monster);
        battle.runLoop();
    }

    @Test
    public void test_attack_cooldown() {

        Battle battle = new Battle(player, monster);
        assertThat(player.getAttackSpeed(), is(2.93));
        assertThat(monster.getAttackSpeed(), is(1.0));

        boolean finished = battle.coolDownFinished(player.getAttackSpeed(), 1000);
        assertThat(finished, is(false));

        finished = battle.coolDownFinished(player.getAttackSpeed(), 2000);
        assertThat(finished, is(false));

        finished = battle.coolDownFinished(player.getAttackSpeed(), 3000);
        assertThat(finished, is(true));
    }

}
