package Nothing;

public class ThreeDimensionalForEach {

	public static void main(String[] args) {
		int[][][] a= {{{1,2,3,4},{42,52,62,7},{5,7,6,7}} , {{5,3,2,1},{6,7,62,7},{3,6,7,5}}};
		
		for(int[][] tempOne : a) {
			for(int[] tempTwo : tempOne) {
				for(int tempThree : tempTwo ) {
					System.out.print(tempThree+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
