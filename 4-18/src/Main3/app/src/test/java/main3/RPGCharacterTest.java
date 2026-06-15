package main3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RPGCharacterTest {

    RPGCharacter character = new RPGCharacter();


    @Test
    void testInitialStatus() {
        assertEquals(1, character.getLevel(),"このキャラクターのレベルは1のはず");
        assertEquals(100, character.getHP(),"このキャラクターのHPは100のはず");
        assertEquals(50, character.getMP(),"このキャラクターのMPは50のはず");
    }

    @Test
    void testNormalLevelUp() {
        character.levelUp();

        assertEquals(2, character.getLevel(),"このキャラクターのレベルは2のはず");
        assertEquals(110, character.getHP(),"このキャラクターのHPは110のはず");
        assertEquals(55, character.getMP(),"このキャラクターのMPは55のはず");
    }

    @Test
    void testMaxLevel() {
        for (int i = 0; i < 97 ; i++) {
            character.levelUp();
        }
        character.levelUp();
        try {
            character.levelUp();
            fail ("最大レベルで例外が発生するはず");
        } catch (IllegalStateException e) {
            assertEquals("最大レベルに達しています", e.getMessage());
            // TODO: handle exception
        }
        
        //assertThrows(IllegalArgumentException.class,() -> character.levelUp(), "最大レベルで例外が発生するはず");

        assertEquals(99, character.getLevel(),"このキャラクターのレベルは99のはず");
        assertEquals(1080, character.getHP(),"このキャラクターのHPは1080のはず");
        assertEquals(540, character.getMP(),"このキャラクターのMPは540のはず");
    }
}
