import java.util.Random;
public class SudokuGenerator {
    public static void generateBoard(int[][] board, int[] numbers){
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                board[row][col] = getValue(row, col, numbers);
            }
        }
    }
    public static int getValue(int row, int col, int[] numbers){
        int index = (row * 3 + row / 3 + col) % 9;
        return numbers[index];
    }
    public static void shuffle(int[] numbers){
        Random rand = new Random();
        for (int i = numbers.length - 1; i > 0; i--){
            int j = rand.nextInt(i + 1);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
    public static void display(int[][] board){
        for (int row = 0; row < board.length; row++){
            if (row % 3 == 0){
                System.out.println("+-------+-------+-------+");
            }
            for (int col = 0; col < board[0].length; col++){
                if (col % 3 == 0){
                    System.out.print("| ");
                }
                System.out.print(board[row][col]);
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
    public static void main(String[] args){
        int[][] board = new int[9][9];
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        shuffle(numbers);
        generateBoard(board, numbers);
        display(board);
    }
}