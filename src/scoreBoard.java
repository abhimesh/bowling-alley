import java.util.ArrayList;
import java.util.List;
class hii{
    public int first;
    public int second;
    hii(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
public class scoreBoard {
    private List<List<hii>> scoreList;

    scoreBoard()
    {
        scoreList=new ArrayList<>();
    }
    public void addScore(int score1,int score2,int chance)
    {

            if(scoreList.size()==chance-1)
            {
                scoreList.add(new ArrayList<>());
            }
            scoreList.get(chance-1).add(new hii(score1,score2));


    }

    public int currentscore(int chance)
    {
            int sum=0;
            chance++;
            for(int i=0;i<scoreList.get(chance-1).size();i++)
            {
                if(scoreList.get(chance-1).get(i).first==10)
                {sum=sum+20;}
                else if(scoreList.get(chance-1).get(i).first+scoreList.get(chance-1).get(i).second==10)
                {sum=sum+15;}
                else {
                    sum+=scoreList.get(chance-1).get(i).first+scoreList.get(chance-1).get(i).second;
                }
            }
            return sum;
    }

    public List<List<hii>> getScoreList() {
        return scoreList;
    }
}
