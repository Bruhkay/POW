import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
//import javax.swing.Timer;

public class GridPanel extends JComponent
{

    private GridFrame gridFrame;
    private ArrayList<Home> homes;
    private ArrayList<Obstacle> obstacles;
    private Van van;
    private JButton moveButton;


    public GridPanel(GridFrame ref, JButton b)
    {
        gridFrame = ref;
        moveButton = b;
        homes = createHomes();
        obstacles = createObstacles();
        van = new Van(105,55);

        /*TimeListener listener = new TimeListener();
        Timer t = new Timer(1000, listener);
        t.start();*/


        ActionListener listener = new ClickListener();
        moveButton.addActionListener(listener);
        
    }

    /**
     * Create all homes according to gird. Center of all squares there is a home.
     * @return all home objects in the ArrayList
     */
    public ArrayList<Home> createHomes()
    {
        
        ArrayList<Home> homes = new ArrayList<Home>();

        for(int i = gridFrame.getStartW() + (gridFrame.getEachSquare()/ 2); i < gridFrame.getWidth(); i += gridFrame.getEachSquare())
        {
            for(int j = gridFrame.getStartH() + (gridFrame.getEachSquare()/ 2); j < gridFrame.getHeight(); j += gridFrame.getEachSquare())
            {
                
                Home h = new Home(i, j);
                homes.add(h);
            }
        }
        return homes;
    }

    /**
     * Create all obstacles according to coordinates.
     * @return all obstacle objects in the ArrayList
     */
    public ArrayList<Obstacle> createObstacles()
    {
        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
        Obstacle obs1 = new Obstacle(155, 55, 200, 100); //Obstacle coordinates will be taken from A* code.
        Obstacle obs2 = new Obstacle(300, 200, 100, 100);
        obstacles.add(obs1);
        obstacles.add(obs2);
        return obstacles;
    }

    class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(van.getCurrentRoad() < 11) //This will be determined by A* algorithm.(not hardcode)
            {
                moveVan();
                repaint();
                if(van.getCurrentRoad() == 11)
                {
                    System.out.println("VAN REACHED TO TARGET!");
                    gridFrame.dispose();
                }
            }
            
        }
    }

    /**
     * make van follow its path
     */
    public void moveVan()
    {
        van.setCurrentRoad();
        int nextX = van.getRoad()[van.getCurrentRoad()][0];
        int nextY = van.getRoad()[van.getCurrentRoad()][1];
        van.setXCoor(nextX);
        van.setYCoor(nextY);
    }

    public void paintComponent(Graphics g)
    {
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\burka\\Desktop\\20240412_173426.jpg");
        Image image = imageIcon.getImage();
        g.drawImage(image, 9, 13, 650, 650, this);
        
        for(int j = 0; j < homes.size(); j++)
        {
            homes.get(j).draw(g);
        }

        for(int i = 0; i < obstacles.size(); i++)
        {
            obstacles.get(i).draw(g);
        }

        van.draw(g);
    }
}
