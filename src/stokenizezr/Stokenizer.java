package stokenizezr;

import java.util.StringTokenizer; 

public class Stokenizer {
	// Demonstrate StringTokenizer. 
	static String in = "title=Java-Samples;" + 
	"author=Emiley J;" + 
	"publisher=java-samples.com;" + 
	"copyright=2007;"; 
	public static void main(String args[]) { 
	System.out.println(in);
	
	StringTokenizer st = new StringTokenizer(in, "=;"); 
	while(st.hasMoreTokens()) { 
	String key = st.nextToken(); 
	String val = st.nextToken(); 
	System.out.println(key + "\t" + val); 
	} 
	} 
}

