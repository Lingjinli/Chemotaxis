import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

 Bacteria[] cars = new Bacteria [10];
 int bacteriaX = ((int)(Math.random()*401));
 int bacteriaY = ((int)(Math.random()*401)); 
 public void setup()   
 {     
 	//initialize bacteria variables here
 	for(int i=0; i<10; i++)
 	{
 		cars[i]=new Bacteria(i*5,i*5);
 	}
 	size(500,500);   
 }   
 public void draw()   
 {
 	background(0);
 	//move and show the bacteria   
 	for (int i=0; i<10; i++)  
 	{
 		cars[i].walk();
 		cars[i].show();
 	}
 }  
 class Bacteria    
 {     
 	//lots of java!   
 	int bacteriaX, bateriaY;
 	Bacteria (int x, int y)
 	{
 		bacteriaX = 200*(int)(Math.random()*10)-5;
 		bacteriaY = 200*(int)(Math.random()*10)-5;
 	}
 	public void walk()
 	{
 		bacteriaX += (int)(Math.random()*5)-2;
 		bacteriaY += (int)(Math.random()*5)-2;
 		if (bacteriaX>499)
 		{
 			bacteriaX = ((int)(Math.random()*401));
 		}
 		if (bacteriaY>499) 
 		{ 
 			bacteriaY = ((int)(Math.random()*401));
 		}
 			
 	}
 	public void show()
 	{
 		fill(255);
 		ellipse(bacteriaX, bacteriaY,15,15);
 	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
