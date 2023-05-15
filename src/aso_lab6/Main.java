package aso_lab6;

import static aso_lab6.Process.isSafe;

public class Main {

    public static void main(String[] args)
    {
        int processes[] = {0, 1, 2, 3, 4};

        // Available instances of resources
        int avail[] = {3, 3, 2};

        // Maximum R that can be allocated
        // to processes
        int maxm[][] = {{7, 5, 3},
                {3, 2, 2},
                {9, 0, 2},
                {2, 2, 2},
                {4, 3, 3}};

        // Resources allocated to processes
        int allot[][] = {{0, 1, 0},
                {2, 0, 0},
                {3, 0, 2},
                {2, 1, 1},
                {0, 0, 2}};

        // Check system is in safe state or not
        isSafe(processes, avail, maxm, allot);
    }

}