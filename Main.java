	//MAIN PROGRAM
public static void main(String args[]){
	
	//Yet to place program in while loop to save progress
	WeeklyPlanner ashesiPlanner=new WeeklyPlanner();
	studentName=WeeklyAppySchedule.getStudentName();
			
	System.out.println("Welcome to your Planner");
    System.out.println("Enter a number to continue");
    System.out.println("1) View your planner for the week");
    System.out.println("2) Add an event");
    System.out.println("3) Reschedule an event");
    System.out.println("4) Cancel an event");

    Scanner input=new Scanner(System.in);
    int menu=input.nextInt();
      
    //Switch Loop to run menu selcetion
    switch(menu){
	    case 1:
		    ashesiPlanner.displayWeeklyPlanner();
	      
	    case 2:
		    System.out.println("ADD AN EVENT");
			System.out.println("What type of event are you adding?");

  
	      
	    case 3:
		    System.out.println("RESCHEDULE AN EVENT");
		    System.out.println("What type of event are you adding?");
	      
	    case 4:
	      	System.out.println("CANCEL AN EVENT");
	      
	    default:
		    System.out.println("Please select an option that is included in this list");
      
      }	  
	
	}