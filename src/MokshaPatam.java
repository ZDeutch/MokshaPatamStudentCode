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


        // Then I need to think about whether a queue or a stack would be better for this
        // After reviewing notes from last year, queue is better because it looks at every next move and will therefore find the most efficient path


        // That said, I am not sure how I would set up the queue
        // I will need to track how many moves I have taken, and something to make sure I havent already gone over the square


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


