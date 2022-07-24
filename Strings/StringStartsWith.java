package stringconcept;

public class StringStartsWith {

	public static void main(String[] args) {
		String a = "Syam prasad";
		
		System.out.println(a.startsWith("Sya"));
		System.out.println(a.startsWith("pras", 5));
		System.out.println("Syam prasad".startsWith("S"));  /Direct method..
	}

}
/*Output
-------------------------------------------------------------------------------
true
true
true
*/
