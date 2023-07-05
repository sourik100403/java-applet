import java.applet.Applet;  
import java.awt.*;  
  
public class input_text extends Applet{
    TextField  t1,t2;
    public void init()
    {
        t1=new TextField(5);
        t1=new TextField(5);
        add(t1);
        add(t2);
    }
  
public void paint(Graphics g){  
int x=0;
x=Integer.parseInt(t1.getText());
t2.setText(String.valueOf(x * x));
}  
  
} 