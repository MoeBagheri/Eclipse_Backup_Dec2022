package package01;

public class Class02 {

//	public Class02() {
		// TODO Auto-generated constructor stub
//	}
	
	
	/**
	 Another class that represents a rectangle.
	*/
		private String color = null;
	    private int width;
	    private int height; 

	    public Class02(String color) {
	    	this.color = color;
	    }

	    public Class02(int width, int height) {
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
