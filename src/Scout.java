

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Scout extends JFrame implements ActionListener {

    private Image backgroundImage;
    private JPanel backgroundPanel;
    static JFrame frame;

    JButton start, data, exit, home;




public Scout(){

    setBounds(0, 0, 1500, 900);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);

    backgroundPanel = new BackgroundPanel(); // Declaing and setting the bounds for the background panel
    backgroundPanel.setBounds(0, 0, 1500, 900);
    backgroundPanel.setLayout(null);
    setContentPane(backgroundPanel);

    start = new JButton(); // Clear button to start program -> goes to scoutScreen
    start.setBounds(240,430,375,225);
    start.setVisible(true);
    start.setOpaque(false);
    start.setContentAreaFilled(false);
    start.setBorderPainted(false);
    start.addActionListener(this);

    data = new JButton(); //  Clear button to go to data screen -> goes to data
    data.setBounds(870,430,375,225);
    data.setVisible(true);
    data.setOpaque(false);
    data.setContentAreaFilled(false);
    data.setBorderPainted(false);
    data.addActionListener(this);



    backgroundPanel.add(start);
    backgroundPanel.add(data);
    setVisible(true);


}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start) {
            new ScoutScreen(); // Makes a new ScoutScreen and disposes of scout
            dispose();
        }

     
        if (e.getSource() == data) {
            new data(); // Makes a new data screen and disposes of scout
            dispose();

        }

    } 

    public static void main(String[] args){
        new Scout();
    }



}

 class BackgroundPanel extends JPanel { // Method to create a background panel with an image
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image background = new ImageIcon("title.png").getImage();
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }
}