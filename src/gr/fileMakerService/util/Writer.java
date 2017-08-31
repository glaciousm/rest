package gr.fileMakerService.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Writer {
	
	public static String write(String fileName, String filePath, String writeString) throws IOException{
		String path = filePath + fileName;
		
		File file = new File(path);
		File directory = new File(filePath);
		Path pathStr =  Paths.get(filePath);
		
		System.out.println(filePath+fileName);
		
		if (file.exists()) {
			System.out.println("Append");
			writeString = System.getProperty("line.separator") + writeString;
			Files.write(Paths.get(path), writeString.getBytes(), StandardOpenOption.APPEND);
			
			System.out.println(filePath+fileName);
			return "Append";
		} else {
			if (directory.exists()) {
				System.out.println("Write");
				Files.write(Paths.get(path), writeString.getBytes());
				
				System.out.println(filePath+fileName);
				return "Created";
			} else {
				System.out.println("Write and Make Folder");
				Files.createDirectories(pathStr);
				Files.write(Paths.get(path), writeString.getBytes());
				
				System.out.println(filePath+fileName);
				return "Created";
			}
			
		}
	}

}
