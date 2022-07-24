package stringconcept;

public class StringIndexMethod {

	public static void main(String[] args) {
		String a ="This is syam prasadH...How Are You...You and me....This is Pavan";
		
		System.out.println(A(a,"How"));

	}
	public static String A(String a,String b) {
		    if(a.indexOf(b)!= -1) {
		    	return b+" --> This value Available - Index no : "+a.indexOf(b);
		    }
		    else {
		    	return b+" --> Not available";
		    }
		    
	}

}

/*Output
  How --> This value Available - Index no : 23
  */
