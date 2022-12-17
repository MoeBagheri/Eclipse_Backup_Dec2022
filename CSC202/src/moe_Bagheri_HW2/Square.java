package moe_Bagheri_HW2;

import java.awt.image.BufferedImage;

public class Square {
	int x;
	int y;
	int s;
	int myColor;

	boolean childrenAdded;

	//corners
	int left;
	int top;
	int right;
	int bottom;
	
	// color
	int myNextColor;

	public Square(int x, int y, int s, int myColor) {
		this.x = x;
		this.y = y;
		this.s = s;
		this.myColor = myColor;
		this.childrenAdded = false;
		
		//determine corners
		left = x - s / 2;
		top = y - s / 2;
		right = x + s / 2;
		bottom = y + s / 2;

		//and next color
		myNextColor = myColor - 100000;
	}
	
	public boolean childrenAddedYet() {
		return childrenAdded;
	}
	
	public boolean addChildren(LinkedStack<Square> todo, int target_x, int target_y) {
		if(s/2 > 0) {
			
			if(target_x >= left && target_x <= right && target_y >= top && target_y <= bottom) {
				return true;
			}
			else if(target_x <= x && target_y <= y) {
				todo.push(new Square(left, top, s/2, myNextColor));
			}
			else if(target_x <= x && target_y > y) {
				todo.push(new Square(left, bottom, s/2, myNextColor));
			}
			else if(target_x > x && target_y <= y) {
				todo.push(new Square(right, top, s/2, myNextColor));
			}
			else if(target_x > x && target_y > y) {
				todo.push(new Square(right, bottom, s/2, myNextColor));
			}
			else {
				// unreachable
			}
		}
		childrenAdded = true;
		return false;
	}
	
	public void addYourself(BufferedImage image) {
		for (int i = left; i < right; i++)
			for (int j = top; j < bottom; j++) {
				image.setRGB(i, j, myColor);
			}
	}

	

}
