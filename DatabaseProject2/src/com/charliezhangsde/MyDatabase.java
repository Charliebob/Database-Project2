package com.charliezhangsde;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class MyDatabase {
	private static final int RECORD = 351;
	public static void main(String[] args){
		RandomAccessFile file;
		Scanner sc = new Scanner(System.in);
		
		String id;
		String first_name, last_name, company_name, address, city, county;
		String state, zip, phone1, phone2, email, web;
		int function;
		function = 0;
		boolean found = true;
		//do a switch for different function

		while(function!=-1){
			
			System.out.println("Please select a function.\n");
			System.out.println("1. Select From Database.\n"
							 + "2. Insert Into Database.\n"
							 + "3. Modify a record From Database.\n"
							 + "4. Delete From Database.\n"							 
							 + "To Exit Please Enter -1");
			function = sc.nextInt();
			
			switch(function){
				case 1://Select
					//String first_name = null, last_name = null;
					//int id = 0;
					//Scanner sc = new Scanner(System.in);
					System.out.println("1. Select an ID number. \n"
							         + "2. Select a last name. \n"
							         + "3. Select a state. \n");
					int type;
					type=0;
					type = sc.nextInt();
					switch(type){
					
						case 1:
							
							System.out.println("Please Select an ID number: ");
							String search = sc.next().toLowerCase();
							//int searchInt = sc.nextInt();
											
							try{
								file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
								long FileSize = file.length();
								file.seek(0);
								long NUMRecords = FileSize/RECORD;
								for(int j=0; j<NUMRecords;j++){
									
									//String first_name, last_name, company_name, address, city, county;
									//String state, zip, phone1, phone2, email, web;
									
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
									
									
									//System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
									
									//if(searchInt == id){
									if(search.equals(id)){
										System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
										//System.out.println(NUMRecords);
									}else{
										found = false;
									}
								}
								
								System.out.println("Number of records: " + NUMRecords);
								
								file.close();
								
							}catch(IOException e){
								e.getStackTrace();
							}
							
							
							break;
							
							
						case 3:
							
							System.out.println("Please Select a state: ");
							String search_state = sc.next().toLowerCase();
							//int searchInt = sc.nextInt();
											
							try{
								file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
								long FileSize = file.length();
								file.seek(0);
								long NUMRecords = FileSize/RECORD;
								for(int j=0; j<NUMRecords;j++){
									
									//String first_name, last_name, company_name, address, city, county;
									//String state, zip, phone1, phone2, email, web;
									
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
									
									
									//System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
									
									//if(searchInt == id){
									file.seek(RECORD*j+189);
									//System.out.println(state);
									if(search_state.equals(state)){
										
										System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);

										//System.out.println(NUMRecords);
									}else{
										found = false;
									}
								}
								
								System.out.println("Number of records: " + NUMRecords);
								
								file.close();
								
							}catch(IOException e){
								e.getStackTrace();
							}
							
							break;
							
					}
					
					
					
					break;
					
				case 2: //Insert
					System.out.println("Please Input id: ");
					id = sc.next().toLowerCase();
					
					System.out.println("Please Input first name: ");
					first_name = sc.next().toLowerCase();
					
					System.out.println("Please Input last name: ");
					last_name = sc.next().toLowerCase();
					
					System.out.println("Please Input company name: ");
					company_name = sc.next().toLowerCase();
					
					System.out.println("Please Input address: ");
					address = sc.next().toLowerCase();
					
					System.out.println("Please Input city: ");
					city = sc.next().toLowerCase();
					
					System.out.println("Please Input county: ");
					county = sc.next().toLowerCase();
					
					System.out.println("Please Input state: ");
					state = sc.next().toLowerCase();
					
					System.out.println("Please Input zip: ");
					zip = sc.next().toLowerCase();
					
					System.out.println("Please Input phone1: ");
					phone1 = sc.next().toLowerCase();
					
					System.out.println("Please Input phone2: ");
					phone2 = sc.next().toLowerCase();
					
					System.out.println("Please Input email: ");
					email = sc.next().toLowerCase();
					
					System.out.println("Please Input web: ");
					web = sc.next().toLowerCase();
					
					try{
						file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
						long FileSize = file.length();
						file.seek(FileSize);
						
						file.writeUTF(id);
						for(int i=0; i<5-id.length();i++){
							file.writeByte(5);
						}
						
						file.writeUTF(first_name);
						for(int i=0; i<20-first_name.length();i++){
							file.writeByte(20);
						}
						file.writeUTF(last_name);
						for(int i=0; i<20-last_name.length();i++){
							file.writeByte(20);
						}
						file.writeUTF(company_name);
						for(int i=0; i<40-company_name.length();i++){
							file.writeByte(40);
						}
						file.writeUTF(address);;
						for(int i=0;i<50-address.length();i++){
							file.writeByte(50);
						}
						file.writeUTF(city);
						for(int i=0;i<20-city.length();i++){
							file.writeByte(20);
						}
						file.writeUTF(county);
						for(int i=0;i<20-county.length();i++){
							file.writeByte(20);
						}
						
						file.writeUTF(state);
						for(int i=0;i<5-state.length();i++){
							file.writeByte(5);
						}
						
						file.writeUTF(zip);
						for(int i=0;i<5-zip.length();i++){
							file.writeByte(5);
						}
						
						file.writeUTF(phone1);
						for(int i=0;i<15-phone1.length();i++){
							file.writeByte(15);
						}
						file.writeUTF(phone2);
						for(int i=0;i<15-phone2.length();i++){
							file.writeByte(15);
						}
						file.writeUTF(email);
						for(int i=0;i<50-email.length();i++){
							file.writeByte(50);
						}
						file.writeUTF(web);
						for(int i=0;i<60-web.length();i++){
							file.writeByte(60);;
						}
						//file.writeUTF("\n");
						
						//System.out.println("Number of records: " + NUMRecords);
						file.close();
						
					}catch(IOException e){
						e.getStackTrace();
					}
					
					break;
					
				case 3://Modify
					//String first_name = null, last_name = null;
					//int id = 0;
					//Scanner sc = new Scanner(System.in);
									
					System.out.println("Please Select an ID number: ");
					String modify = sc.next().toLowerCase();
					//int searchInt = sc.nextInt();
									
					try{
						file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
						long FileSize = file.length();
						file.seek(0);
						long NUMRecords = FileSize/RECORD;
						for(int j=0; j<NUMRecords;j++){
							
							//String first_name, last_name, company_name, address, city, county;
							//String state, zip, phone1, phone2, email, web;
							
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
							
							
							//System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
							
							//if(searchInt == id){
							if(modify.equals(id)){
								System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
								System.out.println(NUMRecords);
								file.seek(RECORD*j+7);
								System.out.println("Please input new first name:");
								first_name = sc.next().toLowerCase();
								
								file.writeUTF(first_name);
								for(int i=0; i<20-first_name.length();i++){
									file.writeByte(20);
								}
							}else{
								found = false;
							}
						}
						
						
						file.close();
						
					}catch(IOException e){
						e.getStackTrace();
					}
					break;
					
					
				case 4://Delete
					//String first_name = null, last_name = null;
					//int id = 0;
					//Scanner sc = new Scanner(System.in);
					
					
					System.out.println("Please Select an ID number: ");
					String delete = sc.next().toLowerCase();
					//int searchInt = sc.nextInt();
									
					try{
						file = new RandomAccessFile(new File("D:\\APP\\Workspace\\database project 2\\src\\data.db"),"rw");
						long FileSize = file.length();
						file.seek(0);
						long NUMRecords = FileSize/RECORD;
						for(int j=0; j<NUMRecords;j++){
							
							//String first_name, last_name, company_name, address, city, county;
							//String state, zip, phone1, phone2, email, web;
							
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
							
							
							//System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
							
							//if(searchInt == id){
							if(delete.equals(id)){
								System.out.println(id + " " + first_name + "\t\t" + last_name + "\t\t" + company_name + "\t\t" + address + "\t\t" + city + "\t\t" + county + "\t\t" + state + "\t\t" + zip + "\t\t" + phone1 + "\t\t" + phone2 + "\t\t" + email + "\t\t" + web);
								System.out.println(NUMRecords);
								file.seek(j*RECORD);
								file.setLength(FileSize-351);
							}else{
								found = false;
							}
						}
						
						
						file.close();
						
					}catch(IOException e){
						e.getStackTrace();
					}
					break;
										
			}		
		}
				
	}
}
