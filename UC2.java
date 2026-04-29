/**
 * TicTacToe
 * Combines UC1 (Board Initialization) and UC2 (Toss and Symbol Assignment).
 */
public class tictactoe {

    // --- State Variables ---
    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. 
     * Executes the setup steps for the Tic-Tac-Toe game.
     */
    public static void main(String[] args) {
        System.out.println("Initializing the game board...");
        initializeBoard();
        printBoard();
        
        System.out.println("\nExecuting the coin toss...");
        tossAndAssignSymbols();
        displayTossResult();
    }

    // ==========================================
    // UC1 Methods: Board Initialization & Output
    // ==========================================

    /**
     * Initializes the 3x3 board by filling each cell with '-'
     */
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }

    /**
     * Prints the Tic-Tac-Toe board using horizontal and vertical separators
     */
    static void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println(); 
            System.out.println("-------------");
        }
    }

    // ==========================================
    // UC2 Methods: Coin Toss & Symbol Assignment
    // ==========================================

    /**
     * Uses random logic to decide the first player and assigns symbols
     */
    static void tossAndAssignSymbols() {
        // Generate a random number (0 or 1) to simulate a coin toss
        int toss = (int) (Math.random() * 2);

        // The player who goes first gets 'X'
        if (toss == 1) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            computerSymbol = 'X';
            humanSymbol = 'O';
        }
    }

    /**
     * Displays the toss result and symbol assignments
     */
    static void displayTossResult() {
        System.out.println("--- Toss Result ---");
        if (isHumanTurn) {
            System.out.println("The Human won the toss and will play first.");
        } else {
            System.out.println("The Computer won the toss and will play first.");
        }
        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("-------------------");
    }
}
