package ScreenSaverWorkshop;

//to use the imports you need to download and add the acm external jar
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;



public class WorkshopScreenSaver extends GraphicsProgram{
	
	public static final int APPLICATION_WIDTH = 1920;	
	public static final int APPLICATION_HEIGHT = 1080;
	
	// Constants 
	final int FISH_WIDTH = 350;
	final int FISH_HEIGHT = 150;
	final int BUBBLE = 80;
	final int X = 1920;
	
	// Creating the size of the window to the picture window
	public void init() {
		setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
	}
	
	// Taking the image we saved from google and making it the background of the window 
	// Save the image in eclipse workspace bin
	public void run() {
		GImage img1 = new GImage("Background.png");
		add(img1, 0, 0);
		
		// Creating a new fishTail 
		GPolygon fishTail = new GPolygon();
		// After making a new object, you need to add it onto the window so it will show up for the run
		add(fishTail);
		
		// Creating points of the fishTail 
		fishTail.addVertex(100, 180);
		fishTail.addVertex(150, 240);
		fishTail.addVertex(100, 300);
		fishTail.addVertex(260, 240);
		
		//Filling the fishTail
		fishTail.setFilled(true);
		fishTail.setColor(Color.YELLOW);
		
		// Creating the fish body
		GRect fish = new GRect(225, 170, FISH_WIDTH, FISH_HEIGHT);
		add(fish);
		fish.setFilled(true);
		fish.setColor(Color.GREEN);
		
		// Creating Fish Eyes 
		GOval fishEye = new GOval(510, 185, 40, 40);
		add(fishEye);
		fishEye.setFilled(true);
		fishEye.setColor(Color.WHITE);
		
		GOval fishPupil = new GOval(525, 195, 20, 20);
		add(fishPupil);
		fishPupil.setFilled(true);
		fishPupil.setColor(Color.BLACK);
		
		// Creating bubbles
		GOval bubble = new GOval(1500, 800, BUBBLE, BUBBLE);
		add(bubble);
		bubble.setFilled(true);
		bubble.setColor(Color.CYAN);
		
		GOval bubble2 = new GOval(1300, 800, BUBBLE, BUBBLE);
		add(bubble2);
		bubble2.setFilled(true);
		bubble2.setColor(Color.CYAN);
		
		// Animating the fish to move across the screen
		while(true) {
			
			fish.move(4, 0);
			fishTail.move(4,  0);
			fishEye.move(4, 0);
			fishPupil.move(4,  0);
			
			// Pause makes the animation run smoothly. big num = choppy speed
			pause(10);
			
			// Taking the fish pieces and resetting the location
			if (fish.getX() > X) {
				fish.setLocation(0, fish.getY());
				fishTail.setLocation(-225, fishTail.getY());
				fishEye.setLocation(291, 185);
				fishPupil.setLocation(307, 195);
			}
			
			// Moving the bubbles up the screen 
			bubble.move(0,  -5);
			pause(10);
			if (bubble.getY() < 100) {
				bubble.setLocation(1500, 800);
			}
			
			bubble2.move(0,  -3);
			pause(10);
			if (bubble2.getY() < 400) {
				bubble2.setLocation(1300, 800);
			}
		
		}
	
	}
	
}
