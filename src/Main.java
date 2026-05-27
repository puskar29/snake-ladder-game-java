import java.util.Random;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        setupBoard();

        int player1 = 0;
        int player2 = 0;

        boolean gameOver = false;

        System.out.println("===== Snake and Ladder Game =====");

        while (!gameOver) {

            //player 1 turn
            System.out.println("\nPlayer 1 Press Enter to Roll Dice");
            sc.nextLine();
            int dice = rollDice();

            System.out.println("Player 1 rolled: " + dice);

            player1 += dice;

            //check board limit
            if (player1 > 100) {
                player1 -= dice;
            }

            //check snake
            if (snake[player1] != 0){
                System.out.println("Oops! Bitten by Snake!");
                player1 = snake[player1];
            }

            //Check ladder
            else if (ladders[player1] != 0) {
                System.out.println("Great! Climbed a Ladder!");
                player1 = ladders[player1];
            }
            System.out.println("Player 1 Position: " + player1);

            if (player1 == 100){
                System.out.println("\nPlayer 1 Wins!");
                break;
            }

            //Player 2 turn

        }

    }
}