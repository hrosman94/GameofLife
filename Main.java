class Main {
  public static void main(String[] args) {
    int itr = 0; 
    GameofLife new_game = new GameofLife();
    int generation = new_game.readFile();
       while (itr < generation) {
           new_game.joinThreads();
           itr++;
       }
      Display.display(new_game, 0, 0);
   }
}