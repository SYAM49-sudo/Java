package stringconcept;

public class StringReplace {

	public static void main(String[] args) {
		//String replace() --> Method
		String a = "S.hyam Prasad";
		System.out.println(a.replace("y","l"));
		System.out.println(a.replaceFirst("a", "s"));
		System.out.println(a.replaceAll(""," "));
		System.out.println(a.replace("h", ""));  // remove h character in a string
		System.out.println(a.replace(".", ""));
		//
	}

}
/*Output
--------------------------------------------------------------------------------------------
S.hlam Prasad
S.hysm Prasad
 S . h y a m   P r a s a d 
S.yam Prasad
Shyam Prasad
*/
