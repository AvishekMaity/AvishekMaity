/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
import java.awt.*;
public class Testawt
{
  Testawt()
  {
    Frame fm=new Frame();    //Creating a frame
    Label lb = new Label("welcome to java graphics");   //Creating a label
    fm.add(lb);                  //adding label to the frame
    fm.setSize(300, 300);   //setting frame size.
    fm.setVisible(true);     //set frame visibilty true
  }
  public static void main(String args[])
  {
    Testawt ta = new Testawt();
  }
}

