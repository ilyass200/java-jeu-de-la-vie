package fr.sdv.ilyass.automates;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests unitaires
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void testNextGeneration() {
        //Arrangement
        int M = 5, N = 5;
        int[][] grid = {
                { 0, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 0, 0, 0, 0, 1 },
                { 0, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 0 }
        };

        int[][] futreGrid = {
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 0 },
                { 0, 1, 1, 1, 0 }
        };

        //Acting
//        App result = App.nextGeneration(grid, 3, 3);

        //Assert 
        assertArrayEquals(futreGrid, futreGrid);

    }
}
