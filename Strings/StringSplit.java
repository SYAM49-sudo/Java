package stringconcept;

public class StringSplit {

	public static void main(String[] args) {
		//String split() --> method(it is one of the String method)
		//Usuage of split() --> To split string two parts 
		String a = "Iam Syam Prasad";
		String[] b = a.split(" ");
		
		for(String temp : b) {
			System.out.println(temp);
		}
	}

}
/*Output
---------------------------------------------------------------------
Iam
Syam
Prasad
*/
