public class team extends alliance{
    private String teamNum;
    private String teamName;
    private String alliance;
    private boolean disabled = false;
    private int l1coral;
    private int l2coral;
    private int l3coral;
    private int l4coral;
    private int missedCoral;
    private int bargeAlgae;
    private int processorAlgae;
    private boolean deepClimb;
    private boolean shallowClimb;
    private boolean park;
    private int numMissedCoral;
    private int numMissedAlgae;
    private String qualNum;
    private String comments;

    
 

    public team (String t, String a){
        teamNum = t;
        alliance = a;
    }

    public team (String t, String tn, String a){
        this(t, "null");
        teamName = tn;
    }


        public team(String line) {
        if ( line.trim().isEmpty()) {
            throw new IllegalArgumentException("Line cannot be null or empty");
        }

        System.out.println("Processing line: " + line); // Debug output
        
        String[] separateSection = line.split(",");
        
        // Parse with error handling
        try {
            teamName = separateSection[0];
            qualNum = separateSection[1];
            l1coral = parseIntSafe(separateSection[2]);
            l2coral = parseIntSafe(separateSection[3]);
            l3coral = parseIntSafe(separateSection[4]);
            l4coral = parseIntSafe(separateSection[5]);
            missedCoral = parseIntSafe(separateSection[6]); 
            bargeAlgae = parseIntSafe(separateSection[7]);
            processorAlgae = parseIntSafe(separateSection[8]);
            deepClimb = parseBooleanSafe(separateSection[9]);
            shallowClimb = parseBooleanSafe(separateSection[10]);
            park = parseBooleanSafe(separateSection[11]);
            alliance = separateSection[12].trim();
            comments = separateSection[13].trim();
        
        } catch (Exception e) {
            throw new IllegalArgumentException("Error parsing line: " + line, e);
        }
    }

    // ... (getter methods) ...

    private int parseIntSafe(String value) {
        if (value == null || value.trim().isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            System.err.println("Warning: Invalid integer value '" + value + "'. Using 0 as default.");
            return 0;
        }
    }

    private boolean parseBooleanSafe(String value) {
        if (value == null) return false;
        value = value.trim().toLowerCase();
        return value.equals("true") || value.equals("1") || value.equals("yes") || value.equals("y");
    }


    public String getTeamNum(){
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

    public String getComments(){
        return comments;
    }

    public boolean getDisabled(){
        return disabled;
    }

    public int getProcessorAlgae(){
        return processorAlgae;
    }

    public int getBargeAlgae(){
        return bargeAlgae;
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
            case 5:
                return missedCoral;
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

    public void setTeamNum(String tn){
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

            case 5:
                missedCoral++;
                break;
        }

    }

    public void endgame(int e){
        switch (e){
            case 1:
                deepClimb = true;
                break;
            case 2:
                shallowClimb = true;
                break;
            case 3:
                park = true;
                break;

            default:
                break;
        }
        
    }

    public void disable (){
        disabled = true;
    }

    public String getstats(){
        return "l1 : " + l1coral + "|| l2 : " + l2coral + "|| l3 : " + l3coral + "||l4" + l4coral;
    }

    public String toString(){
        return teamNum + ", " + qualNum + ", " +  l1coral + ", " + l2coral + ", " + l3coral + ", " + l4coral + ", " + missedCoral + ", " + bargeAlgae + ", " + processorAlgae + ", " + deepClimb + ", " + shallowClimb + ", " + park + ", " + alliance + ", " + comments; 
    }
}
