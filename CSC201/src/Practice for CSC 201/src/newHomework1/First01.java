package newHomework1;

import java.io.PrintStream;

public class First01 {
public static void (main[] args) {
	Point[] points = {
			new Point(3,4),
			new Point(5,6),
			null,
			null
	};
	
	File pointFile = new File("Car4.txt");
	PrintStream writer = new PrintStream( pointFile);


int index = 0;
while( index < points.length){
	if (points[index] !=null) {
		writer.println(points[index].x);
		writer.println(points[index].y);
	}
	index = index + 1;
	writer.close();
	
}
}
