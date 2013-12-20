package questionare;

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

@SuppressWarnings("serial")
public class Questionare extends PApplet
{
	/**
	 * Eitan Zlatin 9/6/2013
	 * My Questions:
	 * 1) What pets do you own? Image
	 * 2) How many brothers do you have? 1 
	 * 3) What is your favorite color? Green
	 */
	private Image fish;
	private Image car;
	private Image apple;
	private Image shirt;
	private Image grass;
	private Image brother;
	private Image ball;
	private Image goal;
	
	private int currentSlide;
	private PFont font = new PFont();
	
	public void setup()
	{
		font = createFont("Arial",200);
		size(800,600);
		currentSlide = 0;
		clear();
		
		//Creates all the neccesary images
		fish= new Image(100,100,this,"Fish.jpg");
		car = new Image(100,100,this,"Car.jpg", 200, 200);
		apple = new Image(500,350,this,"Apple.jpg", 200, 200);
		shirt = new Image(100,350,this,"Shirt.jpg", 200, 200);
		grass = new Image(500,100,this,"Grass.jpg", 200, 200);
		brother = new Image(500,300,this,"Brother.jpg.JPG",100,100);
		goal = new Image(0,200,this,"Goal.jpg",100,200);
		ball = new Image(300,350, this, "Ball.jpg",50,50);
	}
	
	public void draw()
	{
		if(currentSlide == 0)
		{
			fill(255,255,0);
			textFont(font,60);
			text("What pets do you own?", 80,300);
		}
		
		if(currentSlide == 1)
		{
			fishMove();
		}
		
		if(currentSlide == 2)
		{
			fill(255, 127, 0);
			textFont(font,60);
			text("What is your favorite color?", 40,300);
		}
		
		if(currentSlide == 3)
		{
			displayGreen();
		}
		
		if(currentSlide == 4)//Change back to 4
		{
			fill(0, 191, 255);
			textFont(font,60);
			text("What siblings do you have?", 35,300);
		}
		
		if(currentSlide == 5)//Change back to 5
		{
			DisplayBro();
		}
		
		if(currentSlide == 6)
		{
			fill((int)(Math.random()* 256) , (int)(Math.random()* 256), (int)(Math.random()* 256));
			textFont(font,80);
			text("GOAL!!!!", 220,300);
		}
		
		if(currentSlide == 7)
		{
			fill(255, 255, 255);
			textFont(font,60);
			text("The End", 250,300);
		}
		
		if(currentSlide == 8)
		{
			System.exit(0);
		}
		if(currentSlide < 7)
		{
			textFont(font,12);
			fill(100);
			text("Click to continue",10,20);
		}
		
	}
	
	private void DisplayBro() 
	{
		background(50,205,50);
		if(brother.getX() > 350)
		{
			brother.updatePos(brother.getX() - 2, brother.getY());
		}
		else if(ball.getX() > 50)
		{
			ball.updatePos(ball.getX() - 2, ball.getY());
		}
		brother.draw();
		goal.draw();
		ball.draw();
	}

	private void displayGreen() 
	{
		background(0);
		car.draw();
		apple.draw();
		shirt.draw();
		grass.draw();
	}

	private void fishclear()
	{
		PImage img;
		img = loadImage("H:/Sea.jpg");
		img.resize(800, 600);
		background(img);
	}
	
	
	private void fishMove()
	{
		fishclear();
		fish.draw();
		fish.moveToMouse();
	}
	
	public void mouseClicked()
	{
		currentSlide++;
		background(0);
	}
	
	
}
