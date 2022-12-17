package moe_Bagheri_HW2;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Driver {
	static final int SIDE = 1000; // image is SIDE X SIDE
	static BufferedImage image = new BufferedImage(SIDE, SIDE, BufferedImage.TYPE_INT_RGB);
	static final int WHITE = Color.WHITE.getRGB();
	static final int BLACK = Color.BLACK.getRGB();

	private static void drawSquare(int x, int y, int s, int myColor, int target_x, int target_y)
	//center of square is x,y length of side is s
	{
		// set up the todo list with the initial square (whose chidren are not yet drawn)
		LinkedStack<Square> todo = new LinkedStack<Square>();
		
		Square firstSquare = new Square(x, y, s, myColor);
		todo.push(firstSquare);
		
		boolean atTarget = false;
		
		// as long as there's something to do
		while(todo.isEmpty() == false && atTarget == false) {
			// get the top square off the list and remove from the stack
			Square processMe = todo.top();
			todo.pop();
			
			// if the children are added already, it is ok to add itself
			if(processMe.childrenAddedYet()) {
				processMe.addYourself(image);
			}
			// otherwise, it should put itself back on the stack, THEN all of its children
			else {
				todo.push(processMe);
				atTarget = processMe.addChildren(todo, target_x, target_y);
			}
		}
		if(atTarget == false) {
			System.out.println("Target unreachable");
		}
		else {
			System.out.println("Target reached!");
		}
		while(todo.isEmpty() == false) {
			//draw any remaining squares
			Square processMe = todo.top();
			todo.pop();
			processMe.addYourself(image);			
		}
		
	}


	public static void main(String[] args) throws IOException {
		String fileOut = "helloSquares.png";

		//make image black
		for (int i = 0; i < SIDE; i++)
			for (int j = 0; j < SIDE; j++) {
				image.setRGB(i, j, BLACK);
			}

		//first square
		//drawSquare(SIDE/2, SIDE/2, SIDE/2);
		//first square
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type your target x and y like this: 135, 300" );
		System.out.println("Hint: if you put (123, 45) it will be unreachble but if you put (34,567) it will reach the target" );
				
		String[] target = sc.nextLine().split(", ");
		int target_x = Integer.parseInt(target[0]);
		int target_y = Integer.parseInt(target[1]);

		int myColor = WHITE;
		drawSquare(SIDE / 2, SIDE / 2, SIDE / 2, myColor, target_x, target_y);

		// add the target to the image 
		for(int i=-4;i<=4;i++) {
			for(int j=-4;j<=4;j++) {
				image.setRGB(target_x+i, target_y+j, Color.red.getRGB());
			}
		}

		
		//save image
		File outputfile = new File(fileOut);
		ImageIO.write(image, "jpg", outputfile);
		System.out.println("the file is created. Please serch --> helloSquares.png <-- in your project src!");
	}
}
