package fr.campusacademy.solennprovost.gameoflife;

public interface CellInterface {

    Cell newGeneration(int nbNeighbours);

    String getAsString();

    Boolean isAlive();
}
