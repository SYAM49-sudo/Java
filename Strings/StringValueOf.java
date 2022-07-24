package stringconcept;

public class StringValueOf {

	public static void main(String[] args) {
		// String valueOf() --> method(To convert any value to String);
		//pre emptive data types --> int,char,double,float,boolean
		int a = 10;
		char b = 'c';
		double c = 10.5;
		float d = 10.56f;
		boolean e = true;
		//Covertion Process
		String av = String.valueOf(a);
		String bv = String.valueOf(b);
		String cv = String.valueOf(c);
		String dv = String.valueOf(d);
		String ev = String.valueOf(e);
		
		System.out.println(av);
		System.out.println(bv);
		System.out.println(cv);
		System.out.println(dv);
		System.out.println(ev);
		
		//wrapper class
		
		Integer f = 10;
		Character g = 'c';
		Double h = 10.5;
		Float i = 10.56f;
		Boolean j = true;
        
		System.out.println();
		
		System.out.println();
		//Covertion Process
				String fv = String.valueOf(f);
				
				String gv = String.valueOf(g);
				String hv = String.valueOf(h);
				String iv = String.valueOf(i);
				String jv = String.valueOf(j);
				
				System.out.println(fv);
				System.out.println(gv);
				System.out.println(hv);
				System.out.println(iv);
				System.out.println(jv);
				
				//Arrays
				char[] k= {'a','b','c'};
				//String Demo = String.copyValueOf(k); //Its only access char[]
				String st = "Syam Prasad";
				String kv = String.valueOf(k);
				String stv = String.valueOf(st);
				String ArrayChar = String.valueOf(k, 1, 1);
				//String Hello = String.copyValueOf(k, 1, 2);
				//System.out.println(Hello);
				
				System.out.println(kv);
				
				System.out.println(ArrayChar); //char
				
				System.out.println(stv);  //String
				
	}

}
/*Output
10
c
10.5
10.56
true


10
c
10.5
10.56
true
abc
b
Syam Prasad
*/
