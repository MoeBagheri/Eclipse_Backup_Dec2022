package hw1_john_doe;
/**
 Another class that represents a rectangle.
*/
public class Rectangle2
{
	private String color = null;
    private int width;
    private int height; 

    public Rectangle2(String color) {
    	this.color = color;
    }

    public Rectangle2(int width, int height) {
    	this.width = width;
    	this.height = height;
    }
    
    public void setColor(String _color) {
    	this.color = _color;
    }
    public void setDimensions(int newWidth, int newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    public int getArea()
    {
		return width * height;
	}
    
    public int getWidth() {
    	return width;
    }
    
    public int getPerimeter() {
    	return 2*(width + height);
    }
}

