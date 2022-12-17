package practice03;

public class Rectangle {
	private int width = 5 ;
	private int height = 4;
	//private int _count;


	public int area() {
		return this.width * this.height;
		
	}


	
	 public void setWidth(int _width) {
	        this.width = _width;
	    }
	public int getWidth() {
        return this.width;
	}
 
	 public void setHeight(int _height) {
	        this.height = _height;
	    }
	public int getHeight() {
     return this.height;
	}
	
}