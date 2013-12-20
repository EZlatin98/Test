package questionare;

import processing.core.PApplet;
import processing.core.PImage;

public class Image
{
	private PApplet parent;
	private int x,y;
	private PImage image;
	private boolean up;
	private boolean left;
	
	public Image(int startX, int startY, PApplet startParent, String path)
	{
		x= startX;
		y= startY;
		up = true;
		left = true;
		parent = startParent;
		image = parent.loadImage(path);
		image.resize(50, 50);
	}

	public Image(int startX, int startY, PApplet startParent, String path, int xSize, int ySize)
	{
		x= startX;
		y= startY;
		up = true;
		left = true;
		parent = startParent;
		image = parent.loadImage(path);
		image.resize(xSize, ySize);
	}
	
	public void draw()
	{
		parent.image(image,x,y);
	}
	
	
	public void moveToMouse()
	{
		int speed = 5;
		
		if(left)
		{
			x-=speed;
		}
		else
		{
			x+=speed;
		}
		
		if(up)
		{
			y-=speed;
		}
		else
		{
			y+=speed;
		}
		
		if(x<parent.mouseX)
		{
			if(left==true)
			{
				parent.rotate((float) Math.PI);
			}
			left = false;
			
		}
		else
		{
			if(left==false)
			{
				parent.rotate((float) Math.PI);
			}
			left = true;
		}
		
		if(y<parent.mouseY)
		{
			up = false;
		}
		else
		{
			up = true;
		}
	}
	
	public void updatePos(int x,int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() 
	{
		return x;
	}

	public int getY() 
	{
		return y;
	}
}
