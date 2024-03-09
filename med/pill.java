package med;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pill extends Medicine{

    public static ArrayList AllPills;
     
    public Pill(String name, String description){
        this.name = name;
        this.ID = ++super.ID;
    }

    public void fillPills(){
        String csvFile = "over_the_counter.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Split the line into fields
                String[] fields = line.split(csvSplitBy);
                
                // adds the pill into the big pile
                this.AllPills.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        csvFile = "prescribed.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Split the line into fields
                String[] fields = line.split(csvSplitBy);
                
                // adds the pill into the big pile
                this.AllPills.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
