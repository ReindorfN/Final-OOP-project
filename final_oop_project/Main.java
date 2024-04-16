package final_oop_project;

import java.util.Scanner;

//MAIN PROGRAM

public class Main{
	public static void main(String args[], String studentName){

		DailyPlanner weeklyPlanner = new DailyPlanner();
		Student currentStudent= new Student("Maame",54552026,"MIS","abc123",weeklyPlanner);
		Student name = currentStudent;

		if(currentStudent.passwordChecker()){
			while(true){
				System.out.println("Welcome"+ name + "to your Planner"); 
 			  	System.out.println("Enter a number to continue");
    				System.out.println("1) View your planner for the week");
    				System.out.println("2) Add an event");
   		 		System.out.println("3) Reschedule an event");
    				System.out.println("4) Cancel an event");

    				Scanner input = new Scanner(System.in);
    				int menu = input.nextInt();
      
    				//Switch Loop to run menu selcetion 	
				switch(menu){
	    				case 1:
		    				weeklyPlanner.displayTimetable();
						break;
	    				case 2:
		   				 System.out.println("ADD AN EVENT");
						 System.out.println("What type of event are you adding?");
						 break;

			    		case 3:
		    				System.out.println("RESCHEDULE AN EVENT");
		    				System.out.println("What type of event are you adding?");
						break;
	      
	    				case 4:
	      					System.out.println("CANCEL AN EVENT");
						break;
	      
	   		 		default:
		    				System.out.println("Please select an option that is included in this list");
						break;
      				}	
					input.close(); 
			}	
		}
	}
}

