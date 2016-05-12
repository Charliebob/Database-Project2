package com.charliezhangsde;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class readfile {

	private static final int RECORD = 351;// last one was 51|| every record add 2 because the of NUL and EOF
	public static void main(String[] args){
		RandomAccessFile file;
		String id = null;
		String first_name = null, last_name = null;
		String company_name = null ,address = null;
		String city = null, county = null;
		String state = null, zip = null;
		String phone1 = null, phone2 = null;
		String email = null, web = null;
		Scanner sc = new Scanner(System.in);
		//String search = sc.next().toLowerCase();
		//int searchInt = sc.nextInt();
		
		//System.out.println("The id is: " + id);
		
		try{
			file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
			long FileSize = file.length();
			file.seek(0);
			long NUMRecords = FileSize/RECORD;
			for(int j=0; j<NUMRecords;j++){
				
				id = file.readUTF();//
				for(int i=0; i<5-id.length();i++){
					file.readByte();
				}
								
				first_name = file.readUTF();
				for(int i=0; i<20-first_name.length();i++){
					file.readByte();
				}
			    
				last_name = file.readUTF();
				for(int i=0; i<20-last_name.length();i++){
					file.readByte();
				}
				
				company_name = file.readUTF();
				for(int i=0; i<40-company_name.length();i++){
					file.readByte();
				}
				
				address = file.readUTF();
				for(int i=0; i<50-address.length();i++){
					file.readByte();
				}
				
				city = file.readUTF();
				for(int i=0; i<20-city.length();i++){
					file.readByte();
				}
				
				county = file.readUTF();
				for(int i=0; i<20-county.length();i++){
					file.readByte();
				}
				
				state = file.readUTF();
				for(int i=0; i<5-state.length();i++){
					file.readByte();
				}
				
				zip = file.readUTF();
				for(int i=0; i<5-zip.length();i++){
					file.readByte();
				}
				
				phone1 = file.readUTF();
				for(int i=0; i<15-phone1.length();i++){
					file.readByte();
				}
				
				phone2 = file.readUTF();
				for(int i=0;i<15-phone2.length();i++){
					file.readByte();
				}

				email = file.readUTF();
				for(int i=0; i<50-email.length();i++){
					file.readByte();
				}
				
				web = file.readUTF();
				for(int i=0; i<60-web.length();i++){
					file.readByte();
				}
				
				System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);

				
				//System.out.println(id);
				//if(search.equals(last_name))
				//if(searchInt == id){
				//	System.out.println(id + "," + first_name + "," +last_name);
					//System.out.println(NUMRecords);
				}
			//}
			System.out.println("Number of records: " + NUMRecords);
			
			
			file.close();
			
		}catch(IOException e){
			e.getStackTrace();
		}
		
	}
}
