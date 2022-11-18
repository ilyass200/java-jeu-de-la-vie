package fr.campusacademy.solennprovost.gameoflife;

import java.util.Arrays;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Game of life project");
        World board = new World(7, 7);
        int nbColumn = board.getNbColumn();
        int nbRow = board.getNbRow();
        board.generateBoardStart(nbColumn,nbRow);

    }
}
