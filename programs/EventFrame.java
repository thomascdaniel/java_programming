import java.awt.event.*;
import java.awt.*;
public class EventFrame
{
  Button b1;
  TextField t1;
  Frame f1;
  public static void main(String[] args)
  {
    EventFrame f=new EventFrame();
  }
  public EventFrame()
  {
    f1=new Frame("Window Title");
    b1=new Button("Click Here");
    b1.setSize(10,100);
    t1=new TextField();
    t1.setSize(10,200);
    f1.setLayout(new FlowLayout());
    f1.add(b1);
    f1.add(t1);
    ButtonListener listen = new ButtonListener();
    b1.addActionListener(listen);
    f1.addWindowListener(listen);
    t1.addKeyListener(listen);
    f1.setSize(800,800);
    f1.setVisible(true);
  }
}
class ButtonListener extends WindowAdapter implements ActionListener,MouseMotionListener, KeyListener
{
  //ActionListener
  public void actionPerformed(ActionEvent evt)
  {
    Button s=(Button)evt.getSource();
    s.setLabel("Button clicked");
  }
  //MouseMotionListener
  public void mouseDragged(MouseEvent e)
  {
    Button s1=(Button)e.getSource();
    s1.setLabel("Mouse Dragged");
  }
  public void mouseMoved(MouseEvent e)
  {
    Button s2=(Button)e.getSource();
    s2.setLabel("Mouse Moved");
  }

  //WindowAdapter
  public void windowClosing(WindowEvent e)
  {
    System.exit(0);
  }
  //KeyListener
  public void keyPressed(KeyEvent e)
  {
    TextField s2=(TextField)e.getSource();
    s2.setText("Key pressed");
  }
  public void keyReleased(KeyEvent e)
  {
    TextField s2=(TextField)e.getSource();
    s2.setText("Key Released");
  }
  public void keyTyped(KeyEvent e)
  {
    TextField s2=(TextField)e.getSource();
    s2.setText("Key Typed");
  }
}
