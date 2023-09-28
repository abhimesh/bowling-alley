package playerpackage;

import java.util.HashMap;

public class playerManager {
    private playerManager(){};
    public static playerManager obj=null;
    static int playerId=0;
    HashMap<Integer, player> mapPlayer=new HashMap<>();
    public static playerManager getinstance()
    {
        if(obj==null)
        {
            obj=new playerManager();
        }
        return obj;
    }

    public  player createplayer(String Name)
    {
        playerId++;
        player player=new player(Name);
        player.setId(playerId);
        mapPlayer.put(player.getId(),player);
        return player;
    }

}
