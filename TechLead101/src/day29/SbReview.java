package day29;

public class SbReview {
	//public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("A");
		System.out.println(sb);
		System.out.println("size: "+sb.length());
		
		sb.append(" B");
		System.out.println(sb);
		System.out.println("size: "+sb.length());

		sb.append(" C");
		System.out.println(sb);
		System.out.println("size: "+sb.length());
		
		System.out.println("-------");
		
		//insert:
		sb.insert(4, "X ");
		System.out.println(sb);
		System.out.println("size: "+sb.length());
		
		//delete:
		sb.delete(3, 5);
		System.out.println(sb);
		System.out.println("size: "+sb.length());
	}

}
