package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScreen extends JFrame {

    private enum State {
        START, RUNNING, PAUSE, GAME_OVER
    }

    private State currentState = State.START;
    private JPanel gamePanel;
    private JButton startButton;

    public GameScreen() {
        setTitle("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawScreen(g);
            }
        };
        gamePanel.setPreferredSize(new Dimension(800, 600));
        add(gamePanel);

        startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentState = State.RUNNING;
                gamePanel.repaint();
            }
        });

        //Add start button to the start screen
        JPanel startPanel = new JPanel();
        startPanel.add(startButton);
        add(startPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void drawScreen(Graphics g) {
        switch (currentState) {
            case START:
                drawStartScreen(g);
                break;
            case RUNNING:
                drawGameScreen(g);
                break;
            case PAUSE:
                drawPauseScreen(g);
                break;
            case GAME_OVER:
                drawGameOverScreen(g);
                break;
        }
    }

    private void drawStartScreen(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Start Screen", 300, 200);
    }

    private void drawGameScreen(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Game Screen", 300, 200);
    }

    private void drawPauseScreen(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Pause Screen", 300, 200);
    }

    private void drawGameOverScreen(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Game Over", 300, 200);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameScreen();
            }
        });
    }
}

