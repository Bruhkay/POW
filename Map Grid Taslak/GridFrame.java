import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.Timer;

public class GridFrame extends JFrame
{
    private final int FRAME_WIDTH = 505;
    private final int FRAME_HEIGTH = 505;
    private final int START_WIDTH = 5;
    private final int START_HEIGHT = 5;
    private final int EACH_SQUARE = 50;

    private JPanel panel;
    private JComponent girdPanel;
    private JButton b;

    public GridFrame()
    {
        
        panel = new JPanel();
        
        //panel.set
        panel.setLayout(new BorderLayout());
        b = new JButton("Move");
        panel.add(b, BorderLayout.SOUTH);
        girdPanel = createGridPanel();
        panel.add(girdPanel, BorderLayout.CENTER);
        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGTH);
        setResizable(false);
        setVisible(true);
    }

    public JComponent createGridPanel()
    {
        JComponent panel = new GridPanel(this, b);
        return panel;
    }

    //Getter methods
    public int getWidth()
    {
        return FRAME_WIDTH;
    }
    public int getHeight()
    {
        return FRAME_HEIGTH;
    }
    public int getStartW()
    {
        return START_WIDTH;
    }
    public int getStartH()
    {
        return START_HEIGHT;
    }
    public int getEachSquare()
    {
        return EACH_SQUARE;
    }
}