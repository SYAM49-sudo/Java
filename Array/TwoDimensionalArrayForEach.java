package Nothing;

public class TwoDimensionalArrayForEach {

	public static void main(String[] args) {
		int[][] a= {{1,2,20},{52,62,7}};
		
		for(int[] tempOne : a) {
			for(int tempTwo : tempOne) {
				System.out.print(tempTwo+"\t");
			}
			System.out.println();
		}

	}

}
