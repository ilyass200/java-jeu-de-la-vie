package fr.campusacademy.solennprovost.gameoflife;

public class AliveCell implements CellInterface {
    @Override
    public Cell newGeneration(int nbNeighbours) {

        return null;
    }

    @Override
    public String getAsString() {
        return "X";
    }

    @Override
    public Boolean isAlive() {
        return true;
    }
}
