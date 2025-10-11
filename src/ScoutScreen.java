
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class ScoutScreen extends JFrame implements ActionListener, KeyListener, MouseListener {

    private JButton[] corals;

    private JPanel backgroundPanel;
    JButton coral1, coral2, coral3, coral4, coralMiss, balgae, palgae, dcage, scage, park, auto, disable, allianceB,
            allianceR, back;
    ImageIcon titleIcon, bgIcon, parkIconY, parkIconN, sclimbIconY, sclimbIconN, dclimbIconY, dclimbIconN, allianceBY,
            allianceBN, allianceRY, allianceRN; 
    JTextField teamNump, teamNum, matchNum;
    JTextArea comments;

    int teamRefresh = 0;
    static team scoutingrn = new team(null, null);

    public ScoutScreen() {
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
        coral1.setBounds(50, 250, 90, 90);
        coral1.setVisible(true);
        coral1.setOpaque(false); 
        coral1.setContentAreaFilled(false); 
        coral1.setBorderPainted(false); 
        coral1.addActionListener(this); 
        coral1.addMouseListener(this); 
        backgroundPanel.add(coral1); 

      

        coral2 = new JButton();
        coral2.setBounds(145, 250, 90, 90);
        coral2.setVisible(true);
        coral2.setOpaque(false);
        coral2.setContentAreaFilled(false);
        coral2.setBorderPainted(false);
        coral2.addActionListener(this);
        coral2.addMouseListener(this);

        backgroundPanel.add(coral2);

        coral3 = new JButton(); 
        coral3.setBounds(235, 250, 90, 90);
        coral3.setVisible(true);
        coral3.setOpaque(false);
        coral3.setContentAreaFilled(false);
        coral3.setBorderPainted(false);
        coral3.addActionListener(this);
        coral3.addMouseListener(this);

        backgroundPanel.add(coral3);

        coral4 = new JButton(); 
        coral4.setBounds(325, 250, 90, 90);
        coral4.setVisible(true);
        coral4.setOpaque(false);
        coral4.setContentAreaFilled(false);
        coral4.setBorderPainted(false);
        coral4.addActionListener(this);
        coral4.addMouseListener(this);

        backgroundPanel.add(coral4);

        coralMiss = new JButton(); 
        coralMiss.setBounds(415, 250, 90, 90);
        coralMiss.setVisible(false);
        coralMiss.setOpaque(false);
        coralMiss.setContentAreaFilled(false);
        coralMiss.setBorderPainted(false);
        coralMiss.addActionListener(this);
        coralMiss.addMouseListener(this);

        backgroundPanel.add(coralMiss);

        balgae = new JButton(); 
        balgae.setBounds(437, 355, 125, 125);
        balgae.setVisible(true);
        balgae.setOpaque(false);
        balgae.setContentAreaFilled(false);
        balgae.setBorderPainted(false);
        balgae.addActionListener(this);
        balgae.addMouseListener(this);

        backgroundPanel.add(balgae);

        palgae = new JButton(); 
        palgae.setBounds(437, 490, 125, 125);
        palgae.setVisible(true);
        palgae.setOpaque(false);
        palgae.setContentAreaFilled(false);
        palgae.setBorderPainted(false);
        palgae.addActionListener(this);
        palgae.addMouseListener(this);

        backgroundPanel.add(palgae);

        dcage = new JButton(); 
        dcage.setBounds(420, 695, 155, 110);
        dcage.setVisible(true);
        dcage.setOpaque(false);
        dcage.setContentAreaFilled(false);
        dcage.setBorderPainted(false);
        dcage.addActionListener(this);
        dcage.addMouseListener(this);

        backgroundPanel.add(dcage);

        scage = new JButton(); 
        scage.setBounds(245, 695, 155, 110);
        scage.setVisible(true);
        scage.setOpaque(false);
        scage.setContentAreaFilled(false);
        scage.setBorderPainted(false);
        scage.addActionListener(this);
        scage.addMouseListener(this);

        backgroundPanel.add(scage);

        park = new JButton();
        park.setBounds(60, 695, 155, 110);
        park.setVisible(true);
        park.setOpaque(false);
        park.setContentAreaFilled(false);
        park.setBorderPainted(false);
        park.addActionListener(this);
        park.addMouseListener(this);

        backgroundPanel.add(park);

        auto = new JButton(); 
        auto.setBounds(375, 120, 100, 50);
        auto.setVisible(true);
        auto.setOpaque(false);
        auto.setContentAreaFilled(false);
        auto.setBorderPainted(false);
        auto.addActionListener(this);
        backgroundPanel.add(auto);
        auto.addMouseListener(this);

        disable = new JButton(); 
        disable.setBounds(1050, 240, 150, 75);
        disable.setVisible(true);
        disable.setOpaque(false);
        disable.setContentAreaFilled(false);
        disable.setBorderPainted(false);
        disable.addActionListener(this);
        disable.addMouseListener(this);

        backgroundPanel.add(disable);

        allianceB = new JButton(); 
        allianceB.setBounds(1200, 335, 100, 100);
        allianceB.setVisible(true);
        allianceB.setOpaque(false);
        allianceB.setContentAreaFilled(false);
        allianceB.setBorderPainted(false);
        allianceB.addActionListener(this);
        allianceB.addMouseListener(this);

        backgroundPanel.add(allianceB);

        allianceR = new JButton(); 
        allianceR.setBounds(1045, 335, 100, 100);
        allianceR.setVisible(true);
        allianceR.setOpaque(false);
        allianceR.setContentAreaFilled(false);
        allianceR.setBorderPainted(false);
        allianceR.addActionListener(this);
        allianceR.addMouseListener(this);

        backgroundPanel.add(allianceR);

        back = new JButton(); 
        back.setBounds(1275, 30, 150, 100);
        back.setVisible(true);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        back.addActionListener(this);
        back.addMouseListener(this);

        backgroundPanel.add(back);

       

        teamNump = new JTextField(8); 
        teamNump.setVisible(true);
        teamNump.setBounds(985, 120, 200, 100);
        this.add(teamNump);
        backgroundPanel.add(teamNump);
        teamNump.setOpaque(false);
        teamNump.setBorder(BorderFactory.createEmptyBorder()); 
        teamNump.setFont(new Font("Prompt", Font.BOLD, 28)); 
        teamNump.addActionListener(this);

        matchNum = new JTextField();
        matchNum.setVisible(true);
        this.add(matchNum);
        matchNum.setBounds(985, 20, 200, 100);
        backgroundPanel.add(matchNum);
        matchNum.setOpaque(false);
        matchNum.setBorder(BorderFactory.createEmptyBorder());
        matchNum.setFont(new Font("Prompt", Font.BOLD, 28));
        matchNum.addActionListener(this);

        comments = new JTextArea(); 
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        comments.setVisible(true);
        comments.setBounds(755, 550, 625, 225);
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
        if (e.getSource() == coral1) {
            scoutingrn.coral(1); 
        } else if (e.getSource() == coral2) {
            scoutingrn.coral(2);
            System.out.println("output!");
        } else if (e.getSource() == coral3) {
            scoutingrn.coral(3);
        } else if (e.getSource() == coral4) {
            scoutingrn.coral(4);
        } else if (e.getSource() == coralMiss) {
            scoutingrn.coral(5);
        }

        if (e.getSource() == balgae) {
            scoutingrn.bargeAlgae();
        }

        if (e.getSource() == palgae) {
            scoutingrn.processorAlgae();
            System.out.println(scoutingrn.getstats());
            System.out.println(scoutingrn.getTeamNum());
        }

        if (e.getSource() == dcage) {
            scoutingrn.endgame(1);

        } else if (e.getSource() == scage) {
            scoutingrn.endgame(2);

        } else if (e.getSource() == park) {
            scoutingrn.endgame(3);
        }

        if (e.getSource() == auto) {

        } else if (e.getSource() == disable) {
            scoutingrn.disable();
        }

        if (e.getSource() == allianceR) {
            scoutingrn.setAlliance("red");
        } else if (e.getSource() == allianceB) {
            scoutingrn.setAlliance("blue");
        }

        if (e.getSource() == back) { 
            new Scout(); 
            dispose(); 
            try {
                FileWriter fw = new FileWriter("src/Scouting.txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(scoutingrn.toString());
                pw.close();
            } catch (IOException c) {
                System.out.println("file writing error :]");
            }

        }
        if (e.getSource() == matchNum) {
            matchNum.setEditable(false);
            matchNum.setCaretPosition(0);
            matchNum.getCaret().setVisible(false); 
            scoutingrn.setQualNum(matchNum.getText()); 

        } else if (e.getSource() == teamNump) {
            teamNump.setEditable(false);
            teamNump.setCaretPosition(0);
            teamNump.getCaret().setVisible(false);
            scoutingrn.setTeamNum(teamNump.getText());
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = comments.getText();
            if (!e.isShiftDown()) {
                e.consume();
                comments.setEditable(false); 
                comments.setCaretPosition(0);
                comments.getCaret().setVisible(false); 
            } else {

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
 
    }

    class BackgroundPanel extends JPanel { 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image background = new ImageIcon("Src/Scouter.png")
                    .getImage();
            g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        new Scout(); 

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {


    }

}
