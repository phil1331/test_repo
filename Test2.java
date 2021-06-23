import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Test2 {
	
	
	
	public static void main (String [] args) throws URISyntaxException, IOException{
		
		Desktop.getDesktop().browse(new URI("https://google.de"));
		
	}



}

