import java.io.File;
import java.util.Scanner;

class Threading implements Runnable {
   public Threading(int row, int col, char[][] arry, char[][] next) {
       this.arry = arry;
       this.next = next;
       this.row = row;
       this.col = col;
   }
   @Override
   public void run() {
       boolean alive = checkCell();
       if (!alive) {
           next[row][col] = 'O';
       }else{
           next[row][col] = 'X';
       }
   }
   public boolean checkCell() {
       int n = 0;
       for (int i = row - 1; i <= row + 1; i++){
           for (int j = col - 1; j <= col + 1; j++){
               if ((j != col || i != row) && j >= 0 && j < 20 && i >= 0 && i < 20 
                       && arry[i][j] == 'X') {
                   n++;
               }
           }
       }
      if (arry[row][col] == 'X' && (n == 2 || n == 3)) {
           return true;
      } else if (arry[row][col] == 'O' && n == 3) {
           return true;
      } else {
       return false;
      }
   }
   private int row, col;
   private char arry[][], next[][];
}