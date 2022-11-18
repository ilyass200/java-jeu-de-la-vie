package fr.campusacademy.solennprovost.gameoflife;

import java.util.List;

public class Cell {

    Integer column;
    Integer row;
    Boolean isAlive;
    String symbolOnGrid;
    World grid;

//    public int[] neighbours(Integer column, Integer row, int[][] grid){
//        int[] neighbour;
//        if(row == 0){
//            neighbour = {grid[row][column-1], grid[row][column+1], grid[row + 1][column], grid[row + 1][column], grid[row + 1][column-1], grid[row+1][column+1]};
//        }
//        else if (row == 12){ // last row of grid
//            neighbour = {grid[row][column-1], grid[row][column+1], grid[row - 1][column], grid[row - 1][column], grid[row - 1][column-1], grid[row-1][column+1]};
//        }
//        else {
//            neighbour = {grid[row][column-1], grid[row][column+1], grid[row - 1][column], grid[row - 1][column], grid[row - 1][column-1], grid[row-1][column+1], grid[row + 1][column + 1],grid[row + 1][column], grid[row + 1][column - 1]};
//        }
//        return neighbour;
//    }
//
//    public int neighboursAlive(int[] neighbour){
//        int nbAlive = 0;
//        for (int i = 0; i<neighbour.length; i++){
//            if (neighbour[i] == "0"){
//                nbAlive++;
//            }
//        }
//        return nbAlive;
//    }


//    public void generateCell(Integer nbNeighbours,World grid, Integer column, Integer row){
//        if (grid[column][row] == "0"){
//            if(nbNeighbours < 2){
//                DeadCell deadCell = new DeadCell();
//                grid[column][row] = deadCell->getAsString();
//            }
//            else if (nbNeighbours == 2 ||nbNeighbours == 3){
//                AliveCell aliveCell = new AliveCell();
//                grid[column][row] = aliveCell->getAsString();
//            }
//            else if(nbNeighbours > 3){
//                DeadCell deadCell = new DeadCell();
//                grid[column][row] = deadCell->getAsString();
//            }
//        }
//        else{
//            AliveCell aliveCell = new AliveCell();
//            grid[column][row] = aliveCell->getAsString();
//        }
//
//    }
}
