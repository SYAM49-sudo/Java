package Nothing;

public class ArrayOutOfBound {

	public static void main(String[] args) {
	int[] a = new int[3];
	a[0] = 5;
	a[1] = 6;
	a[2] = 8;
	a[3] = 10;//Out of Bound
	}

}
