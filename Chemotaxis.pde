 Bacteria[] cars = new Bacteria [10];
 int bacteriaX = ((int)(Math.random()*401));
 int bacteriaY = ((int)(Math.random()*401)); 
 void setup()   
 {     
 	//initialize bacteria variables here
 	for(int i=0; i<10; i++)
 	{
 		cars[i]=new Bacteria(i*5,i*5);
 	}
 	size(500,500);   
 }   
 void draw()   
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
 	void walk()
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
 	void show()
 	{
 		fill(255);
 		ellipse(bacteriaX, bacteriaY,15,15);
 	}
}
