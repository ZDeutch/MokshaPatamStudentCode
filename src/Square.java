public class Square {
    int squareNumber;
    int finalLocation;
    boolean discovered;
    int[][] ladders;
    int[][] snakes;

    public Square(int sN, int fL, boolean d, int[][] l, int[][] s) {
        squareNumber = sN;
        finalLocation = fL;
        discovered = d;
        ladders = l;
        snakes = s;

        for(int i = 0; i < ladders.length; i++) {
            // Check whether there is a ladder at that location
            // If so, update the finalLocation variable to reflect the destination of the ladder
        }
        for(int i = 0; i < snakes.length; i++) {
            // Check whether there is a snake at that location
            // If so, update the finalLocation variable to reflect the destination of the snake
        }
    }





}
