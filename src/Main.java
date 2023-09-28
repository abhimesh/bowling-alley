import playerpackage.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        playerManager playerManager= playerpackage.playerManager.getinstance();
        player  player1=playerManager.createplayer("kittu");
        player player2=playerManager.createplayer("Sony");
        player player3=playerManager.createplayer("ashu");

        List<player> playerList=new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        Game game=new Game(playerList);
        game.executeGame();
        game.getWinner();
        game.standings();
    }
}