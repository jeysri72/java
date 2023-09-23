
import java.util.Scanner;

// 1. Create a 3x3 grid as the game board.

// 2. Initialize the grid with empty spaces to represent unmarked cells.

// 3, Display the empty game board to the players.

// 4. Define two players, typically "X" and "O".

// 5. Repeat the following steps until the game ends:

// a. Ask the current player for their move (row and column).
// b. Check if the chosen cell is empty. If not, ask the player to choose again.
// c. Mark the chosen cell with the current player's symbol.
// d. Check if the current player has won the game (3 in a row horizontally, vertically, or diagonally) or if the game is a draw (no empty cells left). If so, end the game.
// e. Switch to the other player.
// 6. Display the final game board and the result (win, draw, or ongoing) to the players.
public class TicTacToe {
    public static void main(String[] args) {
        // Setup the board using array and initialize it with caharacter
        char[][] board = new char[3][3]; // 1. Create a 3x3 grid as the game board.
                                         

        char currentPlayer = 'X';
        boolean gameWon = false;

        initializeBoard(board);

        while (true) {
            // Step 3: Display the game board
            displayBoard(board);
            
            // Step 5a: Ask the current player for their move (row and column)
            int[] move = getPlayerMove(board, currentPlayer);
            int row = move[0];
            int col = move[1];

            if (isValidMove(board, row, col)) {
                // Step 5c: Mark the chosen cell with the current player's symbol
                board[row][col] = currentPlayer;

                if (checkWin(board, currentPlayer)) {
                    // Step 5d: Check if the current player has won
                    displayBoard(board);
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameWon = true;
                    break;
                } else if (isBoardFull(board)) {
                    // Step 5d (continued): Check if the game is a draw
                    displayBoard(board);
                    System.out.println("It's a draw!");
                    break;
                }

                // Step 5e: Switch to the other player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    public static void initializeBoard(char[][] board) {
        // Step 2: Initialize the grid with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        // Step 3: Display the game board
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static int[] getPlayerMove(char[][] board, char currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        // Step 5a: Ask the current player for their move (row and column)
        System.out.print("Player " + currentPlayer + ", enter your move (row between 0 and 2): ");
        int row = scanner.nextInt();
        System.out.print("Player " + currentPlayer + ", enter your move (column between 0 and 2): ");
        int col = scanner.nextInt();
        return new int[] { row, col };
    }

    public static boolean isValidMove(char[][] board, int row, int col) {
        // Step 5b: Check if the chosen cell is empty
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static boolean checkWin(char[][] board, char currentPlayer) {
        // Step 5d (continued): Check rows, columns, and diagonals for a win
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true; // Row win
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true; // Column win
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true; // Diagonal win (top-left to bottom-right)
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true; // Diagonal win (top-right to bottom-left)
        }
        return false;
    }

    public static boolean isBoardFull(char[][] board) {
        // Step 5d (continued): Check if the game is a draw
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}