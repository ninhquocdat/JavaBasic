package dat.edu.basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GhiFile {
public static void main(String[] args) {
	File file = new File("Dat.txt");
	try {
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		String name = "ninh quoc dat";
		bw.write(name);
		bw.close();
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
