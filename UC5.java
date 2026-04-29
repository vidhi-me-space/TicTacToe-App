/**
 * TicTacToe
 * UC5: Validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    // 3x3 board initialized with '-'
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    /**
     * Entry point of the program.
     * Tests the validation logic using sample values.
     */
    public static void main(String[] args) {

        printBoard();

        int row = 1;
        int col = 1;

        System.out.println("Checking move at (" + row + ", " + col + ")");

        if (isValidMove(row, col)) {
            System.out.println("Valid move! Placing X...");
            board[row][col] = 'X';
        } else {
            System.out.println("Invalid move!");
        }

        printBoard();
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     * Input: Row, Column
     * Output: true if valid, false otherwise.
     */
    static boolean isValidMove(int row, int col) {

        // Boundary checking
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    /**
     * Displays the current board.
     */
    static void printBoard() {
        System.out.println("Current Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
