package Nothing;

public class TwoDimensionalForloop {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{52,62,7}};
		System.out.println("Array Length of the two dimensional  : "+a.length);
		System.out.println("Array length of first one dimensional  : "+a[0].length);
		System.out.println("Array length of second one dimensional : "+a[1].length);
		
		for(int i=0;i<a.length;i++) {  //
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
