package org.example.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    /**
     * Probamos cuando el jugador pierde.
     */
    @Test
    public void loosesWhenDiceNumberIsTooLow() {
        /**
         * Creamos un mock para simular la tirada del dado aleatoriamente.
         */
        Dice dice = Mockito.mock(Dice.class);
        /**
         * Con when estamos diciendo que cuando el dado haga un roll,
         * decuelva con thenReturn el valor de 2.
         */
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void winsWhenDiceNumberIsTooBig() {
        /**
         * Creamos un mock para simular la tirada del dado aleatoriamente.
         */
        Dice dice = Mockito.mock(Dice.class);
        /**
         * Con when estamos diciendo que cuando el dado haga un roll,
         * decuelva con thenReturn el valor de 2.
         */
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}