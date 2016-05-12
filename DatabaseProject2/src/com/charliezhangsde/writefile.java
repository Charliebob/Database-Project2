package com.charliezhangsde;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class writefile {

	public static void main(String[] args){
		RandomAccessFile file;
		Scanner sc = new Scanner(System.in);
		
		String first_name, last_name;
		int id;
		
		System.out.println("Please Input id: ");
		id = sc.nextInt();
		System.out.println("Please Input first name: ");
		first_name = sc.next().toLowerCase();
		System.out.println("Please Input last name: ");
		last_name = sc.next().toLowerCase();
		
		try{
			
			file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\write.db"),"rw");
			long FileSize = file.length();
			file.seek(FileSize);
			file.writeInt(id);
			file.writeUTF(first_name);
			for(int i=0; i<20 - first_name.length(); i++){
				file.writeByte(20);
			}
			file.writeUTF(last_name);
			for(int i=0; i<20 - last_name.length(); i++){
				file.writeByte(20);
			}
			//file.writeUTF("\n");
			
			file.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}
	}
}
