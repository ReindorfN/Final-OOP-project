    //WEEKLY PLANNER CLASS
    public class WeeklyPlanner{
		   public String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    
    public WeeklyPlanner(String days ){
        weeklyTimetable= new WeeklyPlanner[7]; 
    }

    //class methods
    public void displayWeeklyTimetable(){
	    System.out.println("Schedule for the Week");
		   for(int i=-1;i<7;i++){
				   System.out.println("Schedule for" + days[i]);
				   weeklyTimetable[i].displayDailyAppointments();
			}
	  }
	}    