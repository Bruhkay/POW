import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Test extends JFrame
{
    //Constant variables
    final private int SYMPTOMS_NUMBER = 8;

    //Instance variables
    private JPanel site;
    private JPanel symptomsPanel;
    private JPanel questionsPanel;
    private JPanel yesNoPanel;
    private JLabel result;
    private ArrayList<Integer> qNumbers;
    private ArrayList<Integer> sNumbers;
    private JPanel solutionsPanel;
    private ArrayList<JCheckBox> symptoms;
    private static ArrayList <Question> questions;
    private Symptom option;
    private ArrayList<Integer> simplifiedQ;
    private ArrayList<Integer> simplifiedS;
    
    public Test()
    {
        questionsPanel = new JPanel();
        solutionsPanel = new JPanel();
        yesNoPanel = new JPanel();
        option = new Symptom(this);
        result = new JLabel();

        symptoms = new ArrayList<JCheckBox>();
        questions = new ArrayList<Question>();
        simplifiedQ = new ArrayList<Integer>();
        simplifiedS = new ArrayList<Integer>();

        site = new JPanel();
        site.setLayout(new GridLayout(3,1));
        symptomsPanel = createSymptomsPanel();
        site.add(symptomsPanel );
        add(site);
        setSize(1000,1000);
    }

    /**
     * Give 
     * @return panel
     */
    public JPanel createSymptomsPanel()
    {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout()); // Symptom panel. Includes checkboxes, button
        JPanel chose = listSymptoms();
        p.add(chose, BorderLayout.CENTER);

        JButton done = new JButton("Next");
        ActionListener listener = new FirstListener();
        done.addActionListener(listener);
        p.add(done, BorderLayout.SOUTH);
        return p;
    
    }

    class FirstListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            qNumbers = new ArrayList<Integer>();
            questions = new ArrayList<Question>();
            site.remove(questionsPanel);
            site.remove(solutionsPanel);
            yesNoPanel = new JPanel();
            solutionsPanel = new JPanel();
            for(int i = 0; i < symptoms.size(); i++)
            {
                if(symptoms.get(i).isSelected() )
                {
                    if(symptoms.get(i).getText().equals("Cough"))
                    {
                        qNumbers.add(9);
                        qNumbers.add(11);
                        qNumbers.add(12);
                        qNumbers.add(13);
                    }
                    else if(symptoms.get(i).getText().equals("Dizziness"))
                    {
                        qNumbers.add(1);
                        qNumbers.add(3);
                        qNumbers.add(4);
                        qNumbers.add(5);
                        qNumbers.add(8);
                        qNumbers.add(10);
                    }
                    else if(symptoms.get(i).getText().equals("Fever"))
                    {
                        qNumbers.add(10);
                        qNumbers.add(13);
                    }
                    else if(symptoms.get(i).getText().equals("Headache"))
                    {
                        qNumbers.add(1);
                        qNumbers.add(2);
                        qNumbers.add(3);
                        qNumbers.add(5);
                        qNumbers.add(8);
                    }
                    else if(symptoms.get(i).getText().equals("Joint Pain"))
                    {
                        qNumbers.add(7);
                        qNumbers.add(8);
                    }
                    else if(symptoms.get(i).getText().equals("Runny Nose"))
                    {
                        qNumbers.add(9);
                        qNumbers.add(13);
                    }
                    else if(symptoms.get(i).getText().equals("Sore Throat"))
                    {
                        qNumbers.add(12);
                        qNumbers.add(13);
                    }
                    else if(symptoms.get(i).getText().equals("Stomach Ache"))
                    {
                        qNumbers.add(4);
                        qNumbers.add(13);
                    }
                }
            }

            simplifiedQ = option.simplifyList(qNumbers);
            yesNoPanel.setLayout(new GridLayout(simplifiedQ.size(), 1));

            for(int i = 0; i < simplifiedQ.size(); i++)
            {
                Question q = new Question(simplifiedQ.get(i));
                questions.add(q);
                yesNoPanel.add(q.getOneQ());
            }

            questionsPanel = createQuestionPanel();
            site.add(questionsPanel);
            paintComponents(getGraphics());
        }
    }

    public JPanel createQuestionPanel()
    {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(yesNoPanel, BorderLayout.CENTER);
        JButton done = new JButton("Continue");
        
        ActionListener listener = new SecondListener();
        done.addActionListener(listener);
        p.add(done, BorderLayout.SOUTH);
        return p;
    }

    class SecondListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            //solutionsPanel.remove(result);
            sNumbers = new ArrayList<Integer>();
            site.remove(solutionsPanel);
            solutionsPanel = new JPanel();
            String reco = "Reccomendations: ";
            result = new JLabel(reco);
            for(int i = 0; i < simplifiedQ.size(); i++ )
            {
                if(questions.get(i).getYesButton().isSelected())
                {
                    if((questions.get(i).getQ()).equals("Have you had too much caffeine or alcohol lately?"))
                    {
                        sNumbers.add(1);
                        sNumbers.add(2);
                        sNumbers.add(3);
                    }
                    else if((questions.get(i).getQ()).equals("Are you tired?"))
                    {
                        sNumbers.add(3);
                        sNumbers.add(5);

                    }
                    else if((questions.get(i).getQ()).equals("Did you hit your sore spot against something hard?"))
                    {
                        sNumbers.add(1);
                        sNumbers.add(4);
                        sNumbers.add(6);
                    }
                    else if((questions.get(i).getQ()).equals("Could you have consumed spoiled food recently?"))
                    {
                        sNumbers.add(7);
                    }
                    else if((questions.get(i).getQ()).equals("Are you hungry?"))
                    {
                        sNumbers.add(8);
                    }
                    else if((questions.get(i).getQ()).equals("Has gas accumulated in your stomach?"))
                    {
                        sNumbers.add(9);
                        sNumbers.add(10);
                    }
                    else if((questions.get(i).getQ()).equals("Have you exercised excessively lately?"))
                    {
                        sNumbers.add(1);
                        sNumbers.add(10);
                    }
                    else if((questions.get(i).getQ()).equals("Is your painful area swollen?"))
                    {
                        System.out.println("say");
                        sNumbers.add(4);
                    }
                    else if((questions.get(i).getQ()).equals("Have you come into contact with an allergen?"))
                    {
                        sNumbers.add(11);
                        sNumbers.add(12);
                    }
                    else if((questions.get(i).getQ()).equals("Have you been out in the sun too long?"))
                    {
                        sNumbers.add(2);
                        sNumbers.add(10);
                        sNumbers.add(14);
                        
                    }
                    else if((questions.get(i).getQ()).equals("Is your asthma triggered?"))
                    {
                        sNumbers.add(15);
                    }
                    else if((questions.get(i).getQ()).equals("Is there dryness in your throat?"))
                    {
                        sNumbers.add(16);
                    }
                    else if((questions.get(i).getQ()).equals("Did you catch a cold?"))
                    {
                        sNumbers.add(2);
                        sNumbers.add(10);
                        sNumbers.add(13);
                    } 
                }
            }

            //System.out.println(sNumbers);
            simplifiedS = option.simplifyList(sNumbers);
            //System.out.println(simplifiedS);
            for(int i = 0; i < simplifiedS.size(); i++)
            {
                Solution s = new Solution(simplifiedS.get(i));
                reco += s.getSolution();
            }
            result.setText(reco);
            solutionsPanel.add(result);
            site.add(solutionsPanel);
            paintComponents(getGraphics());
        }
    }

    public JPanel listSymptoms()
    {
        JPanel checkBoxes = new JPanel();
        checkBoxes.setLayout(new GridLayout((int)(SYMPTOMS_NUMBER + 1) / 2,2));
        for(int i = 1; i <= SYMPTOMS_NUMBER; i++ )
        {
            String title = option.setSymptomName(i);
            JCheckBox s = new JCheckBox(title);

            checkBoxes.add(s);
            symptoms.add(s);
        }
        return checkBoxes;
    }

    public JPanel getSite()
    {
        return site;
    }

}
