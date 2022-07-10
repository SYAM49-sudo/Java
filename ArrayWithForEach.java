package Nothing;

public class ArrayWithForEach {

	public static void main(String[] args) {
		int[] a = {1,7,8,11}; 
		int i=0;
	    //For Each loop
		for(int temp : a) {
			System.out.println("Array-"+i+" : "+temp);
			i++;
		}

	}

}
