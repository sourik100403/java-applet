import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
public class audioapplet extends Applet
{
    AudioClip clp;
    public void init()
    {
        clp=getAudioClip(getDocumentBase(),"a.mp3");

    }
    public void paint(Graphics g)
    {
       clp.play();
       clp.stop();
       clp.loop();

    }
}
