import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Moksha Patam
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *
 * Completed by: Zander Deutch
 * September 4, 2025
 */

public class MokshaPatam {

    // Method to find the smallest number of moves in a given boardsize
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        // Initialize a map which is 1 greater than the size of the board to account for the 0 index being unfilled
        int[] boardLayout = new int[boardsize + 1];

        // Every square is unvisited so the initialized board is entirely false
        boolean[] visited = new boolean[boardsize + 1];

        // You can track the node journey using an array so you can recursively track the amount of steps it took
        int[] rolls = new int[boardsize + 1];

        // Initialize the array so that the index and value are equal
        for (int i = 1; i < boardsize + 1; i++) {
            boardLayout[i] = i;
        }

        // Increment through each ladder
        for (int i = 0; i < ladders.length; i++) {
            int location = ladders[i][0];
            int destination = ladders[i][1];

            // If the starting location matches a spot on the board, update that index to hold the destination of the ladder
            boardLayout[location] = destination;
        }

        // Increment through each snake
        for (int i = 0; i < snakes.length; i++) {
            int location = snakes[i][0];
            int destination = snakes[i][1];

            // If the starting location matches a spot on the board, update that index to hold the destination
            boardLayout[location] = destination;
        }


        // Create the Queue to begin BFS
        Queue<Integer> q = new LinkedList<>();

        // Start by adding the first square to the queue
        q.add(1);

        // Set that squares status to visited
        visited[1] = true;


        // While there are squares in the queue
        while(!q.isEmpty()) {

            // Remove the current node
            int currentNode = q.remove();
            int nextNode;

            // If the node is the final square, then return the amount of rolls it took
            if(currentNode == boardsize) {
                return rolls[currentNode];
            }


            // For each roll 1-6
            for(int i = 1; i < 7; i++) {


                // Set your next node to be whatever the outcome of that roll was
                nextNode = currentNode + i;

                // If it is greater than the board then you stay where you are
                if(nextNode > boardsize) {
                    continue;
                }

                // Otherwise as long as you haven't visited the square
                if(!visited[nextNode]) {
                    // Add the next one to your queue
                    q.add(boardLayout[nextNode]);
                    // Increment your amount of rolls by 1
                    rolls[boardLayout[nextNode]] = rolls[boardLayout[currentNode]] + 1;

                    // Set the next location as visited
                    visited[nextNode] = true;

                    // Set the destination of the next location as visited
                    visited[boardLayout[nextNode]] = true;
                }

            }
        }

        return -1;
    }

}


