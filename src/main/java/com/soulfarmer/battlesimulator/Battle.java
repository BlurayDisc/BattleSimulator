package com.soulfarmer.battlesimulator;

import com.soulfarmer.battlesimulator.entity.unit.Unit;

public class Battle {

    private static final int MILLIS_PER_CYCLE = 50;

    private Unit player;

    private Unit monster;

    public Battle(Unit player, Unit monster) {
        this.player = player;
        this.monster = monster;
    }

    public void runLoop() {

        System.out.println("***** BATTLE BEGIN *****");
        System.out.println(player);
        System.out.println(monster);
        System.out.println("************************");

        int playerDelta = 0, monsterDelta = 0;
        for (int i = 0; i < 1000; i++) {

            if (coolDownFinished(player.getAttackSpeed(), playerDelta)) {
                System.out.println(String.format("Time elapsed: %.2f seconds", (double) (i * MILLIS_PER_CYCLE) / 1000));
                player.attack(monster);
                // reset delta
                playerDelta = 0;
            }

            if (coolDownFinished(monster.getAttackSpeed(), monsterDelta)) {
                System.out.println(String.format("Time elapsed: %.2f seconds", (double) (i * MILLIS_PER_CYCLE) / 1000));
                monster.attack(player);
                // reset delta
                monsterDelta = 0;
            }

            if (player.isDead()) {
                System.out.println(String.format("Battle ended, %s is dead!", player));
                break;
            }

            if (monster.isDead()) {
                System.out.println(String.format("Battle ended, %s is dead!", monster));
                break;
            }

            // mehhh, each cpu cycle is 100 milliseconds.
            playerDelta += MILLIS_PER_CYCLE;
            monsterDelta += MILLIS_PER_CYCLE;
        }

        System.out.println("****** BATTLE END ******");
    }

    boolean coolDownFinished(double coolDownSeconds, int deltaMillis) {
        int coolDownMillis = (int) (coolDownSeconds * 1000);
        return deltaMillis >= coolDownMillis;
    }
}
