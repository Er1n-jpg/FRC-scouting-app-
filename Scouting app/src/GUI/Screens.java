package GUI;

public class Screens {
    public static void main(String[] args){
        TitleScreen titleScreen = new TitleScreen();
        titleScreen.setVisible(true);
        ScoutScreen scoutscreen = new ScoutScreen();
        scoutscreen.setVisible(false);
        if (!titleScreen.getActive() ){
            titleScreen.setVisible(false);
            scoutscreen.setVisible(true);
        }
    }
}
