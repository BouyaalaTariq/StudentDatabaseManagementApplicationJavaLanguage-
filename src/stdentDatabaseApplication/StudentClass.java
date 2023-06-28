package stdentDatabaseApplication;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StudentClass {
	
	private String firstname;
	private String lastname;
	private int gradYear;
	private int id;
	private int titutionBalance;
	private int costOfCourses=600;
	private String[] courses = {"1-History\n", "2-Mathematic\n", "3-English\n", "4-Chemmistry\n", "5-Computer Science\n", "6-QUIT\n"};
	private int ResttitutionBalance;
	int input;
Random random = new Random();
Scanner scan=new Scanner(System.in);
	

// Add choices on ArrayList 
ArrayList<Integer> selectedCourses=new ArrayList<>();


// Student Information 

    public void studentInfo() {
	
    	System.out.println("\n Please enter your FirstName\n ");
    	this.firstname=scan.nextLine();
    	
    	System.out.println("\n Please enter your LastName\n ");
    	this.lastname=scan.nextLine();
    	
    	
    	do {
    		
        	System.out.println("\n Enter Your Grad Level\n ");
        	System.out.println("\n 1.non Experience\n 2.Starter\n 3.Junior\n 4.Expert\n");
        	gradYear=scan.nextInt();
        	
    	}while(gradYear!=1 && gradYear!=2 && gradYear!=3 && gradYear!=4);
    	
    	
    	//Generate ID Usng Random Methode 
    	
    	id=random.nextInt(9999);
    	
    	
		System.out.println("Your ID is  \n");							
		 System.out.println(gradYear+""+id);
            }

	
//Enrole in Courses 
    
 public void courses() {

	 
  // enter the balance More than 600.
	 int input;
	System.out.println("\n please enter ur budget ");
		 titutionBalance=scan.nextInt();
		//  check alance if it's more than 600
		 if(titutionBalance<600) {
			 
			 do {
			 System.out.println(" u should enter a balance more than 600  Dollars \n ");
			 System.out.println(" \n please enter ur budget ");
			 
			 titutionBalance=scan.nextInt();
			 
			 }while(titutionBalance<600);
			 
		 }else System.out.println("\n  Thank You the balance u enter is "+ titutionBalance);;
		
		 // every course cost 600 , so here we will check number of courses allowed 
		 int maxChoices=titutionBalance/600;
		 
		 System.out.println("\n u can choose  "+maxChoices+" courses");
		
		 // list of courses u checked 
		 
		 do {
			 
		 System.out.println("\n  Please choose courses u want to enroll\n ");
		 
	
			
		 // it's to show courses 
		 for (String courseChoices : courses) {
		        System.out.println(courseChoices);
		       
		         
		    }
		
		 input=scan.nextInt();
		 
		 // we gonna control the number of courses to select 
		 maxChoices=maxChoices-1;
		 titutionBalance=titutionBalance-600;
		 
		 System.out.println("\n u still have " +maxChoices+"  Choices");
			
		 
		 // check if the course is already selected 
	        if(selectedCourses.contains(input)) { 
	        	
	        	System.out.println("\n Alert !!!   You have already chosen that course.\n ");
	        	maxChoices=maxChoices+1;
	        	titutionBalance=titutionBalance+600;
	        	
	        }else {
	    	
	     // to add the selection into a table in case the client choose again the same course .
	        selectedCourses.add(input);
	        }
	      //View Balance 
	        
	        
	       
	        
	        System.out.println("\n u still Have  " + titutionBalance + "   Dollars and Max Choices still Have are " + maxChoices + "\n ");
	        
	   
	 }while(input!=6 && maxChoices!=0);
	 
	
		 
			// Show statuts 
		 System.out.println(" Hello  " +firstname + " " +lastname );
		 System.out.println("\n so u choose "  );
	
	if(selectedCourses.contains(1)) {System.out.println(" \n History ");}
	if(selectedCourses.contains(2)) {System.out.println(" \n Mathematic ");}
	if(selectedCourses.contains(3)) {System.out.println(" \n English");}
	if(selectedCourses.contains(4)) {System.out.println(" \n Chemmistry ");}
	if(selectedCourses.contains(5)) {System.out.println(" \n Computer Science");}
	
	System.out.println("\n u still Have  " + titutionBalance + "Dollars and Max Choices still Have are " + maxChoices);
	
 }
     
}
