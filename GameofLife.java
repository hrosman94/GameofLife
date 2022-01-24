import java.io.File;
import java.util.Scanner;

class GameofLife {
   public void joinThreads() {
       Thread thread[] = new Thread[20*20];
       int size = thread.length; 
       int idx = 0, k = 0;
       while (k < 20) {
           for (int j = 0; j < 20; j++) {
               thread[idx] = new Thread(new Threading(k, j, arry, next));
               thread[idx].start();
               idx++;
           } k++;
       }
       try {
           for (int i = 0; i < size; i++) {
               thread[i].join();
           }   
       } catch (Exception e) {
           System.out.println("ERR: thread join failed");
       }int i = 0;
       while (i < 20) {
           for (int j = 0; j < 20; j++) {
               arry[i][j] = next[i][j];
           }i++;
       }  
   }
  public int readFile() {
       int itr = 0, val = 1;
           File file = new File("start.txt");
       try {
           Scanner scan = new Scanner(file);
           while (scan.hasNext()) {
               String str = scan.next();
               if (str.length() == 20) {
                   for (int j = 0; j < 20; j++) {
                       arry[itr][j] = str.charAt(j);
                   }
                   itr++;
               } else {
                   val = Integer.parseInt(str);
                   break;
               }
           }
           scan.close();
       }
       catch (Exception e) {
           System.out.println("ERR: couldn't scan file");
       }
       return val;
   }
   public char arry[][] = new char[20][20];
   public char next[][] = new char[20][20];
}