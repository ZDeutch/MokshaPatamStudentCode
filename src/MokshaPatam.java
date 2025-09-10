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
        int[] boardLayout = new int[boardsize];
        boolean[] visited = new boolean[boardsize];
        for (int i = 1; i < boardsize + 1; i++) {
            boardLayout[i] = i;
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
        q.add(boardLayout[1]);
        visited[1] = true;
        int roll = 0;

        while(!q.isEmpty()) {
            int currentNode = q.remove();
            if(currentNode == boardLayout[boardsize]) {
                return roll;
            }

            for(int i = 1; i < 7; i++) {


            }
        }


        //Add the first node, 1, to the queue
        //While there are still nodes left in the queue:
        //	currentNode = queue.remove()
        //	If currentNode == last square, return its roll #!
        //	For each roll (1-6), r:
        //		node = the node r spaces away.
        //		If it is the beginning of a snake/ladder:
        //			node = the ending node of the snake/ladder
        //		If node has never been visited:
        //			Save the # of rolls it took to get to node
        //			Add node to the back of the queue


        return 0;
    }

}


