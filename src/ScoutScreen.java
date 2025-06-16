

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;


public class ScoutScreen extends JFrame implements ActionListener, KeyListener, MouseListener{

    private JButton[] corals;

private JPanel backgroundPanel;
JButton coral1, coral2, coral3, coral4, coralMiss, balgae, palgae, dcage, scage, park, auto, disable, allianceB, allianceR, back;
ImageIcon titleIcon, bgIcon, parkIconY, parkIconN, sclimbIconY, sclimbIconN, dclimbIconY, dclimbIconN, allianceBY, allianceBN, allianceRY, allianceRN; // very many JButton declarations
JTextField teamNump, teamNum, matchNum;
JTextArea comments;

int teamRefresh = 0;
static team scoutingrn = new team(null, null);
    
    
public ScoutScreen(){
        teamRefresh++;
        JFrame ScoutScreen = new JFrame();
        setBounds(0, 0, 1500, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

    backgroundPanel = new BackgroundPanel();
    backgroundPanel.setBounds(0, 0, 1500, 900);
    backgroundPanel.setLayout(null);
    setContentPane(backgroundPanel);
 
    coral1 = new JButton();
    coral1.setBounds(50,250,90,90);
    coral1.setVisible(true);
    coral1.setOpaque(false); // making the button clear
    coral1.setContentAreaFilled(false); // nothing filling the button area 
    coral1.setBorderPainted(false); // erases the border of the button
    coral1.addActionListener(this); // Adds action listener
    coral1.addMouseListener(this); // looks for your mouse -> float over commands -> potential implementation

    backgroundPanel.add(coral1); // Adds the button to the background panel so it can show on top of the image

    // repeat the same process with all the buttons

    coral2 = new JButton();//button for l2 coral
    coral2.setBounds(145,250,90,90);
    coral2.setVisible(true);
    coral2.setOpaque(false);
    coral2.setContentAreaFilled(false);
    coral2.setBorderPainted(false);
    coral2.addActionListener(this);
    coral2.addMouseListener(this);

    backgroundPanel.add(coral2);

    coral3 = new JButton(); // button for l3 coral
    coral3.setBounds(235,250,90,90);
    coral3.setVisible(true);
    coral3.setOpaque(false);
    coral3.setContentAreaFilled(false);
    coral3.setBorderPainted(false);
    coral3.addActionListener(this);
    coral3.addMouseListener(this);

    backgroundPanel.add(coral3);

    coral4 = new JButton(); // button for l4 coral
    coral4.setBounds(325,250,90,90);
    coral4.setVisible(true);
    coral4.setOpaque(false);
    coral4.setContentAreaFilled(false);
    coral4.setBorderPainted(false);
    coral4.addActionListener(this);
    coral4.addMouseListener(this);

    backgroundPanel.add(coral4);

    coralMiss = new JButton(); // button for missed coral
    coralMiss.setBounds(415,250,90,90);
    coralMiss.setVisible(false);
    coralMiss.setOpaque(false);
    coralMiss.setContentAreaFilled(false);
    coralMiss.setBorderPainted(false);
    coralMiss.addActionListener(this);
    coralMiss.addMouseListener(this);

    backgroundPanel.add(coralMiss);


    balgae = new JButton(); // button for barge algae
    balgae.setBounds(437,355,125,125);
    balgae.setVisible(true);
    balgae.setOpaque(false);
    balgae.setContentAreaFilled(false);
    balgae.setBorderPainted(false);
    balgae.addActionListener(this);
    balgae.addMouseListener(this);

    backgroundPanel.add(balgae);

    palgae = new JButton(); // button for processor algae
    palgae.setBounds(437,490,125,125);
    palgae.setVisible(true);
    palgae.setOpaque(false);
    palgae.setContentAreaFilled(false);
    palgae.setBorderPainted(false);
    palgae.addActionListener(this);
    palgae.addMouseListener(this);

    backgroundPanel.add(palgae);

    dcage = new JButton(); // button for deep climb
    dcage.setBounds(420,695,155,110);
    dcage.setVisible(true);
    dcage.setOpaque(false);
    dcage.setContentAreaFilled(false);
    dcage.setBorderPainted(false);
    dcage.addActionListener(this);
    dcage.addMouseListener(this);

    backgroundPanel.add(dcage);

    scage = new JButton(); // button for shallow climb
    scage.setBounds(245, 695,155,110);
    scage.setVisible(true);
    scage.setOpaque(false);
    scage.setContentAreaFilled(false);
    scage.setBorderPainted(false);
    scage.addActionListener(this);
    scage.addMouseListener(this);

    backgroundPanel.add(scage);

    park = new JButton(); // button for park
    park.setBounds(60,695,155,110);
    park.setVisible(true);
    park.setOpaque(false);
    park.setContentAreaFilled(false);
    park.setBorderPainted(false);
    park.addActionListener(this);
    park.addMouseListener(this);

    backgroundPanel.add(park);

    auto = new JButton(); // button for auto switch
    auto.setBounds(375,120,100,50);
    auto.setVisible(true);
    auto.setOpaque(false);
    auto.setContentAreaFilled(false);
    auto.setBorderPainted(false);
    auto.addActionListener(this);
    backgroundPanel.add(auto);
    auto.addMouseListener(this);
    

    disable = new JButton(); // button for diasble
    disable.setBounds(1050,240,150,75);
    disable.setVisible(true);
    disable.setOpaque(false);
    disable.setContentAreaFilled(false);
    disable.setBorderPainted(false);
    disable.addActionListener(this);
    disable.addMouseListener(this);

    backgroundPanel.add(disable);

    allianceB = new JButton(); // button for blue alliance
    allianceB.setBounds(1200,335,100,100);
    allianceB.setVisible(true);
    allianceB.setOpaque(false);
    allianceB.setContentAreaFilled(false);
    allianceB.setBorderPainted(false);
    allianceB.addActionListener(this);
    allianceB.addMouseListener(this);

    backgroundPanel.add(allianceB);

    allianceR = new JButton(); // button for red alliance
    allianceR.setBounds(1045,335,100,100);
    allianceR.setVisible(true);
    allianceR.setOpaque(false); 
    allianceR.setContentAreaFilled(false);
    allianceR.setBorderPainted(false);
    allianceR.addActionListener(this);
    allianceR.addMouseListener(this);

    backgroundPanel.add(allianceR); 

    back = new JButton(); // Button to go back (which is really just the first symbol)
    back.setBounds(1275,30,150,100);
    back.setVisible(true);
    back.setOpaque(false);
    back.setContentAreaFilled(false);
    back.setBorderPainted(false);
    back.addActionListener(this);
    back.addMouseListener(this);

    backgroundPanel.add(back);

    // Make a clear JTextField for team number and match number + clear JTextArea for comments

    teamNump = new JTextField(8); // JtextField for Team number
    teamNump.setVisible(true);
    teamNump.setBounds(985,120,200,100);
    this.add(teamNump);
    backgroundPanel.add(teamNump);
    teamNump.setOpaque(false);
    teamNump.setBorder(BorderFactory.createEmptyBorder()); // Method to clear the border of a JText field
    teamNump.setFont(new Font("Prompt", Font.BOLD, 28)); // changing font 
    teamNump.addActionListener(this);
 


    matchNum = new JTextField(); //Jtextfield for current match number
    matchNum.setVisible(true);
    this.add(matchNum);
    matchNum.setBounds(985,20,200,100);
    backgroundPanel.add(matchNum);
    matchNum.setOpaque(false);
    matchNum.setBorder(BorderFactory.createEmptyBorder());
    matchNum.setFont(new Font("Prompt", Font.BOLD, 28));
    matchNum.addActionListener(this);
  
    
    comments = new JTextArea(); // I found using a JTextArea was way more convenient in terms of what I wanted to do with the comments text box
    comments.setLineWrap(true);
    comments.setWrapStyleWord(true);
    comments.setVisible(true);
    comments.setBounds(755,550,625,225);
    this.add(comments);
    backgroundPanel.add(comments);
    comments.setCaretPosition(0);
    comments.setOpaque(false);
    comments.setBorder(BorderFactory.createEmptyBorder());
    comments.setFont(new Font("Prompt", Font.BOLD, 28));
    comments.addKeyListener(this); 


    }





 @Override
 public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    if (e.getSource() == coral1){
        scoutingrn.coral(1); // Goes back to switch/case and selects the coral level
    } else if (e.getSource() == coral2){
        scoutingrn.coral(2);
        System.out.println("output!");
    } else if (e.getSource() == coral3){
        scoutingrn.coral(3);
    } else if (e.getSource() == coral4){
        scoutingrn.coral(4);
    } else if (e.getSource() == coralMiss) {
        scoutingrn.coral(5);
    }

    if (e.getSource() == balgae){
        scoutingrn.bargeAlgae();
    }

    if (e.getSource() == palgae){
        scoutingrn.processorAlgae();
        System.out.println(scoutingrn.getstats());
        System.out.println(scoutingrn.getTeamNum());
    }

    if (e.getSource() == dcage){
        scoutingrn.endgame(1);

    } else if (e.getSource() == scage){
        scoutingrn.endgame(2);

    } else if (e.getSource() == park){
        scoutingrn.endgame(3);
    }

    if (e.getSource() == auto){

    } else if (e.getSource() == disable){
        scoutingrn.disable();
    } 
    
    if (e.getSource() == allianceR ){
        scoutingrn.setAlliance("red");
    } else if (e.getSource() == allianceB){
        scoutingrn.setAlliance("blue");
    }

    if (e.getSource() == back){ // When back button is pressed -> save all the info collected into a txt file called Scouting.txt
        new Scout(); // Deploy a new title Screen 
        dispose(); // Dispose of Scout Screen
        try {
        FileWriter fw = new FileWriter("src/Scouting.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(scoutingrn.toString());
        pw.close();
        } catch (IOException c){
            System.out.println("file writing error :]");
        } 


    }
    if (e.getSource() == matchNum){
        matchNum.setEditable(false);
        matchNum.setCaretPosition(0);
        matchNum.getCaret().setVisible(false); // locking the JTextfield & making the caret not visible
        scoutingrn.setQualNum(matchNum.getText()); //set Qual number variable to the text entered in Jtextfield
        
    } else if (e.getSource() == teamNump){
        teamNump.setEditable(false);
        teamNump.setCaretPosition(0);
        teamNump.getCaret().setVisible(false);
        scoutingrn.setTeamNum(teamNump.getText());
    } 

    

 }

 @Override
 public void keyPressed(KeyEvent e){// Method to listen for if the enter key is pressed 
 if (e.getKeyCode() == KeyEvent.VK_ENTER) {    
    String text = comments.getText();  
            // Prevent adding new line if you want single-line behavior
         if (!e.isShiftDown()) {
                e.consume();
            comments.setEditable(false); // JtextArea is no longer editable
            comments.setCaretPosition(0);// sets the caret position to 0
            comments.getCaret().setVisible(false); // Changes visibikity of the caret to false
         } else {
      
       }
     }
}

 @Override
 public void keyReleased(KeyEvent e) {
     //Unused Abstract method of keyListener Abstract
 }

 @Override
 public void keyTyped(KeyEvent e) {
    // Have to add
    }
 

    
 class BackgroundPanel extends JPanel { // Method to create a background panel with an image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = new ImageIcon("C://Users//enchi//.vscode//Scouting app//src//Images haha//Scouter.png").getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }
 }
   
 
 public static void main(String[] args){
        new Scout(); // Move later plsplspls
        
    }
 
// Was going to add a mouse listener feature but ran out of time :(

 @Override
 public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub
 }





 @Override
 public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub


 }





 @Override
 public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

 }





 @Override
 public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

 }





 @Override
 public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
    
 }


}

   
 






