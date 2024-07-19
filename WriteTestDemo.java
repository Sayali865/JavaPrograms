package com.iodemo;
// IO classes are belong to IO package
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTestDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("input.txt");
		
        String str = "copy this string to file";
        
        FileWriter writer = new FileWriter(file);
        
        writer.write(str);
        writer.close();
	}

}
