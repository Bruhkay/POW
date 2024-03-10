package med;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pill extends Medicine{

    public static ArrayList AllPills;
    public static ArrayList OTCpills;
    public static ArrayList prescribedPills;
     
    public Pill(String name, String description){
        super.name = name;
        this.ID = ++super.ID;
        AllPills = new ArrayList<>();
        OTCpills = new ArrayList<>();
        prescribedPills = new ArrayList<>();
        this.fillPills();
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
                this.OTCpills.add(fields);
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
                this.prescribedPills.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
