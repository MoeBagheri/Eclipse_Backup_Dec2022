package moe_Bagheri_HW2;

import java.awt.image.*;
import java.awt.Color;
import java.io.*;
import javax.imageio.*;

public class TSquare {
	static final int SIDE = 1000; // image is SIDE X SIDE
	static BufferedImage image = new BufferedImage(SIDE, SIDE, BufferedImage.TYPE_INT_RGB);
	static final int WHITE = Color.WHITE.getRGB();
	static final int BLACK = Color.BLACK.getRGB();

	private static void drawSquare(int x, int y, int s, int myColor)
		//center of square is x,y length of side is s
	{
		if (s <= 0) // base case
			return;
		else {
			//determine corners
			int left = x - s / 2;
			int top = y - s / 2;
			int right = x + s / 2;
			int bottom = y + s / 2;

			//recursively paint squares at the corners
			int myNextColor = myColor - 100000;
			drawSquare(left, top, s / 2, myNextColor);
			drawSquare(left, bottom, s / 2, myNextColor);
			drawSquare(right, top, s / 2, myNextColor);
			drawSquare(right, bottom, s / 2, myNextColor);

			for (int i = left; i < right; i++)
				for (int j = top; j < bottom; j++) {
					image.setRGB(i, j, myColor);
				}

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
		int myColor = WHITE;
		drawSquare(SIDE / 2, SIDE / 2, SIDE / 4, myColor);

		//save image
		File outputfile = new File(fileOut);
		ImageIO.write(image, "jpg", outputfile);
	}
}