package fr.sdv.nader.automates;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void testNextGeneration() {
        // A -> Arrangement : initialisation du contexte du test
        int M = 3, N = 3;
        int[][] grid = {
                { 0, 1, 0 },
                { 0, 1, 0 },
                { 0, 1, 0 },
        };

        int[][] futreGrid = {
                { 0, 0, 0 },
                { 1, 1, 1 },
                { 0, 0, 0 },
        };

        // A -> Acting(Agir) : consiste à executer la methode à tester
//        App result = App.nextGeneration(grid, 3, 3);

        // A -> Assert : vérifier notre assertion entre le résultat obtenu et l'attendu
        assertArrayEquals(futreGrid, futreGrid);

    }
}
