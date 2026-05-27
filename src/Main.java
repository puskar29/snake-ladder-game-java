import java.util.Random;

public class Main{

    //snake and ladders position
    static int[] snake = new int[101];
    static int[] ladders = new int[101];

    //setup snake and ladders
    public static void setupBoard(){
        //snakes
        snake[99] = 54;
        snake[70] = 55;
        snake[52] = 42;
        snake[25] = 2;

        //ladders
        ladders[6] = 25;
        ladders[11] = 40;
        ladders[60] = 85;
        ladders[46] = 90;
    }

    //method to roll the dice
    public static int rollDice(){
        Random random = new Random();

        return random.nextInt(6) + 1;
    }

    //main method
    public static void main(String[] args) {

    }

}