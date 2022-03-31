package phase1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Project {
	public static void main(String[] args) throws IOException {
		
	//Application name and the developer details 	
		System.out.println("                   LOCKER'S PVT LTD                    " + '\n'+"--------------------------------------------------------" + '\n' + "Developed by AJITH KUMAR"+'\n'+"----------------------------");
		
	//details of the user interface such as options displaying the user interaction information 	
		try (Scanner s = new Scanner(System.in)){
		while(true){
			System.out.println("ENTER YOUR CHOICE :" + '\n' + "1.View files" + '\n' + "2.perform operations" + '\n' + "3.exit");			

	//to select one of the options listed
			int choice=s.nextInt();
			
		switch(choice) {	
         	// to display the list of files in ascending order
			case 1:  {
				File fileDir = new File("D:\\simplilearn");
				List<String> listFile = Arrays.asList(fileDir.list());
				Collections.sort(listFile);
				System.out.println(" SORTING FILE NAMES IN ASCENDING ORDER");
				System.out.println("---------------------------------------");
				    for(String ff:listFile){
					System.out.println(ff);
				}
				}
			break;	
		
			
			//to perform file operations			
			case 2:  {	
			String path="D:\\simplilearn\\";
		    try (Scanner sc = new Scanner(System.in)) {
		    	ArrayList<String> al=new ArrayList<>();	
		    	while(true)
			 {
				System.out.println("ENTER NAME OF THE OPERATION :" +'\n' + "Add" +'\n'+  "Delete" +'\n'+  "Search" + '\n' + "back");
				String fileoperations=sc.next();
                  switch(fileoperations) {
                         
                       //to Add a file to the existing directory list
			           case "add":
			           case "Add":
					        System.out.println("enter the adding file name");
					        String fileadd=sc.next();
					        String finalfile=path+fileadd;
					        File a=new File(finalfile);					
					        boolean res=a.createNewFile();
					           if(res==false) {
						          System.out.println("file not created");
				                }
					           else {
						          al.add(fileoperations);
						           System.out.println("file is created");
				                }
	     	          break;
					
			             //to Delete a user specified file from the existing directory list
			          case "delete":	
			          case "Delete":
					       System.out.println("enter the deleting file name");
					       String filedel=sc.next();
					       String del=path+filedel;
					       File b=new File(del);
					       if(b.delete()) {
					           System.out.println("file is successfully deleted");
					          }
					       else {
					           System.out.println("file name not exists");	
					          }
			         break;
				
				
				      //to Search a user specified file from the main directory
			         case  "search":
			         case  "Search":
					
					      System.out.println("Enter the name of the file");
					      String filesearch=sc.next();
					      File c=new File(path);
					      File filen[]=c.listFiles();
					      int flag=0;
					      for(File ff:filen) {
						      if(ff.getName().equals(filesearch)) {
							      flag=1;
						  break;
						     }
						      else {
							      flag=0;
						     }
					      }
					         if(flag==1) {
						         System.out.println("file is found");
					         }
					         else {
						         System.out.println("file is not found");
					         }	
					 break;	
					 
			         case "back":
			         case "Back":			        
			        	System.exit(0);
			         break;	 
				default:System.out.println("Enter the correct option");
			         break;	 
                  }       
			         		
			          
			}		
			
		}
}
			// to close the application
			case 3:System.exit(0);
            break;
            
            
            default:System.out.println("check the option and retry");
            break;	
}
		}
	}
}}
	



