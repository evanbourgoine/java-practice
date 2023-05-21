import java.util.ArrayList;

public class Team {
    
    private String teamName;
    private ArrayList<Player> players;

    public Team(String name)
    {
        name = teamName;
        players = new ArrayList<Player>(10);
    }

    public String addPlayer(Player play)
    {
        if (players.size() != 10)
        {
            players.add(play);
            return "Player was added";
        }
        else{
            return "Team already full";
        }
    }

    public String toString()
    {
        return "The team is:" + players.get(0).getName() + "";
    }

}
