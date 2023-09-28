import playerpackage.player;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Game {

    List<player> playerList;
    static  int chance=0;
    scoreBoard scoreBoard;
    Game(List<player> playerList)
    {
        this.playerList=playerList;
        scoreBoard=new scoreBoard();
    }

    private void changeChance()
    {
        chance++;
        chance=chance%playerList.size();
    }
    public void executeGame()
    {
        Scanner s=new Scanner(System.in);
        int count=1;
        while(count>0)
        {
            for(int i=0;i<playerList.size();i++)
            {int score1=0;
            int score2=0;
            System.out.println("enter score of player "+i);
            score1=s.nextInt();
            if(score1!=10)
            {
                System.out.println("enter score of player "+i);
                score2=s.nextInt();
            }
            scoreBoard.addScore(score1,score2,chance+1);
            changeChance();}



            count--;
        }
    }
    public player getWinner()
    {
        int maximumScore=0;
        player Winner=null;
        for(int i=0;i<playerList.size();i++)
        {
            if(maximumScore<scoreBoard.currentscore(i))
            {maximumScore=scoreBoard.currentscore(i);Winner=playerList.get(i);}
        }
        int count=0;
        for(int i=0;i<playerList.size();i++)
        {
            if(maximumScore==scoreBoard.currentscore(i))
                count++;
        }
        if(count>1)
        {
            System.out.println("It is a draw");
            return null;
        }
        System.out.println("Winner of game is "+Winner.getName());
        System.out.println("score of winner is "+maximumScore);
        return Winner;

    }

    public void standings()
    {
        for(int i=0;i<scoreBoard.getScoreList().size();i++)
        {
            playerList.get(i).setScore(scoreBoard.currentscore(i));
        }
        Collections.sort(playerList,new StockComparator());
        for(int i=0;i<scoreBoard.getScoreList().size();i++)
        {
            System.out.println(playerList.get(i).getName());
        }
    }

}
