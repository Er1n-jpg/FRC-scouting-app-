import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class data extends JFrame {
    
    public data() {
        JFrame newFrame = new JFrame();
        newFrame.setBounds(0, 0, 1500, 900);
        newFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Dataholder holder = new Dataholder();
        String[] columnNames = {"Team Number", "Match Number", "l1 coral", "l2 coral", 
                               "l3 coral", "l4 coral", "Missed Coral","barge", "processor", "Deep Climb", 
                               "Shallow Climb", "Park", "Disabled", "Comments"}; // Array of column names for the sheet
      try (BufferedReader br = new BufferedReader(new FileReader("src/Scouting.txt"))) {
            String line; // File io folder for scouting.txt -> read and then throw into dataholder
            while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
                team storedTeam = new team(line);
                holder.addTeam(storedTeam);
            }
        } catch (IOException e) {
            System.out.println("File reading error: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
      
        }
        team storedTeam = null;
        try {
            FileReader fr = new FileReader("src/Scouting.txt"); // Read Scouting.txt file
            BufferedReader br = new BufferedReader(fr); 
            String line = br.readLine();
            while (line != null) {
                storedTeam = new team(line); // Uses special team constructor to parse the line
                holder.addTeam(storedTeam); 
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("File reading error");
        }    

        // Create model with correct columns
        DefaultTableModel model = new DefaultTableModel(columnNames, 20);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Add to frame using BorderLayout
        newFrame.add(scrollPane, BorderLayout.CENTER);
        
        // Add data from holder to new Obkject array (It won't take arrayList so its the quickets debug :cry:);
        // Gets each individual component
         for (int i = 0; i < holder.getTeamCount(); i++) {
            team currentTeam = holder.getTeam(i);
            model.addRow(new Object[]{
                String.valueOf(currentTeam.getTeamNum()),
                String.valueOf(currentTeam.getQualNum()),
                currentTeam.getCoral(1),
                currentTeam.getCoral(2),
                currentTeam.getCoral(3),
                currentTeam.getCoral(4),
                currentTeam.getCoral(5),
                currentTeam.getProcessorAlgae(),
                currentTeam.getBargeAlgae(),
                currentTeam.getDeepClimb(),
                currentTeam.getShallowClimb(),
                currentTeam.getpark(),
                currentTeam.getDisabled(),
                currentTeam.getComments()
            });
        } 
        
        newFrame.setVisible(true);
    

}


} 
