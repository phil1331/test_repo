import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;

public class Test {
	
	public static void main (String [] args) throws IOException{
		
		final Process p = Runtime.getRuntime().exec("ipconfig /ALL");
		final BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(p.getInputStream())));
		for(String s; (s = br.readLine()) != null;) {
			System.out.println(s);
		}
		
	}


}

