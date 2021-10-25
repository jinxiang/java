package com.hmmloo.cleancraftmanship.chap03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game game;

    @BeforeEach
    public void setup() {
        game = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void gutterGame() {
        rollMany(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() throws Exception {
        rollMany(1, 20);
        assertEquals(20, game.score());
    }

    @Test
    public void oneSpare() throws Exception {
        rollMany(2, 5); // spare
        game.roll(7);
        rollMany(17, 0);
        assertEquals(24, game.score());
    }
}
