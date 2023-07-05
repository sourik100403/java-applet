import java.applet.Applet;
import java.awt.*;
public class imageview extends Applet
{
    Image img;
    public void init()
    {
        img=getImage(getDocumentBase(),"java.jpg");

    }
    public void paint(Graphics g)
    {
        g.drawImage(img,100,100,this);

    }
}