package package01;

public class Class03 {

//	public Class03() {
		// TODO Auto-generated constructor stub
//	}
		public static void main(String[] args) {
			int[] arr = new int[100];
		    // 1 2 4 7 11 16 22 29 37 46 --- <100
			int sum = 1;
			for (int i=0; i<100; i++) {
				sum = sum + i;
				arr[i] = sum;
			}
			for (int i=0;i<100;i++) {
				System.out.print(arr[i] +" ");
			}
		}}
