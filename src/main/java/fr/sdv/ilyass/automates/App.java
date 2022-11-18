package fr.sdv.ilyass.automates;


public class App {

    public static void main(String[] args) {
        int M = 10, N = 10;

        // Initialisation  
        int[][] grid = {
                { 0, 0, 0, 0, 0, 1, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 1, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 0, 0, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 }

        };


        // Cellule 
        System.out.println("Génération");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print(" | ");
                else if(grid[i][j] == 1)
                    System.out.print(" X ");
            }
            System.out.println();
        }
        System.out.println();

        // Progression de la grille pour 5 créations
        for (int generation = 0; generation < 5; generation++) {
            nextGeneration(grid, M, N);
            System.out.println();
        }
    }

    public static void  nextGeneration(int[][] grid, int M, int N) {
        int[][] future = new int[M][N];

        // Boucle dans chaque cellule
        for (int l = 0; l < M; l++)
        {
            for (int m = 0; m < N; m++)
            {
                // Nombre de voisins qui sont en vie
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        if ((l+i>=0 && l+i<M) && (m+j>=0 && m+j<N))
                            aliveNeighbours += grid[l + i][m + j];

                aliveNeighbours -= grid[l][m];

                // Mise en œuvre des règles de la vie
                if ((grid[l][m] == 1) && (aliveNeighbours < 2))
                    future[l][m] = 0;

                // La cellule meurt à cause de la trop forte population
                else if ((grid[l][m] == 1) && (aliveNeighbours > 3))
                    future[l][m] = 0;

               // Nouvelle cellule
                else if ((grid[l][m] == 0) && (aliveNeighbours == 3))
                    future[l][m] = 1;

               // Reste identique 
                else
                    future[l][m] = grid[l][m];
            }
        }

        System.out.println("generation suivante");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (future[i][j] == 0)
                    System.out.print(" | ");
                else
                    System.out.print(" X ");
            }
        }
    }
}
