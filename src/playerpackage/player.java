package playerpackage;

public class player {
    private int Id;
    private String Name;
    private int score;
    player(String Name)
    {
        this.Name=Name;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
