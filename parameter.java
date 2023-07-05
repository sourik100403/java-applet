// import java.applet.Applet;  
// import java.awt.Graphics;  
  
// public class parameter extends Applet{  
  
// public void paint(Graphics g){  
// String str=getParameter("name");  
// g.drawString(str,50, 50);  
// }  
  
// }  


//or

import java.applet.Applet;  
import java.awt.Graphics;  
  
public class parameter extends Applet{  
    String str=null;
    public void init(){
        str=getParameter("name");
    }
  
public void paint(Graphics g){   
g.drawString(str,50, 50);  
}  
  
} 

