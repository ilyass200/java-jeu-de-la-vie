package fr.campusacademy.solennprovost.gameoflife;

import java.util.Random;

public class World {

    public Integer nbColumn;
    public Integer nbRow;

    public World(Integer nbColumn, Integer nbRow){
        this.nbColumn = nbColumn;
        this.nbRow = nbRow;
    }

    public Integer getNbColumn() {
        return nbColumn;
    }

    public void setNbColumn(Integer nbColumn) {
        this.nbColumn = nbColumn;
    }

    public Integer getNbRow() {
        return nbRow;
    }

    public void setNbRow(Integer nbRow) {
        this.nbRow = nbRow;
    }

    @Override
    public String toString() {
        return "World{" +
                "nbColumn=" + nbColumn +
                ", nbRow=" + nbRow +
                '}';
    }

    // affichage board vide
    public void generateBoardStart(int nbColumn, int nbRow){
        String[][] boardGame = new String[nbColumn][nbRow];
        for (int i = 0; i < nbColumn; i++){
            for (int j=0; j<nbRow; j++){
                CellInterface cellRandom = getRandomCell();
                String symbolCell = cellRandom.getAsString();
                System.out.print(boardGame[i][j] = symbolCell);
            }
            System.out.println();
        }
    }

    public CellInterface getRandomCell(){
        if (new Random().nextBoolean()) {
            return new AliveCell();
        } else {
            return new DeadCell();
        }
    }

    public int[] neighbours(Integer column, Integer row, int[][] grid){
        int[] neighbour;
        if(row == 0 && column > 0 && column < this.nbColumn){
            neighbour = new int[]{grid[row][column - 1], grid[row][column + 1],
                    grid[row + 1][column], grid[row + 1][column - 1], grid[row + 1][column + 1],
                    grid[this.nbRow - 1][column],grid[this.nbRow -1][column-1], grid[this.nbRow - 1][column+1]};
        }
        else if (row.equals(this.nbRow -1) && column > 0 && column < this.nbColumn ){
            neighbour = new int[]{grid[row][column - 1], grid[row][column + 1],
                    grid[row - 1][column], grid[row - 1][column - 1], grid[row - 1][column + 1],
                    grid[0][column], grid[0][column - 1], grid[0][column + 1]};
        }
        else if (column == 0 && row > 0 && row < this.nbRow){
            neighbour = new int[]{grid[row][column + 1], grid[row][this.nbColumn -1],
                    grid[row - 1][column], grid[row - 1][this.nbColumn - 1], grid[row - 1][column + 1],
                    grid[row + 1][column], grid[row + 1][this.nbColumn - 1], grid[row + 1][column + 1]};
        }
        else if (column.equals(this.nbColumn - 1)){
            neighbour = new int[]{grid[row][column - 1], grid[row][0],
                    grid[row - 1][column], grid[row - 1][column - 1], grid[row - 1][0],
                    grid[row + 1][column], grid[row + 1][column - 1], grid[row + 1][0]};
        }
        else if (row == 0 && column.equals(this.nbColumn)){
            neighbour = new int[]{grid[row ][column - 1], grid[row][0],
                    grid[row + 1][column], grid[row + 1][column - 1], grid[row + 1][0],
                    grid[this.nbRow-1][column], grid[this.nbRow-1][column - 1], grid[this.nbRow-1][0]};
        }
        else if (row == 0 && column == 0){
            neighbour = new int[]{grid[row ][column + 1], grid[row][this.nbColumn-1],
                    grid[row + 1][column], grid[row + 1][this.nbColumn-1], grid[row + 1][column + 1],
                    grid[this.nbRow-1][column], grid[this.nbRow-1][column + 1], grid[this.nbRow-1][this.nbColumn -1]};
        }
//        else if (row.equals(this.nbRow) && column.equals(this.nbColumn)){
//            neighbour = new int[]{grid[row ][column - 1], grid[row][0],
//                    grid[row + 1][column], grid[row + 1][column - 1], grid[row + 1][0],
//                    grid[this.nbRow-1][column], grid[this.nbRow-1][column - 1], grid[this.nbRow-1][0]};
//        }

        else {
            neighbour = new int[]{grid[row][column - 1], grid[row][column + 1], grid[row - 1][column], grid[row - 1][column], grid[row - 1][column - 1], grid[row - 1][column + 1], grid[row + 1][column + 1], grid[row + 1][column], grid[row + 1][column - 1]};
        }
        return neighbour;
    }

    void nextGeneration(){

    }
}
