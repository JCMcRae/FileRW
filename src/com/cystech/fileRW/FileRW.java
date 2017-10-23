package com.cystech.fileRW;

import java.io.*;

public class FileRW {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		readData("file.txt");
//		System.out.println("\n");
//		writeData("file.txt", "Adidas","EQT Support 93",2017,"JCMcRae");
//		System.out.println("\n");
//		readData("file.txt");
//	}
	
	public static void readData(String file){
		String filename = "res/" + file;
		String line = null;
		
		try{
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			
			while((line = bufferReader.readLine()) != null){
				System.out.println(line);
			}
			
			bufferReader.close();
			
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}catch(IOException e){
			System.out.println("File Cannot Be Read");
		}
	}
	
	public static void writeData(String file, String brand, String model, int year, String owner){
		String filename = "res/" + file;
		
		try{
			FileWriter fileWriter = new FileWriter(filename, true);
			BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
			BufferedReader fileReader = new BufferedReader(new FileReader(filename)); 
			
			if (fileReader.read() == -1) {
				bufferWriter.write(brand + "," + model + "," + year + "," + owner);
				bufferWriter.newLine();
				bufferWriter.close();
			}else{
				bufferWriter.write(brand + "," + model + "," + year + "," + owner);
				bufferWriter.newLine();
				bufferWriter.close();
			}
			
			fileReader.close();
			System.out.println("Data Written Into File");
			
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}catch(IOException e){
			System.out.println("Cannot Write To File");
		}
	}
	
//	public static void writeData(){
//		//Standby method for future use of this API.
//	}
}
