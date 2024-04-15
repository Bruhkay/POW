import javax.swing.*;
import java.awt.*;

public class Obstacle
{
    private int x;
    private int y;
    private int width;
    private int height;

    public Obstacle(int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }

    /**
     * Draw obstacle in black
     * @param g graphics object
     */
    public void draw(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

    //Getter methods
    public int getXCoor()
    {
        return x;
    }
    public int getYCoor()
    {
        return y;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
}
