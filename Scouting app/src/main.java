import java.util.Arrays;
import java.io.*;
public class main {
    public static void main(String[] args){
        try {
            
        FileWriter fw = new FileWriter("Scouting.txt");
        PrintWriter pw = new PrintWriter(fw);
        
      

        } catch (IOException e){
            System.out.println("cannot Writer in file");
        }

        try {
        FileReader fr = new FileReader("Scouting.txt");
        BufferedReader br = new BufferedReader(fr);
        } catch (IOException e){
            System.out.println("cannot Writer in file");
        }



    }
}