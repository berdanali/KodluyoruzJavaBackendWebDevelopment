import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int rowSize;
    private int colSize;
    private int mineCount;
    private char[][] board;
    private char[][] mines;
    private boolean gameOver;

    public MineSweeper(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.board = new char[rowSize][colSize];
        this.mines = new char[rowSize][colSize];
        this.gameOver = false;
    }

    public void initializeGame() {
        // Mayınları rastgele yerleştir
        placeMines();

        // Oyun tahtasını başlat
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        Random random = new Random();
        mineCount = rowSize * colSize / 4;

        for (int i = 0; i < mineCount; i++) {
            int row, col;
            do {
                row = random.nextInt(rowSize);
                col = random.nextInt(colSize);
            } while (mines[row][col] == '*');
            mines[row][col] = '*';
        }
    }

    public void printBoard() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard();
            System.out.print("Satır seçin: ");
            int row = scanner.nextInt();
            System.out.print("Sütun seçin: ");
            int col = scanner.nextInt();

            if (row < 0 || row >= rowSize || col < 0 || col >= colSize) {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                continue;
            }

            if (mines[row][col] == '*') {
                gameOver = true;
                revealMines();
                System.out.println("Oyunu kaybettiniz!");
            } else {
                int count = countAdjacentMines(row, col);
                board[row][col] = (char) (count + '0');
                if (count == 0) {
                    // Etrafındaki boş alanları da aç
                    revealEmptySpaces(row, col);
                }

                // Oyunu kazandınız
                if (checkWin()) {
                    printBoard();
                    System.out.println("Tebrikler, oyunu kazandınız!");
                    gameOver = true;
                }
            }
        }
        scanner.close();
    }

    private void revealEmptySpaces(int row, int col) {
        if (row < 0 || row >= rowSize || col < 0 || col >= colSize || board[row][col] != '-') {
            return;
        }

        int count = countAdjacentMines(row, col);
        board[row][col] = (char) (count + '0');
        if (count == 0) {
            revealEmptySpaces(row - 1, col);
            revealEmptySpaces(row + 1, col);
            revealEmptySpaces(row, col - 1);
            revealEmptySpaces(row, col + 1);
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (newRow >= 0 && newRow < rowSize && newCol >= 0 && newCol < colSize) {
                    if (mines[newRow][newCol] == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void revealMines() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mines[i][j] == '*') {
                    board[i][j] = '*';
                }
            }
        }
    }

    private boolean checkWin() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (board[i][j] == '-' && mines[i][j] != '*') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Mayın Tarlası Oyunu");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısını girin: ");
        int rowSize = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int colSize = scanner.nextInt();

        MineSweeper game = new MineSweeper(rowSize, colSize);
        game.initializeGame();
        game.play();
    }
}
