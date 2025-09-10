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

    /**
     * TODO: Complete this function, fewestMoves(), to return the minimum number of moves
     *  to reach the final square on a board with the given size, ladders, and snakes.
     */
    public static int fewestMoves(int boardsize, int[][] ladders, int[][] snakes) {
        int[] boardLayout = new int[boardsize + 1];
        boolean[] visited = new boolean[boardsize + 1];
        int[] rolls = new int[boardsize + 1];
        for (int i = 1; i < boardsize + 1; i++) {
            boardLayout[i - 1] = i;
        }

        for (int i = 0; i < ladders.length; i++) {
            int location = ladders[i][0];
            int destination = ladders[i][1];
            boardLayout[location] = destination;
        }

        for (int i = 0; i < snakes.length; i++) {
            int location = snakes[i][0];
            int destination = snakes[i][1];
            boardLayout[location] = destination;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;


        while(!q.isEmpty()) {
            int currentNode = q.remove();
            int nextNode;
            for(int i = 1; i < 7; i++) {

                if(currentNode == boardsize) {
                    return rolls[currentNode];
                }

                nextNode = currentNode + i;

                if(nextNode > boardsize) {
                    continue;
                }
                if(!visited[nextNode]) {
                    q.add(nextNode);
                    rolls[nextNode] = rolls[currentNode] + 1;
                    visited[nextNode] = true;
                }

            }
        }

        return -1;
    }

}


