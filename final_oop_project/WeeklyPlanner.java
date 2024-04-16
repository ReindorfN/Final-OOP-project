package final_oop_project;

public class WeeklyPlanner {
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private DailyPlanner[] weeklyTimetable = new DailyPlanner[7]; 

    public WeeklyPlanner() {
        for (int i = 0; i < weeklyTimetable.length; i++) {
            weeklyTimetable[i] = new DailyPlanner();
        }
    }

    public void displayWeeklyTimetable() {
	    try {
            System.out.println("Schedule for the week:");
            for (int i = 0; i < days.length; i++) {
                System.out.println("Schedule for " + days[i] + ":");
                if (weeklyTimetable[i] != null) {
                    weeklyTimetable[i].displayTimetable(); // Check if the element is not null before calling the method
                } else {
                    System.out.println("No appointments scheduled for " + days[i]);
                }
                //weeklyTimetable[i].displayTimetable(); // There's no method displaydailyappointments
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array index is out of bounds");
        }
    }
}
