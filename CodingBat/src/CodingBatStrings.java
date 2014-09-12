public class CodingBatStrings {

	public static void main(String[] args) {
		System.out.println("Hello there");
		withoutString("Hello thellrlloe", "l");
	}

	public static String withoutString(String base, String remove) {
		  int rlen = remove.length();
		  int blen = base.length();
		  System.out.println("blen: " + blen);
		  System.out.println("rlen: " + rlen);
		  String fin ="";
		  for (int i=0; i<=blen-1; i++){
			  System.out.println(i);
		    if(i+rlen<=blen){if (base.substring(i,i+rlen).equals(remove)){
			      i= i+ rlen-1;
			    }
			    else {
			    fin= fin + base.substring(i, i+1);
			    System.out.println("else condition: " + fin);
			    }}
		    
		    else {
			   
			    fin= fin + base.substring(i);
			    break;
			    
			   }
		  }
		  System.out.println(fin);
		  return fin;
		}
}
