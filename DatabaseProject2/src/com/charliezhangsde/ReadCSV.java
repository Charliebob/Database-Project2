package com.charliezhangsde;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ReadCSV {

	public static void main(String[] args){
		
		ReadCSV obj = new ReadCSV();
		obj.run();
		
	}
	
	public void run(){
		
		RandomAccessFile file;
		
		String csvFile = "D:\\APP\\Workspace\\database project 2\\src\\write.db";
		
		
		
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = "','";
		
		try{
			
			file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
			br = new BufferedReader(new FileReader(csvFile));
			while((line = br.readLine()) !=null){
				
				String [] test = line.split(csvSplitBy);
				
				
				file.writeUTF(test[0]); // write id to file
				for(int i=0; i< 5 - test[0].length(); i++){
					file.writeByte(5);
				}
				
				file.writeUTF(test[1]);//write first name to file
				for(int i=0; i< 20 - test[1].length();i++){
					file.writeByte(20);
				}
				
				file.writeUTF(test[2]);//write last name to file
				for(int i=0; i< 20 - test[2].length();i++){
					file.writeByte(20);
				}
				
				file.writeUTF(test[3]);//write company name to file
				for(int i=0; i< 40 - test[3].length();i++){
					file.writeByte(40);
				}
				
				file.writeUTF(test[4]);//write address to file
				for(int i=0; i< 50 - test[4].length();i++){
					file.writeByte(50);
				}
							
				file.writeUTF(test[5]);//write city to file
				for(int i=0; i< 20 - test[5].length();i++){
					file.writeByte(20);
				}
				
				file.writeUTF(test[6]);//write county to file
				for(int i=0; i< 20 - test[6].length();i++){
					file.writeByte(20);
				}
				
				file.writeUTF(test[7]);//write state to file
				for(int i=0; i< 5 - test[7].length();i++){
					file.writeByte(5);
				}
				
				file.writeUTF(test[8]);//write zip to file
				for(int i=0; i<5 - test[8].length();i++){
					file.writeByte(5);
				}
				
				file.writeUTF(test[9]);//write phone1 to file
				for(int i=0; i<15 - test[9].length();i++){
					file.writeByte(15);
				} 
				
				file.writeUTF(test[10]);//write phone2 to file
				for(int i=0; i<15 - test[10].length();i++){
					file.writeByte(15);
				}
				
				file.writeUTF(test[11]);
				for(int i=0; i<50 -test[11].length();i++){
					file.writeByte(50);
				}
				
				file.writeUTF(test[12]);
				for(int i=0; i<60 -test[12].length();i++){
					file.writeByte(60);
				}
				//file.writeUTF("\n");
				
				
				System.out.println(" id " + test[0] + " first name " + test[1] + " last name " + test[2] + " company name " + test[3]);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
