package com.example.demo.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	public static void main(String[] args) {
		String file = "E:\\Projects\\Resources\\Files\\filename.txt";
		
		fileReader(file);
//		writeFile("Dagdag message lang", file);
		
	}
	
	private static void createFile(String path) {
		try {
			File myFile = new File(path);
			if(myFile.createNewFile()) {
				System.out.println("File created: " + myFile.getName() );
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	private static void writeFile(String message, String path) {
		try {
			FileWriter fileWriter = new FileWriter(path);
			fileWriter.write(message);
			fileWriter.close();
	        System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	    }
	}
	
	private static void fileReader(String path) {
	    try {
	        File myObj = new File(path);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          System.out.println(data);
	        }
	        
	        writeFile("Additional kung may laman", path);
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}
