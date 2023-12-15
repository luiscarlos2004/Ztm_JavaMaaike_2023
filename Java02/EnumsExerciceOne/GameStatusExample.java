package EnumsExerciceOne;

public class GameStatusExample {
    public static void main(String[] args){
        for(GameStatus gamestatus : GameStatus.values()){
            System.out.println(gamestatus);
        }
        GameStatus gameStatus =  GameStatus.PAUSED;
    }
}
