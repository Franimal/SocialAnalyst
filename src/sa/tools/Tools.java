package sa.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;

public class Tools {

	public static void main(String[] args) throws Exception {
	    File someFile = new File("data/cities15000.txt");
	    File temp = File.createTempFile(someFile.getName(), null);
	    BufferedReader reader = null;
	    PrintStream writer = null;

	    try {
	        reader = new BufferedReader(new FileReader(someFile));
	        writer = new PrintStream(temp);

	        String line;
	        while ((line = reader.readLine())!=null) {
	            // manipulate line
	            writer.println(line);
	        }
	    }
	    finally {
	        if (writer!=null) writer.close();
	        if (reader!=null) reader.close();
	    }
	    if (!someFile.delete()) throw new Exception("Failed to remove " + someFile.getName());
	    if (!temp.renameTo(someFile)) throw new Exception("Failed to replace " + someFile.getName());
	}
	
}
