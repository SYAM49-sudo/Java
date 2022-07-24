package stringconcept;

public class StringConcat {

	public static void main(String[] args) {
		//String concat() --> method (Add Two Strings)
		String a = "Syam";
		String b = " ";
		String c = "Prasad";
		System.out.println(a.concat(b).concat(c));
		System.out.println("Syam".concat(" ").concat("Prasad"));
		System.out.println("One".concat(" ").concat("Two").concat(" ").concat("Three"));
		System.out.println(a+b+c); // In addition operator same as concat();//
		

	}

}
/*Output
 Syam Prasad
 Syam Prasad
 One Two Three
 Syam Prasad
 */
