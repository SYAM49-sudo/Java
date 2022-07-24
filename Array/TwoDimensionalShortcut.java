package Nothing;

public class TwoDimensionalShortcut {

	public static void main(String[] args) {
	//Shortcut TwoDimensional
		int[][] a= {{1,2,20},{52,62,7}};
		System.out.println("Array Length : "+a.length);
		System.out.println("a[0] : "+a[0].length);
		System.out.println("a[1] : "+a[1].length);
		/*System.out.println(a[0][0]);
		System.out.println(a[0][1]);	
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		*/
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
