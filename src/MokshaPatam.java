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
        for(int i = 1; i < boardsize + 1; i++) {
            boardLayout[i] = i;
        }

        // I need to iterate through the snakes and ladders
        // If there is a snake at the location, then I should make the square hold what the outcome value is
        // Do the same thing for the ladder

        // Then I need to think about whether a queue or a stack would be better for this
            // After reviewing notes from last year, queue is better because it looks at every next move and will therefore find the most efficient path


        // That said, I am not sure how I would set up the queue
            // I will need to track how many moves I have taken, and something to make sure I havent already gone over the square




        return 0;
    }
}

