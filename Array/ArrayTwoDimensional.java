package Nothing;

public class ArrayTwoDimensional {

	public static void main(String[] args) {
	//Two Dimensional Array
		int[][] a = new int[2][3];
			
		a[0][0] = 1;
		a[0][1] = 10;
		a[0][2] = 5;
		a[1][0] = 11;
		a[1][1] = 15;
		a[1][2] = 17;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
	}
}