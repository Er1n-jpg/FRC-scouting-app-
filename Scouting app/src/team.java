public class team extends alliance{
    private int teamNum;
    private String teamName;
    private String alliance;
    private boolean disabled = false;
    private int l1coral;
    private int l2coral;
    private int l3coral;
    private int l4coral;
    private int bargeAlgae;
    private int processorAlgae;
    private boolean deepClimb;
    private boolean shallowClimb;
    private boolean park;



    public team (int t, String a){
        teamNum = t;
        alliance = a;
    }

    public team (int t, String tn, String a){
        this(t, "null");
        teamName = tn;
    }

    public int getTeamNum(){
        return teamNum;
    }

    public String getTeamName(){
        return teamName;
    }

    public boolean getDeepClimb(){
        return deepClimb;
    }
    public boolean getShallowClimb(){
        return shallowClimb;
    }

    public boolean getpark(){
        return park;
    }

    public int getCoral(int i){
        switch (i){
            case 1: 
                return l1coral;
            case 2:
                return l2coral;
            case 3:
                return l3coral;
            case 4:
                return l4coral;
            default:
                return 0; 
        }
    }


    public void processorAlgae(){
        processorAlgae++;
    }

    public void bargeAlgae(){
        bargeAlgae++;
    }

    public void setTeamNum(int tn){
        teamNum = tn;
    }

    public void setTeamName(String tn){
        teamName = tn;
    }

    public void setAlliance(String a){
        alliance = a;
    }


    public void coral(int l){
        switch (l){
            case 1:
                l1coral++;
                break;
            
            case 2:
                l2coral++;
                break;
            
            case 3:
                l3coral++;
                break;

            case 4: 
                l4coral++;
                break;
        }
    }
}
