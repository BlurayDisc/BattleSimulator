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

        player = new Warrior("Player One");
        player.setBaseHp(10);
        player.setBaseDamage(1);
        player.setBaseAttackSpeed(2.0);
        player.setBaseArmour(0);
        player.setVitality(3);
        player.setStrength(3);
        player.setAgility(1);
        player.setIntelligence(1);
        player.initialise();

        monster = new Monster("Chicken");
        monster.setHp(10);
        monster.setDamage(1);
        monster.setAttackSpeed(3.0);
        monster.setArmour(0);
        monster.initialise();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void test_battle_one() {

        System.out.println("***** BATTLE ONE BEGIN *****");

        System.out.println(player);
        System.out.println(monster);

        System.out.println("***** BATTLE END *****");
    }

}
