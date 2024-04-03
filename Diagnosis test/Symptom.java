/**
 * This is a Symptom class
 * It contains possible symptoms
 */
import java.util.*;
import javax.swing.*;

/**
 * 1. Cough
 * 2. Dizziness
 * 3. Fever
 * 4. Headache
 * 5. Joint Pain
 * 6. Runny Nose
 * 7. Sore Throat
 * 8. Stomach Ache
 */

public class Symptom extends JCheckBox
{
    //Instance variables
    private String symptomName;

    //Constructor
    public Symptom(Test reference)
    {
        symptomName = "";
    }

    /**
     * Gives symptom names 
     * (You can add extra symptoms. 
     * Don't forget to add its name here and increase constant variable (symptoms number) in test class. 
     * It should compile accroding to new updated symptoms.
     * @param number index of the component located in ArrayList
     * @return symptom name
     */
    public String setSymptomName( int number)
    {
        if(number == 1) 
        {

            symptomName = "Cough";
        }
        else if(number == 2) 
        {
            symptomName = "Dizziness";
        }
        else if(number == 3) 
        {
            symptomName = "Fever";
        }
        else if(number == 4) 
        {
            symptomName = "Headache";
        }
        else if(number == 5) 
        {
            symptomName = "Joint Pain";
        }
        else if(number == 6) 
        {
            symptomName = "Runny Nose";
        }
        else if(number == 7) 
        {
            symptomName = "Sore Throat"; 
        }
        else if(number == 8) 
        {
            symptomName = "Stomach Ache";
        }
        return symptomName;
    }

    public ArrayList<Integer> simplifyList(ArrayList<Integer> list)
    {
        sort(list);
        ArrayList<Integer> simplified = new ArrayList<Integer>();
        int recent = -1;
        for(int i = 0; i < list.size(); i++)
        {
            if(recent != list.get(i))
            {
                simplified.add(list.get(i));
                recent = list.get(i);
            }
        }
        return simplified;

    }
    public void sort(ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - i - 1; j++)
            {
                if(list.get(j)> list.get(j + 1))
                {
                    int temp = list.get(j);
                    list.set(j,list.get(j+ 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    public String getSymptomName()
    {
        return symptomName;
    }

}