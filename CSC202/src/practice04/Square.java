package practice04;



public class Square extends Rectangle {
	
	
	
	public Square (int edge) {
	this.hight = edge;
	this.width = edge;
	}

 public void setWidth (int width){
 this.width = width;
 this.hight = width;
 }
 public void setHight (int hight){
	 this.hight = hight;
	 this.width = hight;
	 }
 
 public int getWidth () {
 return width;
 }
 public int getHight () {
	 return hight;
	 }
 
 
}
