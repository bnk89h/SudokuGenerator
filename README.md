Program Overview:
This program generates a solved Sudoku board and print it to the console. A Sudoku board has each row, column, and 3 x 3 box having numbers from 1 to 9 with no repeats. This program will generate a new board each run.
Data Structures
A 2D array store sthe Sudoku board with the numbers in each row and column.
A 1D array stores the numbers from 1 to 9 which will be shuffled to select which number to place in each cell.
Algorithm:
A backtracking algorithm was used to generate the Sudoku board. Each cell was checked to see if the number placed in it follows the rules of Sudoku. If it does not, that number will not be placed in the cell. If no numbers work, the algorithm will go back and change the previous number placed in the board until the last number is filled in correctly.
Methods:
fillBoard uses recursion to generate the Sudoku solution.
isValid tests whether the move placed on the board follows the rules of Sudoku.
shuffle randomizes the order of the numbers from 1 to 9.
display prints the Sudoku board.
main method runs the program.
Testing Plan:
The program was ran multiple times to ensure that the Sudoku boards generated are valid. Each row and column is checked to make sure there are no repeats and that each 3 x 3 box contains the correct numbers.
Challenges and Solutions
The challenge of having numbers repeated in each row, column, or 3 x 3 box was solved by implementing the validation and backtracking algorithms that would ensure no such placements would occur on the Sudoku board.
