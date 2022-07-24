package Nothing;

public class ThreeDimensional {

	public static void main(String[] args) {
		int[][][] a= {{{1,2,3,4},{42,52,62,7},{5,7,6,7}} , {{5,3,2,1},{6,7,62,7},{3,6,7,5}}};
		    
		System.out.println("The number of two dimensional arrays in this 3 dimensional array are : "+a.length);
		System.out.println("The number of single dimensional arrays in the first two dimensional array : "+a[0].length);
		System.out.println("The number of single dimensional arrays in the second two dimensional array : "+a[1].length);
		System.out.println("The number of values in first single dimensional array in the first two dimensional array : "+a[0][0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				for(int k=0;k<a[0][0].length;k++) {
				System.out.print(a[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
