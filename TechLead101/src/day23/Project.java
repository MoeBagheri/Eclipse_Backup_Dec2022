package day23;

public class Project {

	public static void main(String[] args) {
        String res = repeatFront("Chocolate", 4);
        System.out.println(res);
    }

    public static String repeatFront(String str, int n) {
        String res = "";
        while(n>0) {
      for (int count =1; count<=n; count++){
        res = res + str.substring(0,n);
        n--;
        
        	
        }

		}
    
    return res;
}
}