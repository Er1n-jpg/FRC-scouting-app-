import java.util.ArrayList;

public class Dataholder {
    String strings;
    private ArrayList<team> ScoutedTeams = new ArrayList<>();
    public void addTeam(team teams){
        ScoutedTeams.add(teams);
    }

    public team getTeam(int index){
        return ScoutedTeams.get(index);
    }

    public int getTeamCount(){
        return ScoutedTeams.size();
    }

    public String obtainString(){
        for (int i = 0; i < ScoutedTeams.size(); i++){
            strings = ScoutedTeams.get(i).toString();
        }
        return strings;
    }

}
