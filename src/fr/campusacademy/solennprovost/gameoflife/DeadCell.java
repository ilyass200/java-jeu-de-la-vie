package fr.campusacademy.solennprovost.gameoflife;

public class DeadCell implements CellInterface{

    @Override
    public Cell newGeneration(int nbNeighbours) {
        return null;
    }

    @Override
    public String getAsString() {
        return "-";
    }

    @Override
    public Boolean isAlive() {
        return false;
    }
}
