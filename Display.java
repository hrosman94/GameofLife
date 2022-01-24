public class Display {
  public static void display(GameofLife new_game, int itr, int itr_2){
     while (itr < 20){
           for (itr_2 = 0; itr_2 < 20; itr_2++) {
               System.out.print(String.valueOf(new_game.arry[itr][itr_2]));
           }
           System.out.println(""); itr++;
       }
   }
}